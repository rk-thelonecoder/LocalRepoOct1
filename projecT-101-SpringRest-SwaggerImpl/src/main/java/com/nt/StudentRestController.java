package com.nt;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

@RestController
@RequestMapping("/Student")
public class StudentRestController {
	
	@GetMapping("/student")
	public ResponseEntity<String> display(@RequestHeader String name,@RequestParam String name2){
		String getName=name;
		String getName2=name2;
		String body="RequestHeader name::"+getName+" "+getName2;
		HttpStatus status=HttpStatus.OK;
		ResponseEntity<String> entity=new ResponseEntity<String>(body, status);
		return entity;
		
	}
	
	@PostMapping("/student")
	public ResponseEntity<String> post(){
		
		return new ResponseEntity<String>("post method invoked",HttpStatus.OK);
	}
	
	@PutMapping("/student")
	public ResponseEntity<String> putMethod(){
		
		return new ResponseEntity<String>("put mapping invoked",HttpStatus.OK);
	}
	
	@PatchMapping("/student")
	public ResponseEntity<String> patchMethod(){
		
		return new ResponseEntity<String>("patch method invoked",HttpStatus.OK);
	}
	
	

}
