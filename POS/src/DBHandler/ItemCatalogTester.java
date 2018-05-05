package DBHandler;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.ItemIdentifierDTO;

public class ItemCatalogTester {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getItemFromIDTest() {
		
		ItemCatalogCreator itemCatalogCreator = new ItemCatalogCreator();
		ItemIdentifierDTO itemID = new ItemIdentifierDTO(1);
		ItemDTO item = (itemCatalogCreator.getItemCatalog()).getItem(itemID);
		if(item == null) {
			System.out.println("fel");
		}
		
		assertEquals(15, item.getPrice(), 0.01);
	}

}

// ItemDTO newScannedItem = (itemcatalogcreator.getItemCatalog()).getItem(itemToBePurchased);