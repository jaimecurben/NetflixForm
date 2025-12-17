package com.formularioNetflix.datos_form_netflix.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formularioNetflix.datos_form_netflix.DTO.FormularioDTO;
import com.formularioNetflix.datos_form_netflix.entity.Cliente;
import com.formularioNetflix.datos_form_netflix.service.FormularioService;
import com.formularioNetflix.datos_form_netflix.validator.NetflixValidator;

@RestController
@RequestMapping("/api/formulario")
public class FormularioController {

	@Autowired
	NetflixValidator validator;
	
	@Autowired
	private FormularioService service;
	
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody FormularioDTO dto, Errors errors){
		validator.validate(dto, errors);
		if(!errors.hasErrors()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors.getAllErrors());
		}
		Cliente guardado= service.guardarFormulario(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("id",guardado.getId()));
	}
		
}
