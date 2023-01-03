package com.peerlender.lendingengine.domain.model;

import jakarta.persistence.*;

import java.util.Objects;

//entity annotation for pojo
@Entity
public final class User {
    
    @Id
//    @GeneratedValue ( strategy = GenerationType.SEQUENCE )
//    @Column ( name = "id", nullable = false )
    private Long id;
    
    private  String firstName;
    private  String lastName;
    private  int    age;
    private  String occupation;
    
    public User ( ) {
    }
    
    
    public Long getId ( ) {
        return id;
    }
    
    public void setId ( Long id ) {
        this.id = id;
    }
    
    public User ( long id , String firstName , String lastName , int age , String occupation ) {
        this.id = id;
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.age        = age;
        this.occupation = occupation;
    }
    
    public String getFirstName ( ) {
        return firstName;
    }
    
    public String getLastName ( ) {
        return lastName;
    }
    
    public int getAge ( ) {
        return age;
    }
    
    public String getOccupation ( ) {
        return occupation;
    }
    
    @Override
    public boolean equals ( Object o ) {
        if ( this == o )
            return true;
        if ( o == null || getClass () != o.getClass () )
            return false;
        User user = ( User ) o;
        return age == user.age && Objects.equals ( firstName , user.firstName ) && Objects.equals ( lastName , user.lastName ) && Objects.equals ( occupation , user.occupation );
    }
    
    @Override
    public int hashCode ( ) {
        return Objects.hash ( firstName , lastName , age , occupation );
    }
    
    @Override
    public String toString ( ) {
        return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", occupation='" + occupation + '\'' + '}';
    }
    
    
}
