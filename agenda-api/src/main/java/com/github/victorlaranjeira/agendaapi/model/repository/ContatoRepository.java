package com.github.victorlaranjeira.agendaapi.model.repository;

import com.github.victorlaranjeira.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
