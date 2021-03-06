package se.kth.IV1350.model;

public class ItemIdentifierDTO {
	int itemIdentifier;

	public ItemIdentifierDTO(int identifier) {
		itemIdentifier = identifier;
	}

	/**
	 * Compares the integer values of two instances of the ItemIdentifierDTO-object
	 * to see if they are matching
	 * 
	 * @param The object to be compared with the current object ("current"?)
	 * @return true if the integers match, false if they are different, or if the
	 *         objectToCompare is not an instance of ItemIdentifierDTO
	 */
	@Override
	public boolean equals(Object objectToCompare) {
		if (objectToCompare instanceof ItemIdentifierDTO) {
			ItemIdentifierDTO compare = (ItemIdentifierDTO) objectToCompare;
			return itemIdentifier == compare.getItemIdentifier();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return getItemIdentifier();
	}

	public int getItemIdentifier() {
		return itemIdentifier;
	}

}
