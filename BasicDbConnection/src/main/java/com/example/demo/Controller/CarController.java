package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@RestController
public class CarController {
	@Autowired
	CarService carService;
	@PostMapping("car")
	public Car postCar(@RequestBody Car car) {
	 return carService.saveCar(car);		
	}
	@GetMapping("/car")
	public List<Car> getAllCars()
	{
		return carService.getCars();
	}

}
