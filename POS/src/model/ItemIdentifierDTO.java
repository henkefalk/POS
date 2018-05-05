package model;

public class ItemIdentifierDTO {
	int itemIdentifier;
	
	public ItemIdentifierDTO(int identifier) {
		itemIdentifier = identifier;
	}
	
	@Override
	public boolean equals(Object objectToCompare) {
		if(objectToCompare instanceof ItemIdentifierDTO) {
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
