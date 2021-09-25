package com.sebastianpabon.app_client.services;



import com.sebastianpabon.app_client.models.ProductoModel;
import com.sebastianpabon.app_client.repositories.ProductoRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoService {
	
	
	@Autowired
	ProductoRepository productoRepository;
	
	
	//CREATE, UPDATE
	
	
	public ProductoModel guardarProducto(ProductoModel producto) {
		
		return productoRepository.save(producto);		
		
	}
	
	
	//READ
	
	public Optional<ProductoModel> obternerPorId(long id){
		
		return productoRepository.findById(id);
		
	}
	
	//READ
	
	public ArrayList<ProductoModel> obtenerProductos(){
		
		return (ArrayList<ProductoModel>) productoRepository.findAll();
		
		
	}
	
	//DELETE
	
	public boolean eliminarProducto(long id) {
		
		try {			
			productoRepository.deleteById(id);
			return true;
			
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
				
	}
	
	
	
	

}
