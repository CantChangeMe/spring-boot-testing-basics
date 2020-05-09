package com.vivek.springboottestingbasics.services;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/*
 * SpringRunner is an alias for the SpringJUnit4ClassRunner. 

To use this class, simply annotate a JUnit 4 based test class with @RunWith(SpringRunner.class). 

 */


@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = {TaxService.class,TaxBracketService.class})
public class TaxServiceTest {
	
	@Autowired
	private TaxService service;
	
	@Autowired
	private TaxBracketService bracketService;
	
	/*
	 *@Test is used to signal that the annotated method is a test method. 
	  @Test methods must not be private or staticand must not return a value. 
	  @Test methods may optionally declare parameters to beresolved by ParameterResolvers. 
	 */
	@Test
	public void getBracket() {
		assertThat(service.getBracket(300)).isEqualTo("LOW");
	}
	
	@Test
	public void allBracket() {
		assertThat(service.allBrackets()).contains("LOW","MEDIUM","HIGH");
	}
	
}
