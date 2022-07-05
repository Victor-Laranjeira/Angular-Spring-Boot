package com.github.victorlaranjeira.clientes.model.repository;

import com.github.victorlaranjeira.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
