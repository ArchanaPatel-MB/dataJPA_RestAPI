package com.example.demo.daoUserService;


import com.example.demo.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReository extends CrudRepository<User,Integer> {
}
