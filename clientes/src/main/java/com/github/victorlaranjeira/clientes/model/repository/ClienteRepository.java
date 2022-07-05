package com.github.victorlaranjeira.clientes.model.repository;

import com.github.victorlaranjeira.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
