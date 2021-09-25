package com.sebastianpabon.app_client.services;


import com.sebastianpabon.app_client.models.VentaModel;
import com.sebastianpabon.app_client.repositories.VentaRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VentaService {
	
	
	@Autowired
	VentaRepository ventaRepository;
	
	
	//CREATE, UPDATE
	
	
	public VentaModel guardarVenta(VentaModel venta) {
		
		return ventaRepository.save(venta);		
		
	}
	
	//READ
	
	public Optional<VentaModel> obternerPorId(long id){
		
		return ventaRepository.findById(id);
		
	}
	
	//READ
	
	public ArrayList<VentaModel> obtenerVentas(){
		
		return (ArrayList<VentaModel>) ventaRepository.findAll();
		
		
	}
	
	//DELETE
	
	public boolean eliminarVenta(long id) {
		
		try {			
			ventaRepository.deleteById(id);
			return true;
			
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
				
	}
	
	
	
	

}

