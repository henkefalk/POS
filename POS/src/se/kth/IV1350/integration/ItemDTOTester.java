package se.kth.IV1350.integration;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import se.kth.IV1350.model.ItemIdentifierDTO;
import se.kth.IV1350.model.Sale;

public class ItemDTOTester {
	ItemDTO baseObject;
	ItemIdentifierDTO cucumberInfo = new ItemIdentifierDTO(1);
	
	@Before
	public void setUp() throws Exception {
		baseObject = new ItemDTO("cucumber", 10, cucumberInfo);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void equalsValidTest() {
		ItemDTO compareObject = new ItemDTO("cucumber", 10, cucumberInfo);
		assertTrue(baseObject.equals(compareObject));
	}
	
	@Test
	public void equalsInvalidObjectTest() {
		assertFalse(baseObject.equals(null));
	}

	@Test
	public void equalsInvalidStringTest() {
		ItemDTO compareObject = new ItemDTO("lemon", 10, cucumberInfo);
		assertTrue(baseObject.equals(compareObject));
	}
	
	@Test
	public void equalsInvalidPriceTest() {
		ItemDTO compareObject = new ItemDTO("cucumber", 99, cucumberInfo);
		assertTrue(baseObject.equals(compareObject));
	}
}