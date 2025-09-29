package com.udea.CourierSync.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.CourierSync.repository.ClientRepository;
import com.udea.CourierSync.mapper.ClientMapper;
import com.udea.CourierSync.DTO.ClientDTO;
import com.udea.CourierSync.entity.Client;

import java.util.List;
import java.util.Optional;
import com.udea.CourierSync.exception.BadRequestException;
import com.udea.CourierSync.exception.ResourceNotFoundException;

@Service
public class ClientService {

  @Autowired
  private ClientRepository clientRepository;

  @Autowired
  private ClientMapper clientMapper;

  public ClientDTO createClient(ClientDTO dto) {
    if (dto == null)
      throw new BadRequestException("ClientDTO must not be null");
    Client entity = clientMapper.toEntity(dto);
    Client saved = clientRepository.save(entity);
    return clientMapper.toDTO(saved);
  }

  public Optional<ClientDTO> findById(Long id) {
    return clientRepository.findById(id).map(clientMapper::toDTO);
  }

  public List<ClientDTO> findAll() {
    return clientRepository.findAll().stream().map(clientMapper::toDTO).toList();
  }

  public ClientDTO update(Long id, ClientDTO dto) {
    if (dto == null)
      throw new BadRequestException("ClientDTO must not be null");
    clientRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Client not found with id: " + id));
    Client toSave = clientMapper.toEntity(dto);
    toSave.setId(id);
    Client saved = clientRepository.save(toSave);
    return clientMapper.toDTO(saved);
  }

  public void deleteById(Long id) {
    if (!clientRepository.existsById(id)) {
      throw new ResourceNotFoundException("Client not found with id: " + id);
    }
    clientRepository.deleteById(id);
  }
}
