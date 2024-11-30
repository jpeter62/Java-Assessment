package com.example.demo.addressservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.addressmodel.AddressModel;
import com.example.demo.addressrepository.AddressRepository;
@Service
public class AddressService {
	 @Autowired
	    public AddressRepository addressRepo;
	    
	    public List<AddressModel> getAllAddresses() {
	        return addressRepo.findAll();
	    }
	    public AddressModel saveAddress(AddressModel address) {
			return addressRepo.save(address);
		}
		

	}


