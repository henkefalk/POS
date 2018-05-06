package se.kth.IV1350.model;

public class Tax {
	private final double taxPercentage = 12.5;

	/**
	 * adds the tax to the total price
	 * 
	 * @param priceWithoutTax
	 *            the total price without taxes included
	 * @return the new total price with tax added
	 */
	public double getPriceWithTax(double priceWithoutTax) {
		return priceWithoutTax + ((taxPercentage / 100) * priceWithoutTax);
	}
}
