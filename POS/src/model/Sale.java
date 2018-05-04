package model;

import java.util.*;

import DBHandler.Item;

public class Sale {
	int saleID = 00202;
	double runningTotal;
	
	HashMap<Item, Integer> scannedItems = new HashMap <Item, Integer>();
	
	
	public void addItemToSale(Item scannedItem) {
		if(scannedItems.get(scannedItem) == null) {
			scannedItems.put(scannedItem, 1);
		}else {
			Integer quantity = scannedItems.get(scannedItem);
			quantity += 1;
			scannedItems.put(scannedItem, quantity);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
