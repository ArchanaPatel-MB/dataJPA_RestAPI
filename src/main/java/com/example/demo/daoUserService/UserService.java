package com.example.demo.daoUserService;

import com.example.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserReository userReository;


    public List<User> geAallUser(){
       return (List<User>) userReository.findAll();
    }

    public Optional<User> getUserById(Integer id){
        Optional<User> user=userReository.findById(id);
        System.out.println(user);
        return user;
    }

    public User addUser(User user){
      return   userReository.save(user);
    }

    public void deleteUser(int id){
         userReository.deleteById(id);
    }

//    public void uupdateUser(int id){
//        list=list.stream().map(user -> {
//               if( user.getId()==id){
//                   user.setCity("atalanta");
//                   user.setStatus("inbult programmer");
//               }
//               return user;
//    }) .collect(Collectors.toList());
//    }
}
