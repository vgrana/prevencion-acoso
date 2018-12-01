package ar.edu.unqsarmiento.ingsw.prevencionacoso.modelo;

import javax.persistence.Entity;

import org.hibernate.annotations.Type;

@Entity
public class Telefono extends Persistible {
	private String nombre;
	@Type(type="text")
	private String descripcion;
	private String numero;
	
	public String getLink() {
		return "tel://" + numero;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
