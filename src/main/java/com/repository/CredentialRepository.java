package com.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import com.models.Credential;

@Repository
public interface CredentialRepository extends MongoRepository<Credential, String> 
{
    ArrayList<Credential> findByUsername(String username);

    @Query("{'username' : :#{#username}, 'websiteUrl' : :#{#websiteUrl}}")
    Credential findCredentials(@Param("username") String username, @Param("websiteUrl") String websiteUrl);
}
