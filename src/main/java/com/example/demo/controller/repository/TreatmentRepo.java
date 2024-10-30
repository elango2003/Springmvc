package com.example.demo.controller.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Treatment;

public interface TreatmentRepo extends JpaRepository<Treatment, Integer>{
	@Query(value = "SELECT * FROM TREATMENT WHERE USER_ID_FK = ?1", nativeQuery = true)
	 List<Treatment> getTreatmentList(Integer user_id_fk);
	
	

}
