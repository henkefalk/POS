package view;

import controller.Controller;
import model.ItemIdentifier;
import model.Sale;
import model.SaleDTO;

public class View {
	private Controller controller;
	
	//constructor
	public View(Controller controller) {
	this.controller = controller;
	}
	
	public void sampleExecution() {
		System.out.println("Starting sample execution");
		controller.startSale();
		SaleDTO saleDTO = controller.registerItem(new ItemIdentifier(1));
		System.out.println(saleDTO.toString());
		
		
		
		
		
		System.out.println("After call to sartSale()");
		  
		
		
	}
	
	
}
