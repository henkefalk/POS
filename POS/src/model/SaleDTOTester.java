package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DBHandler.Item;

public class SaleDTOTester {

	@Before
	public void setUp() throws Exception {
		//Item cucumber = new Item("Cucumber", 15, new ItemIdentifier(1));
		//double runningTotal = 20;
		//SaleDTO saleDTO = new SaleDTO(runningTotal, cucumber);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void toStringTest1() {
		//fail("Not yet implemented");
		Item cucumber = new Item("Cucumber", 15, new ItemIdentifier(1));
		double runningTotal = 20;
		SaleDTO saleDTO = new SaleDTO(runningTotal, cucumber);
		
		String out = saleDTO.toString();
		
		assertTrue(out.contains("Item: " + cucumber.getName()));
		
	}

}
