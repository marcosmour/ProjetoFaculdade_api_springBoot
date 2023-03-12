package com.projetoeniac.projetofaculdade.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoeniac.projetofaculdade.model.RegistroPonto;
import com.projetoeniac.projetofaculdade.model.repository.RegistroPontoRepository;

@RestController
@RequestMapping("/registro/ponto")
public class RegistroPontoController {

	@Autowired
	private RegistroPontoRepository registroPontoRepository;
	
	@GetMapping
	public List<RegistroPonto> verificarRegistro() {
		return registroPontoRepository.findAll();
	}
	
	@PostMapping
	public RegistroPonto registrarPonto(@RequestBody RegistroPonto registro) {
		registro.setDataRegistroPonto(LocalDateTime.now(ZoneId.of("UTC")));// PARA SETAR O HORARIO DE REGISTRO DO POST
		return registroPontoRepository.save(registro);
	}
}
