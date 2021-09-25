package com.sebastianpabon.app_client.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebastianpabon.app_client.models.ProductoModel;
import com.sebastianpabon.app_client.services.ProductoService;

@RestController

@RequestMapping("/productos")

public class ProductoController {
	
	
	@Autowired
	public ProductoService productoService;
	
	
	@GetMapping
	public ArrayList<ProductoModel> obtenerProductos(){
		
		return productoService.obtenerProductos();
		
	}
	
	@PostMapping
	public ProductoModel crearProducto(@RequestBody ProductoModel producto) {
		return productoService.guardarProducto(producto);
		
	}
	
	@GetMapping(path={"{id}"})
	public Optional<ProductoModel> obtenerporId(@PathVariable("id") long id) {
		return productoService.obternerPorId(id);
		
	}
	
	
	@DeleteMapping(path={"{id}"})
	public String borrarProducto(@PathVariable("id") long id) {
		
		boolean eliminado = productoService.eliminarProducto(id);
		
		if(eliminado) return "Producto eliminado";
		else return "Error eliminando producto";
		
	}
	

}
