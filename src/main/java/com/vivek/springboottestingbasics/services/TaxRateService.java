package com.vivek.springboottestingbasics.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class TaxRateService {

	BigDecimal getRate(BigDecimal income){
		return new BigDecimal(4.56);
	}

}
