package com.mai.springdatajpaflightservice.repository;

import com.mai.springdatajpaflightservice.model.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

}
