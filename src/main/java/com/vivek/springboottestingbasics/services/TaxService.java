package com.vivek.springboottestingbasics.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
This annotation serves as a specialization of @Component,
allowing for implementation classes to be autodetected through classpath scanning.
*/
@Service
public class TaxService {
	
	@Autowired
	TaxBracketService bracketService;
	
	public String getBracket(int income) {	
		return (income<1000)? "LOW":( (income<5000)? "MEDIUM":"HIGH");
	}
	
	public List<String> allBrackets(){
		return bracketService.all();
	}
	
}
