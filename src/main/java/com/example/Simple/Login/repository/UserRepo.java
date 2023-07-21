package com.example.Simple.Login.repository;

import com.example.Simple.Login.model.UserModel;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository <UserModel,Integer> {


    Optional<UserModel> findByLoginandPassword(String login, String password);
}
