package com.example.demo.daoUserService;


import com.example.demo.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserReository extends CrudRepository<User,Integer> {
public User findById(int id);
}
