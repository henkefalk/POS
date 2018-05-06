package se.kth.IV350.startUp;

import se.kth.IV350.controller.Controller;
import se.kth.IV350.integration.ItemCatalog;
import se.kth.IV350.view.View;

public class Main {

	public static void main(String[] args) {

		ItemCatalog itemCatalog = new ItemCatalog();

		Controller controller = new Controller(itemCatalog);

		View view = new View(controller);

		view.sampleExecution();
	}

}
