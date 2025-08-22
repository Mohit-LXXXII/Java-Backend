package com.learningSpring.springFirst.cardatabase;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car,Long> {
    @Query("select c from Car c where c.brand=?1")
    List<Car> findByBrand(@Param("brand") String brand);
    List<Car> findByColor(String color);
    // Fetch cars by model year
    List<Car> findByModelYear(int modelYear);
}
