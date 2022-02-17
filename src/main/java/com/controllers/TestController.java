package com.controllers;

import java.util.ArrayList;

import com.models.Credential;
import com.security.services.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.core.Authentication;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController 
{

	@Autowired
    public UserServiceImpl userServiceImpl;


	@GetMapping("/all2")
	public String allAccess() 
	{
		return "Public Content.";
	}
	
	@GetMapping("/all")
	@PreAuthorize("isFullyAuthenticated()")
	public ArrayList<Credential> getAllCredentials(Authentication authentication) 
	{
		System.out.println(authentication.getName());
		return userServiceImpl.getAllCredentials(authentication.getName());
	}

	@PostMapping("/add")
	@PreAuthorize("isFullyAuthenticated()")
	public Credential addNewCredential(Authentication authentication,@RequestBody Credential credential) 
	{
		credential.setUsername(authentication.getName());
		return userServiceImpl.addNewCredential(credential);
	}

	@DeleteMapping("/remove")
	@PreAuthorize("isFullyAuthenticated()")
	public void removeCredential(Authentication authentication,@RequestBody Credential credential) 
	{
		userServiceImpl.removeCredential(credential);
	}

	@PutMapping("/update")
	@PreAuthorize("isFullyAuthenticated()")
	public void updateCredential(Authentication authentication,@RequestBody Credential credential) 
	{
		credential.setUsername(authentication.getName());
		userServiceImpl.updateCredential(credential);
	}
	

}
