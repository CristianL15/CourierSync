package com.udea.CourierSync.repository;

import com.udea.CourierSync.entity.User;
import com.udea.CourierSync.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  java.util.Optional<User> findByEmail(String email);

  java.util.Optional<User> findByRole(UserRole role);
}