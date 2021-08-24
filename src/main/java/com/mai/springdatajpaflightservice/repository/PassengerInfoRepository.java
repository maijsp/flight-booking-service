package com.mai.springdatajpaflightservice.repository;

import com.mai.springdatajpaflightservice.model.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {

}
