package com.learningSpring.springFirst.cardatabase;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car,Long> {
    List<Car> findByBrand(String brand);
    List<Car> findByColor(String color);
    // Fetch cars by model year
    List<Car> findByModelYear(int modelYear);
}
