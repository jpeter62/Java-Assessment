package com.example.demo.addressrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.addressmodel.AddressModel;


public interface AddressRepository extends JpaRepository<AddressModel, Integer> {

}
