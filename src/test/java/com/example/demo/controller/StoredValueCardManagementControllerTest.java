package com.example.demo.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.service.impl.StoredValueCardManagementServiceImpl;

public class StoredValueCardManagementControllerTest {
	MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new StoredValueCardManagementController(new StoredValueCardManagementServiceImpl())).build();
	}

	@Ignore
	@Test
	public void testGetCardValue() throws Exception {
		mvc.perform(get("/cards/1").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk());
	}
	
	@Ignore
	@Test
	public void testGetCardValueTest2() throws Exception {
		MockHttpServletResponse value = mvc.perform(get("/cards/2"))
			.andExpect(status().isOk()).andReturn().getResponse();
		
		//assertEquals("200.0", new String(value.getContentAsByteArray()));
	}
	
	//@Ignore
	@Test
	public void testGetCardValueTest3() throws Exception {
		 mvc.perform(get("/cards/999"))
			.andExpect(status().isNotFound());
		
	}
}
