package com.seshagiri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.seshagiri.pojo.PaymentEntity;
import com.seshagiri.repo.PaymentRepo;

@SpringBootApplication
public class PaymentsApplication {
	
	@Autowired
	PaymentRepo orderRepo;

	public static void main(String[] args) {
		SpringApplication.run(PaymentsApplication.class, args);
	}
	
	@Bean()
	public CommandLineRunner sampleData(){
		return (args -> {
			orderRepo.save(new PaymentEntity(1,"Mobile",2500));
			orderRepo.save(new PaymentEntity(2,"SmartWatch",250));
			orderRepo.save(new PaymentEntity(3,"IFB Washing Machine",25000));
		});
	}

}
