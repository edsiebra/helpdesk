package com.edson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edson.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
