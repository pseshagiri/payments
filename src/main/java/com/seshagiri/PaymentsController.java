package com.seshagiri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seshagiri.pojo.PaymentDto;
import com.seshagiri.service.PaymentService;

@RestController()
@RequestMapping("/payments")
public class PaymentsController {
	
	@Autowired()
	private PaymentService paymentService;
	
	@GetMapping()
	public List<PaymentDto> get(){
		
		return paymentService.getPayments();
	}

}
