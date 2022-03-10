package com.example.demo.daoUserService;

import ch.qos.logback.core.util.COWArrayList;
import com.example.demo.entities.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserService {

    private static List<User> list=new ArrayList<>();
    static{
        list.add(new User(1,"los Angeles","Ishanvi","iam golang programmer"));
        list.add(new User(2,"Angeles","Ishi","iam python programmer"));
        list.add(new User(3,"los","Ishvi","iam benten programmer"));
    }

    public List<User> geAallUser(){
        return list;
    }

    public User getUserById(Integer id){
        User user=null;
        user=list.stream().filter(user1 -> user1.getId()==id).findFirst().get();
        return user;
    }

    public User addUser(User user){
      list.add(user);
      return user;
    }

    public void deleteUser(int id){
        list=list.stream().filter(user -> user.getId()!=id).collect(Collectors.toList());
    }

    public void uupdateUser(int id){
        list=list.stream().map(user -> {
               if( user.getId()==id){
                   user.setCity("atalanta");
                   user.setStatus("inbult programmer");
               }
               return user;
    }) .collect(Collectors.toList());
    }
}
