package com.sebastianpabon.app_client.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")



public class ProductoModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;
	@Column(unique=true, nullable=false)
	private String nombre;
	private long codigo;
	private float precio;
	
	
	public ProductoModel() {
		
	}


	public ProductoModel(long id, String nombre, long codigo, float precio) {
		
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
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


	public long getCodigo() {
		return codigo;
	}


	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	public ProductoModel id(long id){
		
		setId(id);
		return this;
		
	}
	
	
	public ProductoModel nombre(String nombre){
		
		setNombre(nombre);
		return this;
		
	}
	
	
	public ProductoModel codigo(long codigo){
		
		setCodigo(codigo);
		return this;
		
	}
	
	
	public ProductoModel precio(float precio){
		
		setPrecio(precio);
		return this;
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo, id, nombre, precio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoModel other = (ProductoModel) obj;
		return codigo == other.codigo && id == other.id && Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(precio) == Float.floatToIntBits(other.precio);
	}


	@Override
	public String toString() {
		return "ProductoModel [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + "]";
	}
	
	
		

}
