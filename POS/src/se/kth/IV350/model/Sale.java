package se.kth.IV350.model;

import java.util.*;

import se.kth.IV350.integration.ItemDTO;
import se.kth.IV350.integration.Printer;

public class Sale {
	double runningTotal;
	Tax tax = new Tax();

	HashMap<ItemDTO, Integer> scannedItems = new HashMap<ItemDTO, Integer>();

	/**
	 * Adds the new item to the sale or increases the quantity if the same item
	 * already has been scanned, and updates the running total.
	 * 
	 * @param newScannedItem
	 *            The item to be added to sale
	 * @return The current state of Sale, with updated runningTotal
	 */
	public SaleDTO addItemToSale(ItemDTO newScannedItem) {
		runningTotal += newScannedItem.getPrice();

		if (scannedItems.containsKey(newScannedItem)) {
			Integer quantity = scannedItems.get(newScannedItem);
			quantity += 1;
			scannedItems.put(newScannedItem, quantity);
		} else {
			scannedItems.put(newScannedItem, 1);
		}

		return new SaleDTO(runningTotal, newScannedItem, scannedItems);
	}

	/**
	 * 
	 * @return
	 */
	public SaleDTO getTotalSale() {
		runningTotal = tax.getPriceWithTax(runningTotal);
		return new SaleDTO(runningTotal, scannedItems);
	}

	/**
	 * 
	 * @param customersPayment
	 * @return
	 */
	public double calculateChange(double customersPayment) {
		return customersPayment - runningTotal;
	}

	/**
	 * 
	 * @param saleInformation
	 */
	public void printReceipt(SaleDTO saleInformation) {
		Receipt receipt = new Receipt(saleInformation);
		Printer.printReceipt(receipt);
	}

}
