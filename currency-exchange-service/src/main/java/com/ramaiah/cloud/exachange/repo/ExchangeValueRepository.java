package com.ramaiah.cloud.exachange.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramaiah.cloud.exachange.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from,String to);

}
