package com.example.demo.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.exception.InvalidCardIdException;
import com.example.demo.service.StoredValueCardManagementService;

@Service
public class StoredValueCardManagementServiceImpl implements StoredValueCardManagementService {
	private static Map<Long, Double> mockCardValues = new HashMap<>();
	
	public StoredValueCardManagementServiceImpl(){
		mockCardValues.put(1L,  100.00);
		mockCardValues.put(2L,  200.00);
		mockCardValues.put(3L,  300.00);
		mockCardValues.put(4L,  400.00);
		mockCardValues.put(5L,  500.00);
	}
	
	@Override
	public double getValueForCard(long cardId) {
		
		//return mockCardValues.getOrDefault(cardId, 0.0);
		if(!mockCardValues.containsKey(cardId)){
			throw new InvalidCardIdException();
		}
		
		return mockCardValues.get(cardId);
	}

}
