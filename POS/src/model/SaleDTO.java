package model;

import java.util.*;
import DBHandler.ItemDTO;

public class SaleDTO {
	private final double runningTotal;
	private final ItemDTO lastScannedItem;
	private final HashMap scannedItems;
	
	public SaleDTO(double runningTotal, ItemDTO newItem, HashMap<ItemDTO, Integer> scannedItems) {
		this.runningTotal = runningTotal;
		lastScannedItem = newItem;
		this.scannedItems = scannedItems;
	}
	
	
	/**
	 * returns the name of the last scanned item, the items price and the running total as a String
	 */
	public String toString() {
		String printOut = "Item: " + lastScannedItem.getName() + "\n";
		printOut += "Price: " + Double.toString(lastScannedItem.getPrice()) + "\n"; 
		printOut += "Running Total: " + Double.toString(runningTotal) + "\n";
		return printOut;
	}
	
	public double getPrice() {
		return runningTotal;
	}
	
	
}
