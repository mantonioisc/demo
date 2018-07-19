/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.GiftCard;
import com.example.demo.service.StoredValueCardManagementService;

/**
 * @author x245573
 *
 */
@RestController
public class StoredValueCardManagementController {
	private StoredValueCardManagementService svcms;
	 
	@Autowired
	public StoredValueCardManagementController(StoredValueCardManagementService svcms) {
		this.svcms = svcms;
	}
	
	
	@GetMapping(path = "/cards/{cardId}", produces = "application/json")
	public GiftCard getCardValue(@PathVariable long cardId){
		return svcms.getValueForCard(cardId);
	}
}
