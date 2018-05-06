package se.kth.IV1350.model;

import java.util.*;

import se.kth.IV1350.integration.ItemDTO;

public class SaleDTO {
	private final double runningTotal;
	private ItemDTO lastScannedItem;
	private final HashMap<ItemDTO, Integer> scannedItems;

	public SaleDTO(double runningTotal, ItemDTO newItem, HashMap<ItemDTO, Integer> scannedItems) {
		this.runningTotal = runningTotal;
		lastScannedItem = newItem;
		this.scannedItems = scannedItems;
	}

	public SaleDTO(double runningTotal, HashMap<ItemDTO, Integer> scannedItems) {
		this.runningTotal = runningTotal;
		this.scannedItems = scannedItems;
	}

	public double getRunningTotal() {
		return runningTotal;
	}

	public String getNameOfLatestItem() {
		return lastScannedItem.getName();

	}

	public double getPriceOfLatestItem() {
		return lastScannedItem.getPrice();
	}
	
	public HashMap<ItemDTO, Integer> getScannedItems() {
		return scannedItems;
	}

}
