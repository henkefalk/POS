package se.kth.IV350.controller;

import se.kth.IV350.integration.AccountingSystem;
import se.kth.IV350.integration.InventorySystem;
import se.kth.IV350.integration.ItemCatalog;
import se.kth.IV350.integration.ItemDTO;
import se.kth.IV350.model.ItemIdentifierDTO;
import se.kth.IV350.model.Sale;
import se.kth.IV350.model.SaleDTO;

public class Controller {
	private Sale sale;
	ItemCatalog itemcatalog;

	// constructor
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
	 * 
	 * @return
	 */
	public SaleDTO finishSale() {
		return sale.getTotalSale();
	}

	public double handlePayment(double customersPayment, SaleDTO saleInformation) {
		InventorySystem.updateInventory(saleInformation);
		AccountingSystem.logSale(saleInformation);
		sale.printReceipt(saleInformation);
		return sale.calculateChange(customersPayment);
		
	}

}
