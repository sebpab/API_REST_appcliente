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

import com.sebastianpabon.app_client.models.VentaModel;
import com.sebastianpabon.app_client.services.VentaService;

@RestController

@RequestMapping("/ventas")

public class VentaController {
	
	
	@Autowired
	public VentaService ventaService;
	
	
	@GetMapping
	public ArrayList<VentaModel> obtenerVentas(){
		
		return ventaService.obtenerVentas();
		
	}
	
	@PostMapping
	public VentaModel crearVenta(@RequestBody VentaModel venta) {
		return ventaService.guardarVenta(venta);
		
	}
	
	@GetMapping(path={"{id}"})
	public Optional<VentaModel> obtenerporId(@PathVariable("id") long id) {
		return ventaService.obternerPorId(id);
		
	}
	
	
	@DeleteMapping(path={"{id}"})
	public String borrarVenta(@PathVariable("id") long id) {
		
		boolean eliminado = ventaService.eliminarVenta(id);
		
		if(eliminado) return "Venta eliminada";
		else return "Error eliminando venta";
		
	}
	

}