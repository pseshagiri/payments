package com.seshagiri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seshagiri.pojo.PaymentDto;
import com.seshagiri.pojo.PaymentEntity;
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
	
	@PostMapping("/add")
	public PaymentDto add(@RequestBody() PaymentEntity paymentEntity) {		
		return paymentService.add(paymentEntity);
	}
	
	@DeleteMapping("/delete")
	public int delete(@PathVariable() int id) {		
		return paymentService.delete(id);
	}


}
