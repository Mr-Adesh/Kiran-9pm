package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmpAddDto;
import com.example.demo.models.Address;
import com.example.demo.models.Employee;
import com.example.demo.repository.AddressRepo;
import com.example.demo.repository.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
public class EMPADDService {
	@Autowired
   EmployeeRepo employeeRepo;
	@Autowired
   AddressRepo addressRepo;
	@Transactional
	public EmpAddDto save(EmpAddDto dto) {
		//EMP record
		Employee employee = new Employee();
		employee.setName(dto.getName());
		employee.setSalary(dto.getSalary());
		
		employeeRepo.save(employee);
		
		//Address Record
		
		Address address = new Address();
		address.setAddress(dto.getAddress());
		address.setEmployee(employee);
		addressRepo.save(null);
		 return dto; 
	}
	

}
