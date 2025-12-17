package com.formularioNetflix.datos_form_netflix.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formularioNetflix.datos_form_netflix.DTO.FormularioDTO;
import com.formularioNetflix.datos_form_netflix.entity.Cliente;
import com.formularioNetflix.datos_form_netflix.entity.Direccion;
import com.formularioNetflix.datos_form_netflix.entity.Pago;
import com.formularioNetflix.datos_form_netflix.entity.Suscripcion;
import com.formularioNetflix.datos_form_netflix.repository.ClienteRepository;
import com.formularioNetflix.datos_form_netflix.repository.SuscripcionRepository;

@Service
public class FormularioService {
	 @Autowired private ClienteRepository clienterepo;
	 @Autowired private SuscripcionRepository suscripcionrepo;
	 @Autowired private FormularioDTO form;
	 public Cliente guardarFormulario(FormularioDTO dto) {
		//Datos del cliente
		 Cliente c=new Cliente();
		 c.setNombre(dto.getNombre());
		 c.setApellidos(dto.getApellidos());
		 c.setFechaNacimiento(dto.getFechaNacimiento());
		 c.setGenero(dto.getGenero());
		 c.setNacionalidad(dto.getNacionalidad());
		 c.setTipoIdentificacion(dto.getTipoIdentificacion());
		 c.setNumeroIdentificacion(dto.getNumeroIdentificacion());
		 c.setEstadoCivil(dto.getEstadoCivil());
		 
		 
		
		 
	 }	
}
