package com.example.demo.controller.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.dto.UserDto;
import com.example.demo.model.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	 @Query(value = "SELECT * FROM USER WHERE USERNAME = ?1 AND PASSWORD = ?2 ", nativeQuery = true)
	 User findByUserName(String userName,String password);
	 
	 @Query(value = "SELECT * FROM USER,ADDRESS WHERE USER_ID = ?1 ", nativeQuery = true)
	 User getUserDetail(Integer id);
	 
	 
	 
//	 @Query(value = "SELECT * FROM USER WHERE USERNAME = ?1", nativeQuery = true)
//	 User findByUserId(String userid);
}
