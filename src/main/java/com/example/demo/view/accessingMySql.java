package com.example.demo.view;
import com.example.demo.controller.Response.MainResponseData;
import com.example.demo.controller.dto.PatientMedicationDosageDto;
import com.example.demo.controller.dto.PatientMedicationDto;
import com.example.demo.controller.dto.TreatmentDto;
import com.example.demo.controller.dto.UserAddressDto;
import com.example.demo.controller.dto.UserDto;
import com.example.demo.controller.repository.UserRepository;
import com.example.demo.controller.service.UserService;
import com.example.demo.model.PatientMedicationDosage;
import com.example.demo.model.Treatment;
import com.example.demo.model.User;
import com.example.demo.model.patientMedication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")

public class accessingMySql {

	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;
	
	//To get all users...
	@GetMapping("/userdetails")
	public @ResponseBody MainResponseData getAllUsers(){
		return userService.getUser();
	}
	
	//To check a user is exist or not
	@GetMapping("/checkuser/{username}/{password}")
	public @ResponseBody  MainResponseData checkUser(@PathVariable("username") String username,@PathVariable("password") String password) {
		return userService.checkUser(username, password);
	}
	
	//To get user by userName and password...
	@GetMapping("/getuser/{username}/{password}")
	public @ResponseBody User getUser(@PathVariable("username") String username,@PathVariable("password") String password){
		return userService.getUserName(username,password);
	}
	
	//To get user and address table by userId...
	@GetMapping("/userdetailbyid/{userid}")
	public @ResponseBody UserAddressDto getDetail(@PathVariable("userid") Integer userid){
		return userService.getUserDetail(userid);
	}
		
	//To get user by userId...
	@GetMapping("/getuserbyid/{userid}")
	public @ResponseBody User getUserById(@PathVariable("userid") Integer userid){
		return userService.getUserById(userid);
	}
	
	
	//To post a user details...
	@PostMapping("/create")
	public @ResponseBody String addNewUser(@RequestBody UserDto userDto) {
		return userService.postUser(userDto);
	}
	
	
	//To update a user...
	@PutMapping("/update")
	public String updateUser(@RequestBody UserDto userDto) {
		return userService.putUser(userDto);
	}
  
	//To delete a user by id...
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") Integer user_id) {
		return userService.deleteUser(user_id);
	}

	
	
	//Treatment table GET POST PUT DELETE...
	//To post details of Treatment...
	@PostMapping("/treatmentpost")
	public @ResponseBody String treatmentpost(@RequestBody TreatmentDto treatmentDto) {
		
		System.out.println("consle ----->"+treatmentDto.toString());
		return userService.postTreatment(treatmentDto);
	}
	

	
	//To Get treatment table
	@GetMapping("/gettreatmentbyid/{treatmentid}")
	public Treatment getTreatmentById(@PathVariable("treatmentid") Integer treatment_id) {
		return userService.getTreatmentById(treatment_id);
	}
	
//	@GetMapping("/gettreatmentbyuserid/{id}")
//	public Treatment getTreatmentByUserId(@PathVariable("id") Integer user_id_fk) {
//		return userService.getTreatmentByUserId(user_id_fk);
//	}
	
	//To Delete treatment table by id
	@DeleteMapping("/treatmentdelete/{treatmentid}")
	public String deleteTreatment(@PathVariable("treatmentid") Integer treatment_id) {
		return userService.deleteTreatment(treatment_id);
	}
	
//	To get treatment by user id
	@GetMapping("/treatmentlist/{userid}")
	public List<Treatment> treatmentList(@PathVariable("userid") Integer user_id_fk){
		return userService.treatmentList(user_id_fk);
	}
	
//	To get patientMedication by user id
	@GetMapping("/medication/{userid}")
	public MainResponseData patientmedication(@PathVariable("userid") Integer treatment_id_fk){
		return userService.getMedication(treatment_id_fk);
	}
	
//	To update password
	@PutMapping("/changepass")
	public String updatePassword(@RequestBody UserDto userDto) {
		return userService.changePassword(userDto);
	}
}






