package se.kth.IV1350.startUp;

import se.kth.IV1350.controller.Controller;
import se.kth.IV1350.integration.ItemCatalog;
import se.kth.IV1350.view.View;

/**
 * 
 * @author Henrik Falk
 */

public class Main {

	public static void main(String[] args) {

		ItemCatalog itemCatalog = new ItemCatalog();

		Controller controller = new Controller(itemCatalog);

		View view = new View(controller);

		view.sampleExecution();
	}

}
