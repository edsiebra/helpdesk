package com.edson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edson.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
