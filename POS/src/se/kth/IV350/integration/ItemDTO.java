package se.kth.IV350.integration;

import org.omg.CORBA.IdentifierHelper;

import se.kth.IV350.model.ItemIdentifierDTO;

public class ItemDTO {
	String itemName;
	double itemPrice;
	ItemIdentifierDTO itemIdentifier;

	/**
	 * This class represents an item in the store
	 * 
	 * @param itemName
	 *            The name of the item up for sale
	 * @param price
	 *            The price of the item set by the store
	 * @param identifier
	 *            An object that identifies the item
	 */

	public ItemDTO(String itemName, double price, ItemIdentifierDTO identifier) {
		this.itemName = itemName;
		itemPrice = price;
		itemIdentifier = identifier;
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

	@Override
	public boolean equals(Object objectToCompare) {
		if (objectToCompare instanceof ItemDTO) {
			ItemDTO compare = (ItemDTO) objectToCompare;
			return itemIdentifier == compare.getItemIdentifier();
		}
		return false;
	}

}