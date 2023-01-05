package com.peerlender.lendingengine;

import com.peerlender.lendingengine.domain.model.User;
import com.peerlender.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendingengineApplication implements CommandLineRunner {
//	main class
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LendingengineApplication.class, args);
	}
	
	@Override
	public void run ( String... args ) throws Exception {
		
		userRepository.save ( new User ( 1 , "Nanna" , "Dash" , 30 , "Software developer" ) );
		userRepository.save ( new User ( 2 , "bapu" , "premanand" , 32 , "social worker" ) );
		userRepository.save ( new User ( 2 , "sainrupendra " , "dash" , 35 , "Manager" ) );
	
		
	}
}
