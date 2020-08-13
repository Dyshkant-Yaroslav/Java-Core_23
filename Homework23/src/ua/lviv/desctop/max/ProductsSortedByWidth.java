package ua.lviv.desctop.max;

import java.util.Comparator;

public class ProductsSortedByWidth implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		return o1.getWidth() > o2.getWidth() ? 1 : -1;
	}

}
