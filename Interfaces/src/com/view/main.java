package com.view;

import com.model.TaxCalculator;
import com.model.TaxCalculator2019;

public class main {

	public static void main(String[] args) {

		TaxCalculator calculator = getCalculator();
		calculator.calculateTax();
	}

	public static TaxCalculator getCalculator() {
		return new TaxCalculator2019();
	}
}
