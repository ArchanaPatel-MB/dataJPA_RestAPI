package com.example.demo;

import com.example.demo.daoUserService.UserReository;
import com.example.demo.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		UserReository userreository=context.getBean(UserReository.class);
//		User user1=new User();
//		user.setName("Archana");
//		user.setCity("delhi");
//		user.setStatus("I am java programmer");
//
//		User user1=userreository.save(user);
//		System.out.println(user1);

//		user1.setCity("hyderabad");
//		user1.setName("kartik");
//		user1.setStatus("py2thodn programer");
//		User user2=new User();
//		user2.setCity("hyderabad");
//		user2.setName("kartik");
//		user2.setStatus("pythodn programer");
//
//		List<User> users= List.of(user1,user2);
//		Iterable<User> result=userreository.saveAll(users);
//		result.forEach(user -> {
//			System.out.println(user);
//		});

//		Optional<User> optional=userreository.findById(1);
//		User user=optional.get();
//		user.setName("ronu rai");
//		System.out.println(user.getName()+"////////////////////////////////////////////////////////");
//		System.out.println(user);
//
//		User result =userreository.save(user);


	}

}
