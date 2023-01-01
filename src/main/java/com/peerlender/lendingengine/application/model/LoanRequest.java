package com.peerlender.lendingengine.application.model;

import com.peerlender.lendingengine.domain.model.User;

import java.time.Duration;
import java.util.Objects;

public class LoanRequest {
    
    
    private final int      amount;
    //    final because its value cannot be changed through out bean creation lifecycle
    private final int     borrowerId;
    private final int  daysToRepay;
    private final double   interestrate;
    
    public LoanRequest ( int amount , int borrowerId , int daysToRepay , double interestrate ) {
        this.amount       = amount;
        this.borrowerId   = borrowerId;
        this.daysToRepay  = daysToRepay;
        this.interestrate = interestrate;
    }
    
    @Override
    public boolean equals ( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass () != o.getClass () )
            return false;
        LoanRequest that = ( LoanRequest ) o;
        return amount == that.amount && borrowerId == that.borrowerId && daysToRepay == that.daysToRepay && Double.compare ( that.interestrate , interestrate ) == 0;
    }
    
    @Override
    public int hashCode ( ) {
        return Objects.hash ( amount , borrowerId , daysToRepay , interestrate );
    }
    
    @Override
    public String toString ( ) {
        return "LoanRequest{" + "amount=" + amount + ", borrowerId=" + borrowerId + ", daysToRepay=" + daysToRepay + ", interestrate=" + interestrate + '}';
    }
}
