package com.vivek.springboottestingbasics.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxService4 {
	
	@Autowired
	private TaxRateService rateService;
	
	public BigDecimal calculateTax (BigDecimal income) {
		return rateService.getRate(income).multiply(income);
	}

}
