package com.learningSpring.springFirst;
import com.learningSpring.springFirst.cardatabase.Car;
import com.learningSpring.springFirst.cardatabase.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFirstApplication implements CommandLineRunner {
	private CarRepository repository;
	public SpringFirstApplication(CarRepository repository) {
		this.repository=repository;
	}

	public static final Logger logger=LoggerFactory.getLogger(SpringFirstApplication.class);
//after adding this
	public static void main(String[] args) {
		SpringApplication.run(SpringFirstApplication.class, args);
		logger.info("Application Started");
	}
	public void run(String... args){
//		Long id, String model, String color, String brand, String registrationNumber, int modelYear, int price
		repository.save(new Car("Urus","gold","Lamborghini","NYC003",2004,20000000));
		repository.save(new Car("Creta","white","Hyundei","NYC003",2021,200000));
		repository.save(new Car("Huara","Blue","Pagani","Aj4004",2004,20000000));

		for(Car car:repository.findAll()){
			logger.info("brand: {}, model: {}",car.getBrand(),car.getModel());
		}
	}

}
