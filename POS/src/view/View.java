package view;

import controller.Controller;
import model.ItemIdentifierDTO;
import model.SaleDTO;

public class View {
	private Controller controller;
	
	ItemIdentifierDTO firstItem = new ItemIdentifierDTO(1);
	ItemIdentifierDTO secondItem = new ItemIdentifierDTO(2);
	ItemIdentifierDTO thirdItem = new ItemIdentifierDTO(3);
	ItemIdentifierDTO fourthItem = new ItemIdentifierDTO(4);
	ItemIdentifierDTO fifthItem = new ItemIdentifierDTO(5);
	
	
	
	
	
	//constructor
	public View(Controller controller) {
	this.controller = controller;
	}
	
	public void sampleExecution() {
		System.out.println("Starting sample execution");
		controller.startSale();
		SaleDTO saleDTO = controller.registerItem(firstItem);
		System.out.println(saleDTO.toString());
		
		saleDTO = controller.registerItem(secondItem);
		System.out.println(saleDTO.toString());
		
		saleDTO = controller.registerItem(thirdItem);
		System.out.println(saleDTO.toString());

		saleDTO = controller.registerItem(thirdItem);
		System.out.println(saleDTO.toString());
		
		saleDTO = controller.registerItem(fourthItem);
		System.out.println(saleDTO.toString());
		
		saleDTO = controller.registerItem(fifthItem);
		System.out.println(saleDTO.toString());
	}
	
	
}
