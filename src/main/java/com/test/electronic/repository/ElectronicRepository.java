package com.test.electronic.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.electronic.electronics.Electronics;

public interface ElectronicRepository extends CrudRepository<Electronics ,Integer> {


}