package DBHandler;

import model.ItemIdentifierDTO;

public class ItemDTO {
	String itemName;
	double itemPrice;
	ItemIdentifierDTO itemIdentifier;
	
	/**
	 * This class represents an item in the store 
	 * @param itemName		The name of the item up for sale
	 * @param price			The price of the item set by the store
	 * @param identifier	An object that identifies the item
	 */
	
	public ItemDTO(String itemName, double price, ItemIdentifierDTO identifier) {
		this.itemName = itemName;
		itemPrice = price;
		this.itemIdentifier = identifier;
	}
	
	public ItemIdentifierDTO getItemIdentifier() {
		return itemIdentifier;
	}
	
	public String getName() {
		return itemName;
	}
	
	public double getPrice() {
		return itemPrice;
	}
	
	
	
	
	
}
