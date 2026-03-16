package com.example.AuthService.service;

import com.example.AuthService.model.User;
import com.example.AuthService.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> getAllUsers(){
        return repository.findAll();
    }

    public User getUser(Long id){
        return repository.findById(id).orElseThrow();
    }

    public User updateUser(Long id, User user){

        User existing = repository.findById(id).orElseThrow();

        existing.setName(user.getName());
        existing.setPhoneNumber(user.getPhoneNumber());

        return repository.save(existing);
    }

    public void deleteUser(Long id){
        repository.deleteById(id);
    }

}
