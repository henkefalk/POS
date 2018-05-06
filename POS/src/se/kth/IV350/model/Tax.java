package se.kth.IV350.model;

public class Tax {
	private final double taxPercentage = 12.5;

	public double getPriceWithTax(double priceWithoutTax) {
		return priceWithoutTax + ((taxPercentage / 100) * priceWithoutTax);
	}
}
