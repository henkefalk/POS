package se.kth.IV350.model;

import java.util.*;

import se.kth.IV350.integration.ItemDTO;

public class SaleDTO {
	private final double runningTotal;
	private ItemDTO lastScannedItem;
	private final HashMap scannedItems;

	public SaleDTO(double runningTotal, ItemDTO newItem, HashMap<ItemDTO, Integer> scannedItems) {
		this.runningTotal = runningTotal;
		lastScannedItem = newItem;
		this.scannedItems = scannedItems;
	}

	public SaleDTO(double runningTotal, HashMap<ItemDTO, Integer> scannedItems) {
		this.runningTotal = runningTotal;
		this.scannedItems = scannedItems;
	}

	/**
	 * returns the name of the last scanned item, the items price and the running
	 * total as a String
	 */

	public double getRunningTotal() {
		return runningTotal;
	}

	public String getNameOfLatestItem() {
		return lastScannedItem.getName();

	}

	public double getPriceOfLatestItem() {
		return lastScannedItem.getPrice();
	}

}
