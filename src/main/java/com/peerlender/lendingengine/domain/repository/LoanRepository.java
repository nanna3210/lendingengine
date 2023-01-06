package com.peerlender.lendingengine.domain.repository;

import com.peerlender.lendingengine.domain.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository< LoanApplication, Long > {


//jPA repository implementing saving update delete find method

}
