package com.peerlender.lendingengine.domain.model;

import java.time.Duration;
import java.util.Objects;

public class LoanRequest {
    
    
    private final int amount;
//    final because its value cannot be changed through out bean creation lifecycle
    private final User borrower;
    private final Duration paymentTerm;
    private final double interestrate;
    
    
    public LoanRequest ( int amount , User borrower , Duration paymentTerm , double interestrate ) {
        this.amount       = amount;
        this.borrower     = borrower;
        this.paymentTerm  = paymentTerm;
        this.interestrate = interestrate;
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
        return interestrate;
    }
    
    @Override
    public boolean equals ( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass () != o.getClass () )
            return false;
        LoanRequest that = ( LoanRequest ) o;
        return amount == that.amount && Double.compare ( that.interestrate , interestrate ) == 0 && Objects.equals ( borrower , that.borrower ) && Objects.equals ( paymentTerm , that.paymentTerm );
    }
    
    @Override
    public int hashCode ( ) {
        return Objects.hash ( amount , borrower , paymentTerm , interestrate );
    }
    
    @Override
    public String toString ( ) {
        return "LoanRequest{" + "amount=" + amount + ", borrower=" + borrower + ", paymentTerm=" + paymentTerm + ", interestrate=" + interestrate + '}';
    }
}

