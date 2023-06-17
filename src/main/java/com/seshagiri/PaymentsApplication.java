package com.seshagiri;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.seshagiri.pojo.PaymentEntity;
import com.seshagiri.repo.PaymentRepo;

@SpringBootApplication
public class PaymentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentsApplication.class, args);
	}
	
	public CommandLineRunner sampleDate(PaymentRepo orderRepo){
		return (args -> {
			orderRepo.save(new PaymentEntity(1,"Mobile",2500.00));
			orderRepo.save(new PaymentEntity(2,"SmartWatch",250.00));
			orderRepo.save(new PaymentEntity(3,"IFB Washing Machine",25000.00));
		});
	}

}
