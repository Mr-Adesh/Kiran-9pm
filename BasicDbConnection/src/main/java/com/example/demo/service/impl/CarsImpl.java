package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import com.example.demo.service.CarService;

@Service
public class CarsImpl implements CarService{
	@Autowired
    CarRepository carRepository;
	@Override
	public Car saveCar(Car car) {
		// TODO Auto-generated method stub
		return carRepository.save(car);
	}

	@Override
	public List<Car> getCars() {
		// TODO Auto-generated method stub
		return carRepository.findAll();
	}

}
