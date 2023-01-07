package com.peerlender.lendingengine.domain.model;

import jakarta.persistence.*;

import java.time.Duration;
import java.util.Objects;
//Loan Application class
@Entity
public final class LoanApplication {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
//    @Column ( name = "id", nullable = false )
    private Long id;
    
    private  int amount;
    //    final because its value cannot be changed throughout bean creation lifecycle
    @ManyToOne
    @JoinColumn ( name = "borrower_id" )
    private  User     borrower;
    private  Duration paymentTerm;
    private  double   interestRate;
    
    public LoanApplication ( ) {
    }
    
    
    public Long getId ( ) {
        return id;
    }
    
   
    
    public LoanApplication ( int amount , User borrower , Duration paymentTerm , double interestRate ) {
        this.amount       = amount;
        this.borrower     = borrower;
        this.paymentTerm  = paymentTerm;
        this.interestRate = interestRate;
    }
    
    public int getAmount ( ) {
        return amount;
    }
    
    public User getBorrower ( ) {
        return borrower;
    }
    
    public Duration getPaymentTerm ( ) {
        return paymentTerm;
    }
    
    public double getInterestrate ( ) {
        return interestRate;
    }
    
    @Override
    public boolean equals ( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass () != o.getClass () )
            return false;
        LoanApplication that = ( LoanApplication ) o;
        return amount == that.amount && Double.compare ( that.interestRate , interestRate ) == 0 && Objects.equals ( borrower , that.borrower ) && Objects.equals ( paymentTerm , that.paymentTerm );
    }
    
    @Override
    public int hashCode ( ) {
        return Objects.hash ( amount , borrower , paymentTerm , interestRate );
    }
    
    @Override
    public String toString ( ) {
        return "LoanRequest{" + "amount=" + amount + ", borrower=" + borrower + ", paymentTerm=" + paymentTerm + ", interestrate=" + interestRate + '}';
    }
}

