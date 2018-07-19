package com.example.demo.service;

import com.example.demo.domain.GiftCard;

public interface StoredValueCardManagementService {
	GiftCard getValueForCard(long cardId);
}
