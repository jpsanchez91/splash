package com.splash.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.splash.entity.EmailEntity;

@RepositoryRestResource(collectionResourceRel = "email", path = "email")
public interface EmailRepository extends MongoRepository<EmailEntity, String> {

	List<EmailEntity> findAll();

}
