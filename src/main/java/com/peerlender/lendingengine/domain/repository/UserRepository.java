package com.peerlender.lendingengine.domain.repository;

import com.peerlender.lendingengine.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
//implementing from crud to get the methods
public interface UserRepository extends JpaRepository< User, Long > {



}
