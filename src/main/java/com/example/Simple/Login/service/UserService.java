package com.example.Simple.Login.service;

import com.example.Simple.Login.model.UserModel;
import com.example.Simple.Login.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService
{

    @Autowired
    private UserRepo userRepo;

    public UserService(UserRepo userRepo)
    {
        this.userRepo = userRepo;
    }


    public UserModel registerUser(String login, String password, String email) {
        if (login != null && password != null) {
            return null;
        }
        else {

            UserModel userModel = new UserModel();
            userModel.setLogin(login);
            userModel.setEmail(email);
            userModel.setPassword(password);
            return userRepo.save(userModel);
        }
    }


     public UserModel authenticate(String login , String password)
     {
         return userRepo.findByLoginandPassword(login, password).orElse(null);
     }

}



