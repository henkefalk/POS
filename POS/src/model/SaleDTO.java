package model;

import DBHandler.Item;

public class SaleDTO {
	double runningTotal;
	Item lastScannedItem;
	
	public SaleDTO(double runningTotal, Item newItem) {
		this.runningTotal = runningTotal;
		lastScannedItem = newItem;
	}
	
	
	/**
	 * returns the name of the last scanned item, the items price and the running total as a String
	 */
	public String toString() {
		String printOut = "Item: " + lastScannedItem.getName() + "\n";
		printOut += "Price: " + Double.toString(lastScannedItem.getPrice()) + "\n"; 
		printOut += "Running Total" + Double.toString(runningTotal);
		return printOut;
	}
}
