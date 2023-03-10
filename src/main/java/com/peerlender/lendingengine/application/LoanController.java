package com.peerlender.lendingengine.application;


import com.peerlender.lendingengine.application.model.LoanRequest;
import com.peerlender.lendingengine.domain.model.User;
import com.peerlender.lendingengine.domain.repository.LoanRepository;
import com.peerlender.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//controller class !
@RestController
public class LoanController {
    
//
    private final LoanRepository loanRepository;
    
    private final UserRepository userRepository;
    
//    dependency injection
    @Autowired
    public LoanController ( LoanRepository loanRepository , UserRepository userRepository ) {
        this.loanRepository = loanRepository;
        this.userRepository = userRepository;
    }
    
    
    @PostMapping(value = "loan/request")
        public void requestLoan(@RequestBody   LoanRequest loanRequest ) {
            System.out.println ( loanRequest );
//            request body to convert the body of request to loan request object
        }
        
        @GetMapping(value = "/users")
        public List < User > findUsers(){
            return userRepository.findAll ();
        }
        
}
