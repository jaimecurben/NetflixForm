package com.formularioNetflix.datos_form_netflix.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "suscripcion")
public class Suscripcion {

	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
	private String producto_principal;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")  // crea la FK en la tabla suscripcion
	private Cliente cliente;

	@ElementCollection
    @CollectionTable(
        name = "suscripcion_secundarios",
        joinColumns = @JoinColumn(name = "suscripcion_id")
    )
	@Column(name = "producto")
	private Set<String> productosSecundarios = new HashSet<>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProducto_principal() {
		return producto_principal;
	}

	public void setProducto_principal(String producto_principal) {
		this.producto_principal = producto_principal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<String> getProductosSecundarios() {
		return productosSecundarios;
	}

	public void setProductosSecundarios(Set<String> productosSecundarios) {
		this.productosSecundarios = productosSecundarios;
	}
	
	
}
