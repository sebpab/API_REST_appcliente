package com.sebastianpabon.app_client.services;


import com.sebastianpabon.app_client.models.ClienteModel;
import com.sebastianpabon.app_client.repositories.ClienteRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {
	
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	//CREATE, UPDATE
	
	
	public ClienteModel guardarCliente(ClienteModel cliente) {
		
		return clienteRepository.save(cliente);		
		
	}
	
	//READ
	
	public Optional<ClienteModel> obternerPorId(long id){
		
		return clienteRepository.findById(id);
		
	}
	
	//READ
	
	public ArrayList<ClienteModel> obtenerClientes(){
		
		return (ArrayList<ClienteModel>) clienteRepository.findAll();
		
		
	}
	
	
	//DELETE
	
	public boolean eliminarCliente(long id) {
		
		try {			
			clienteRepository.deleteById(id);
			return true;
			
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
				
	}
	
	
	
	

}
