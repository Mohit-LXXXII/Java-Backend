package com.learningSpring.springFirst.web;

import com.learningSpring.springFirst.cardatabase.Car;
import com.learningSpring.springFirst.cardatabase.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    private final CarRepository repository;
    public CarController(CarRepository repo){
        repository=repo;
    }


    @GetMapping("/cars")
    public Iterable<Car> getCars(){
    return repository.findAll();
    }

}
