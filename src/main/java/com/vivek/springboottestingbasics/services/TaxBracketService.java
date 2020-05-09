package com.vivek.springboottestingbasics.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaxBracketService {

	List<String> all(){
		return Arrays.asList("LOW","MEDIUM","HIGH");
	}

}
