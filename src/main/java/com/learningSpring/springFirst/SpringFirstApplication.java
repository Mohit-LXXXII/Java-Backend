package com.learningSpring.springFirst;
import com.learningSpring.springFirst.cardatabase.Car;
import com.learningSpring.springFirst.cardatabase.CarRepository;
import com.learningSpring.springFirst.cardatabase.Owner;
import com.learningSpring.springFirst.cardatabase.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringFirstApplication implements CommandLineRunner {
	private CarRepository repository;
	private OwnerRepository ownRepository;
	public SpringFirstApplication(CarRepository repository ,OwnerRepository owner) {
		this.repository=repository;
		this.ownRepository=owner;
	}

	public static final Logger logger=LoggerFactory.getLogger(SpringFirstApplication.class);
//after adding this
	public static void main(String[] args) {
		SpringApplication.run(SpringFirstApplication.class, args);
		logger.info("Application Started");
	}
	public void run(String... args){

		Owner owner1=new Owner("mohit ","sharma");
		Owner owner2=new Owner("namba","mutta");
		ownRepository.saveAll(Arrays.asList(owner1,owner2));

//		Long id, String model, String color, String brand, String registrationNumber, int modelYear, int price


		repository.save(new Car("Urus","gold","Lamborghini","NYC003",2004,20000000,owner1));
		repository.save(new Car("Creta","white","Hyundei","NYC003",2021,200000,owner2));
		repository.save(new Car("Huara","Blue","Pagani","Aj4004",2004,20000000,owner1));

		for(Car car:repository.findAll()){
			logger.info("brand: {}, model: {}",car.getBrand(),car.getModel());
		}
	}

}
