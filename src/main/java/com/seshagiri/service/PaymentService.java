package com.seshagiri.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seshagiri.pojo.PaymentDto;
import com.seshagiri.pojo.PaymentEntity;
import com.seshagiri.repo.PaymentRepo;

@Service()
public class PaymentService {
	
	@Autowired
	PaymentRepo paymentRepo;

	public List<PaymentDto> getPayments(){
		return  mapEntityToPojoList(paymentRepo.findAll());
	}
	
	 private List<PaymentDto> mapEntityToPojoList(Iterable<PaymentEntity> entityList){
	        List<PaymentDto> orderList = new ArrayList<PaymentDto>();
	        for (PaymentEntity orderEntity : entityList) {
	            orderList.add(mapEntityToPojo(orderEntity));
	        }
	        return orderList;
	    }

	
	
	  private PaymentDto mapEntityToPojo(PaymentEntity entity){
		  PaymentDto order = new PaymentDto();
	        order.setId(entity.getId());
	       // order.setName(entity.getName());
	        order.setProductName(entity.getProductName());
	        order.setBillamount(entity.getBillamount());
	        return order;
	    }

	    private PaymentEntity mapPojoToEntity(PaymentDto pojo){
	    	PaymentEntity order = new PaymentEntity();
	        //order.setId(entity.getId());
	       // order.setName(pojo.getName());
	        order.setProductName(pojo.getProductName());
	        order.setBillamount(pojo.getBillamount());
	        return order;
	    }
}
