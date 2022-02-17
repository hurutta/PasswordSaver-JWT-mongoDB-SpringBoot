package com.security.services;

import com.repository.CredentialRepository;

import java.util.ArrayList;
import java.util.List;

import com.models.Credential;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl
{
    @Autowired
    public CredentialRepository credentialRepository;


    public UserServiceImpl(CredentialRepository credentialRepository)
    {
        this.credentialRepository = credentialRepository;
    }

    
    public ArrayList<Credential> getAllCredentials(String username)
    {
        return credentialRepository.findByUsername(username);
    }


    public Credential addNewCredential(Credential credential) 
    {
        return credentialRepository.insert(credential);
    }


    public void removeCredential(Credential credential) 
    {
        credentialRepository.delete(credential);
    }


    public void updateCredential(Credential credential) 
    {
        credentialRepository.save(credential);
    }
    
}