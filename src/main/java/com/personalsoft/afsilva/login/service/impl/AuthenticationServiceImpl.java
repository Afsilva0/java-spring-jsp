package com.personalsoft.afsilva.login.service.impl;


import com.personalsoft.afsilva.login.service.AuthenticationService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Override
    public Boolean authenticate(String username, String password) {
        Boolean isValidUsername = username.equalsIgnoreCase("andres98");
        Boolean isValidPassword = password.equalsIgnoreCase("12345");

        return isValidUsername && isValidPassword;
    }
}
