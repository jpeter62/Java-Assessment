package com.example.demo.addresscontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.addressmodel.AddressModel;
import com.example.demo.addressservice.AddressService;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class AddressController {

	 @Autowired
	 public AddressService addressService;
	 
	 @GetMapping("/api/address")
	 public List<AddressModel>showAllAddresses(){
		 return addressService.getAllAddresses();
	    }
	 @PostMapping("/api/address")
		public AddressModel addEmployee(@RequestBody AddressModel address) {
			return addressService.saveAddress(address);
		}
	}
		 
	 
	 

