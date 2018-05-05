package startUp;

import DBHandler.ItemCatalogCreator;
import controller.Controller;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		ItemCatalogCreator itemCatalogCreator = new ItemCatalogCreator();
		
		
		Controller controller = new Controller(itemCatalogCreator);
		
		View view = new View(controller);
		
		view.sampleExecution();
	}

}
