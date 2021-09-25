package com.sebastianpabon.app_client.repositories;

 

import org.springframework.data.repository.CrudRepository;

import com.sebastianpabon.app_client.models.ClienteModel;


public interface ClienteRepository extends CrudRepository<ClienteModel, Long>{

}
