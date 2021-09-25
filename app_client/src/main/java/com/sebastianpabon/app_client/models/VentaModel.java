package com.sebastianpabon.app_client.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="ventas")


public class VentaModel {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private ClienteModel cliente;
	
	@ManyToMany(cascade=CascadeType.MERGE)
	@JoinTable(name="venta_productos",
			joinColumns = @JoinColumn(name = "producto_id", referencedColumnName="id"),   
			inverseJoinColumns = @JoinColumn(name="venta_id", referencedColumnName="id"))
	private List<ProductoModel> productos;
	
	

	public VentaModel() {
		
	}



	public VentaModel(long id, ClienteModel cliente, List<ProductoModel> productos) {
		
		this.id = id;
		this.cliente = cliente;
		this.productos = productos;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public ClienteModel getCliente() {
		return cliente;
	}



	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}



	public List<ProductoModel> getProductos() {
		return productos;
	}



	public void setProductos(List<ProductoModel> productos) {
		this.productos = productos;
	}
	
	
	public VentaModel id(long id) {
		setId(id);
		return this;		
	}
	
	
	public VentaModel cliente(ClienteModel cliente) {
		setCliente(cliente);
		return this;		
	}
	
	
	public VentaModel productos(List<ProductoModel> productos) {
		setProductos(productos);
		return this;		
	}



	@Override
	public int hashCode() {
		return Objects.hash(cliente, id, productos);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VentaModel other = (VentaModel) obj;
		return Objects.equals(cliente, other.cliente) && id == other.id && Objects.equals(productos, other.productos);
	}



	@Override
	public String toString() {
		return "VentaModel [id=" + id + ", cliente=" + cliente + ", productos=" + productos + "]";
	}
	
	
	
	

}
