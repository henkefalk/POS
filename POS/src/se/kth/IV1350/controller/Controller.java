package se.kth.IV1350.controller;

import se.kth.IV1350.integration.AccountingSystem;
import se.kth.IV1350.integration.InventorySystem;
import se.kth.IV1350.integration.ItemCatalog;
import se.kth.IV1350.integration.ItemDTO;
import se.kth.IV1350.model.ItemIdentifierDTO;
import se.kth.IV1350.model.Sale;
import se.kth.IV1350.model.SaleDTO;

/**
 * This class handles interactions between the "user" and the program itself
 * 
 * @author Henrik Falk
 */

public class Controller {
	private Sale sale;
	ItemCatalog itemcatalog;

	public Controller(ItemCatalog itemCatalog) {
		this.itemcatalog = itemCatalog;
	}

	/**
	 * creates a new instance of a sale
	 */
	public void startSale() {
		this.sale = new Sale();
	}

	/**
	 * Finds the item with the matching ItemIdentifier in the ItemCatalog and adds
	 * it to the Sale.
	 * 
	 * @param itemToBePurchased
	 *            The ItemIdentifier of the next item to be purchased
	 * @return returns the current state of Sale
	 */
	public SaleDTO registerItem(ItemIdentifierDTO itemToBePurchased) {
		ItemDTO newScannedItem = itemcatalog.getItem(itemToBePurchased);
		return sale.addItemToSale(newScannedItem);

	}

	/**
	 * Tells the program to collect the final state of sale
	 * 
	 * @return the final state of sale
	 */
	public SaleDTO finishSale() {
		return sale.getTotalSale();
	}

	/**
	 * tells the program to update the inventory, log the sale, print a reciept and
	 * calculate the amount of change the customer should receive
	 * 
	 * @param customersPayment
	 *            The amount of money paid by the customer
	 * @param saleInformation
	 *            The final state of sale
	 * @return the amount of change the customer shall receive
	 */
	public double handlePayment(double customersPayment, SaleDTO saleInformation) {
		InventorySystem.updateInventory(saleInformation);
		AccountingSystem.logSale(saleInformation);
		sale.printReceipt(saleInformation);
		return sale.calculateChange(customersPayment);

	}

}
