package com.vivek.springboottestingbasics.services;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaxServiceTest2 {
	
	@Autowired
	private TaxService4 service;
	
	@MockBean
	private TaxRateService taxRateService;
		
	@Test
	public void calculateTax() {
		BigDecimal income = new BigDecimal(400);
		Mockito.when(taxRateService.getRate(income)).thenReturn( new BigDecimal(4.56));
		
		assertThat(service.calculateTax(income).intValue()).isEqualTo(new BigDecimal(1823.99999999999984368059813277795910835266113281250000).intValue());
		
	}
	
}
