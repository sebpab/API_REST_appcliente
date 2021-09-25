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

import com.sebastianpabon.app_client.models.ClienteModel;
import com.sebastianpabon.app_client.services.ClienteService;

@RestController

@RequestMapping("/clientes")

public class ClienteController {
	
	
	@Autowired
	public ClienteService clienteService;
	
	
	@GetMapping
	public ArrayList<ClienteModel> obtenerClientes(){
		
		return clienteService.obtenerClientes();
		
	}
	
	@PostMapping
	public ClienteModel crearCliente(@RequestBody ClienteModel cliente) {
		return clienteService.guardarCliente(cliente);
		
	}
	
	@GetMapping(path={"{id}"})
	public Optional<ClienteModel> obtenerporId(@PathVariable("id") long id) {
		return clienteService.obternerPorId(id);
		
	}
	
	
	@DeleteMapping(path={"{id}"})
	public String borrarCliente(@PathVariable("id") long id) {
		
		boolean eliminado = clienteService.eliminarCliente(id);
		
		if(eliminado) return "Cliente eliminado";
		else return "Error eliminando cliente";
		
	}
	

}
