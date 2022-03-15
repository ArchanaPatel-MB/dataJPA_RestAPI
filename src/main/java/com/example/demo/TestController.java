package com.example.demo;

import com.example.demo.daoUserService.UserService;
import com.example.demo.entities.User;
import org.hibernate.dialect.MySQL8Dialect;
import org.hibernate.dialect.MySQLStorageEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TestController extends MySQL8Dialect {

    @Override
    protected MySQLStorageEngine getDefaultMySQLStorageEngine() {
        return super.getDefaultMySQLStorageEngine();
    }

    @Autowired
    private UserService userservice;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUserss(){
        List<User> user=userservice.geAallUser();
        if(user.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(user));
    }

    @GetMapping("/user/{id}")
        public Optional<User> user(@PathVariable("id") int id){
        return userservice.getUserById(id);
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return userservice.addUser(user);
    }

    @DeleteMapping("/users/{id}")
    public String  deleteUser(@PathVariable("id") int id){
         this.userservice.deleteUser(id);
         return "deleted successfully" ;
    }
//    @PutMapping("/user/{userId}")
//    public String updateUser(@PathVariable("userId") int userId){
//        this.userservice.uupdateUser(userId);
//        return "user updated";
    }


