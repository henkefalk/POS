package se.kth.IV1350.model;

public class Receipt {

	SaleDTO saleInformation;

	/**
	 * creates a receipt to be sent to the printer
	 * 
	 * @param saleInformation
	 *            the final state of sale
	 */
	public Receipt(SaleDTO saleInformation) {
		this.saleInformation = saleInformation;
	}

}