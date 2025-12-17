package com.formularioNetflix.datos_form_netflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formularioNetflix.datos_form_netflix.entity.Suscripcion;
@Repository
public interface SuscripcionRepository  extends JpaRepository<Suscripcion, Long>{
	
}
