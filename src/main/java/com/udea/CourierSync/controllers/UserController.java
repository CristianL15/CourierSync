package com.udea.CourierSync.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.udea.CourierSync.services.UserService;
import com.udea.CourierSync.DTO.UserDTO;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired
  private UserService userService;

  @CrossOrigin
  @PostMapping
  public ResponseEntity<UserDTO> create(@RequestBody UserDTO dto) {
    UserDTO created = userService.create(dto);
    return ResponseEntity.status(HttpStatus.CREATED).body(created);
  }

  @GetMapping
  public List<UserDTO> list() {
    return userService.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<UserDTO> get(@PathVariable Long id) {
    return userService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }

  @CrossOrigin
  @PutMapping("/{id}")
  public ResponseEntity<UserDTO> update(@PathVariable Long id, @RequestBody UserDTO dto) {
    UserDTO updated = userService.update(id, dto);
    return ResponseEntity.ok(updated);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    userService.deleteById(id);
    return ResponseEntity.noContent().build();
  }
}
