package model;

public class ItemIdentifier {
	int itemIdentifier;
	
	public ItemIdentifier(int identifier) {
		itemIdentifier = identifier;
	}
	
	public boolean equals(Object objectToCompare) {
		if(objectToCompare instanceof ItemIdentifier) {
			ItemIdentifier compare = (ItemIdentifier) objectToCompare;
			if(this.itemIdentifier == compare.getItemIdentifier()) {
				return true;
			}
		}
		return false;
	}
	
	public int getItemIdentifier() {
		return this.itemIdentifier;
	}
	
}
