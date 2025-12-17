package com.formularioNetflix.datos_form_netflix.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.formularioNetflix.datos_form_netflix.DTO.FormularioDTO;

@Component
public class NetflixValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		FormularioDTO formulario_a_validar=(FormularioDTO) target;
		
		if(formulario_a_validar.getNombre().isBlank()) {
			errors.rejectValue("datosPersonales.nombre", "i18n.formulario.nombre.formato","El campo es obligatorio");
		}

	}

}
