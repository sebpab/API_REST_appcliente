package com.sebastianpabon.app_client.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")

public class ClienteModel {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nombre;
	private String email;
	private String telefono;
	
	
	public ClienteModel() {
	}


	public ClienteModel(long id, String nombre, String email, String telefono) {
	
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ClienteModel id(long id){
		
		setId(id);
		return this;
		
	}
	
	
	public ClienteModel nombre(String nombre){
		
		setNombre(nombre);
		return this;
		
	}
	
	
	public ClienteModel email(String email){
		
		setEmail(email);
		return this;
		
	}
	
	
	public ClienteModel telefono(String telefono){
		
		setTelefono(telefono);
		return this;
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, id, nombre, telefono);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteModel other = (ClienteModel) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono);
	}


	@Override
	public String toString() {
		return "ClienteModel [id=" + id + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + "]";
	}
	
	
	

}
