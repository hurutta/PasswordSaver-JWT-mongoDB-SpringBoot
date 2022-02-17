package com.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.models.Credential;

@Repository
public interface CredentialRepository extends MongoRepository<Credential, String> 
{
    ArrayList<Credential> findByUsername(String username);
}
