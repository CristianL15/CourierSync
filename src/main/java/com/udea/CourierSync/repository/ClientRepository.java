package com.udea.CourierSync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.udea.CourierSync.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
  java.util.Optional<Client> findByEmail(String email);
}