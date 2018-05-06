package model;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DBHandler.ItemDTO;

public class SaleDTOTester {

	@Before
	public void setUp() throws Exception {
		//ItemDTO cucumber = new ItemDTO("Cucumber", 15, new ItemIdentifierDTO(1));
		//double runningTotal = 20;
		//SaleDTO saleDTO = new SaleDTO(runningTotal, cucumber);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void toStringTest() {
		//fail("Not yet implemented");
		ItemDTO cucumber = new ItemDTO("Cucumber", 15, new ItemIdentifierDTO(1));
		double runningTotal = 20;
		HashMap<ItemDTO, Integer> ScannedItems = new HashMap <ItemDTO, Integer>();
		SaleDTO saleDTO = new SaleDTO(runningTotal, cucumber, ScannedItems);
		
		String out = saleDTO.toString();
		
		assertTrue(out.contains("Item: " + cucumber.getName()));
	}

}
