package com.formularioNetflix.datos_form_netflix.DTO;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class FormularioDTO {
	//Datos clientes
	public String nombre;
	public String apellidos;
	public LocalDate fechaNacimiento;
	public String genero;
	public String nacionalidad;
	public String tipoIdentificacion;
	public String numeroIdentificacion;
	public String estadoCivil;
    //Datos cliente contacto
    public DatosContactoDTO contacto;
    
    //Datos direccion
    public DireccionDTO direccion;
    
    //Datos Suscripcion
    public String producto_principal;
    //Suscripcion secundarios
    private List<String> productosSecundarios;
    
    //Datos metodo pago
    public MetodoPagoDTO pago;
    
    //Datos bancarios
    public DatosBancariosDTO banco;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
    
}
