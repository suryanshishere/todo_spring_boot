package com.cool.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String name, String password) {
        return "admin".equals(name) && "123".equals(password);
    }
}
