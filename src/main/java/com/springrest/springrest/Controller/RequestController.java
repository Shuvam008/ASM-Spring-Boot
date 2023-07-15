package com.springrest.springrest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Request;
import com.springrest.springrest.service.RequestService;

@RestController
public class RequestController {
	
	@Autowired
	private RequestService requestService;
	
	
	// Get Assets
			@GetMapping("/services")
			public List<Request> getUsers()
			{
				return this.requestService.getServiceRequest();
			}
			
			// Add Assets
			@PostMapping("/services")
			public Request addAsset(@RequestBody Request request) {
				return this.requestService.addServiceRequest(request);
			}
			
			// Update Assets
			@PutMapping("/services")
			public Request UpdateUser(@RequestBody Request request) {
				return this.requestService.UpdateServiceRequest(request);
			}
			
			// Delete Asset
			@DeleteMapping("/services/{requestID}")
			public ResponseEntity<HttpStatus> deleteUser(@PathVariable String requestID){
				try {
					this.requestService.deleteServiceRequest(Long.parseLong(requestID));
					return new ResponseEntity<>(HttpStatus.OK);
				} catch (Exception e) {
					return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
}
