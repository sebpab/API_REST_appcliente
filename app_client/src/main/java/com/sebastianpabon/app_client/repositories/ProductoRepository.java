package com.sebastianpabon.app_client.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sebastianpabon.app_client.models.ProductoModel;



public interface ProductoRepository extends CrudRepository<ProductoModel, Long> {

}
