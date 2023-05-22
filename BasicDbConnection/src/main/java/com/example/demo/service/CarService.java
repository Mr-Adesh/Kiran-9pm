package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Car;

@Service
public interface CarService {
Car saveCar(Car car);
List<Car> getCars();

}
