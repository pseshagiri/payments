package com.seshagiri.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seshagiri.pojo.PaymentEntity;

@Repository()
public interface PaymentRepo extends CrudRepository<PaymentEntity,Integer> {

}
