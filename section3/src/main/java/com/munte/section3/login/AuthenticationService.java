package com.munte.section3.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String userName, String password) {
       return userName.equals("test") && password.equals("test");
    }

}
