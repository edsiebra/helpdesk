package com.edson.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edson.helpdesk.domain.Chamado;
import com.edson.helpdesk.domain.Cliente;
import com.edson.helpdesk.domain.Tecnico;
import com.edson.helpdesk.domain.enums.Perfil;
import com.edson.helpdesk.domain.enums.Prioridade;
import com.edson.helpdesk.domain.enums.Status;
import com.edson.helpdesk.repositories.ChamadoRepository;
import com.edson.helpdesk.repositories.ClienteRepository;
import com.edson.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired 
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "31218973811", "valdir@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "68568074570", "torvalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
