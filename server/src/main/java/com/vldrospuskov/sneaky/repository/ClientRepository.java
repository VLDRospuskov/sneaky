package com.vldrospuskov.sneaky.repository;

import com.vldrospuskov.sneaky.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
