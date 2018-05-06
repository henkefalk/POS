package se.kth.IV1350.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import se.kth.IV1350.integration.ItemDTO;

public class SaleTester {
	Sale sale;
	ItemIdentifierDTO cucumberInfo = new ItemIdentifierDTO(1);
	ItemDTO cucumberItem = new ItemDTO("cucumber", 10, cucumberInfo);

	@Before
	public void setUp() throws Exception {
		sale = new Sale();
		sale.addItemToSale(cucumberItem);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addItemToSaleValidtest() {
		sale.addItemToSale(cucumberItem);
		int quantity = sale.scannedItems.get(cucumberItem);

		assertEquals(2, quantity);
	}

	@Test
	public void calculateChangeValidTest() {
		double payment = 50;
		double change = sale.calculateChange(payment);

		assertEquals(40, change, 0);
	}

	@Test
	public void getTotalSaleValidTest() {
		SaleDTO priceAndWaresTest = sale.getTotalSale();
		double priceWithTax = priceAndWaresTest.getRunningTotal();
		assertEquals(11.25, priceWithTax, 0);

		int NoOfBoughtItems = (priceAndWaresTest.getScannedItems()).size();
		assertEquals(1, NoOfBoughtItems);
	}
}
