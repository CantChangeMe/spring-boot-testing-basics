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

/*
 * SpringRunner is an alias for the SpringJUnit4ClassRunner. 

To use this class, simply annotate a JUnit 4 based test class with @RunWith(SpringRunner.class).

 */

@RunWith(SpringRunner.class)
/*
 * Annotation that can be specified on a test class that runs Spring Boot based tests.
 * Provides the following features over and above the regular Spring TestContextFramework: 
 */
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
