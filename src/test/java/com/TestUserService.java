package com;

import static org.mockito.Mockito.when;

import java.util.ArrayList;

import com.models.Credential;
import com.repository.CredentialRepository;
import com.security.services.UserServiceImpl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestUserService 
{
    @InjectMocks
    UserServiceImpl userServiceImpl;

    @Mock
    CredentialRepository credentialRepository;

    @Test
    public void getAllCredentialTest() 
    {
        ArrayList<Credential>arrayList = new ArrayList<Credential>();
        Credential credential1 = new Credential("Jawad", "facebook", "123456");
        Credential credential2 = new Credential("Jawad", "twiiter", "rt45a4");
        Credential credential3 = new Credential("Jawad", "instagram", "g56h67");

        arrayList.add(credential1);
        arrayList.add(credential2);
        arrayList.add(credential3);

        when(credentialRepository.findByUsername("Jawad")).thenReturn(arrayList);
        Assert.assertEquals(userServiceImpl.getAllCredentials("Jawad"), arrayList);
    }

    @Test
    public void addNewCredential() 
    {
        Credential credential1 = new Credential("Jawad", "facebook", "123456");
        when(credentialRepository.insert(credential1)).thenReturn(credential1);
        Assert.assertEquals(userServiceImpl.addNewCredential(credential1), credential1);
    }

    @Test
    public void updateNewCredential() 
    {
        Credential credential1 = new Credential("Jawad", "facebook", "123456");
        Credential credential2 = new Credential("Jawad", "facebook", "ABCDEF");

       // when(credentialRepository.save(credential2)).thenReturn(credential2);
        when(credentialRepository.findCredentials("Jawad","facebook")).thenReturn(credential1);
        Credential returnedCredential = userServiceImpl.updateCredential(credential2);
        
        Assert.assertEquals(returnedCredential.getUsername(), credential2.getUsername());
        Assert.assertEquals(returnedCredential.getWebsiteUrl(), credential2.getWebsiteUrl());
        Assert.assertEquals(returnedCredential.getPasscode(), credential2.getPasscode());
    }
}
