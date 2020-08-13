package ua.lviv.desctop.max;

import java.util.Comparator;

public class ProductSortedByLenght implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		return o1.getLenght() > o2.getLenght() ? 1 : -1;
	}
}
