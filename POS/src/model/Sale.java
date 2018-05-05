package model;

import java.util.*;

import DBHandler.ItemDTO;

public class Sale {
	double runningTotal;
	
	HashMap<ItemDTO, Integer> ScannedItems = new HashMap <ItemDTO, Integer>();
	
	/**
	 * Adds the new item to the sale or increases the quantity if the  and updates the running total.
	 * @param newScannedItem The item to be added to sale
	 * @return The current state of Sale, with updated runningTotal
	 */
	public SaleDTO addItemToSale(ItemDTO newScannedItem) {
		runningTotal += newScannedItem.getPrice();
		if(ScannedItems.get(newScannedItem) == null) {
			ScannedItems.put(newScannedItem, 1);
		}else {
			Integer quantity = ScannedItems.get(newScannedItem);
			quantity += 1;
			ScannedItems.put(newScannedItem, quantity);
		}
		
		return new SaleDTO(runningTotal, newScannedItem, ScannedItems);
	}
	
	
	
	
	
	
	
	
}
