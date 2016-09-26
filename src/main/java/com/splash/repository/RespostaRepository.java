package com.splash.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.splash.entity.RespostaEntity;

@RepositoryRestResource(collectionResourceRel = "resposta", path = "resposta")
public interface RespostaRepository extends MongoRepository<RespostaEntity, String>  {
	
	List<RespostaEntity> findAll();

}
