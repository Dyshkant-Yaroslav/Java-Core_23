package ua.lviv.desctop.max;

import java.util.Comparator;

public class ProductSortedByWeight implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		return o1.getWeight() > o2.getWeight() ? 1 : -1;
	}
}
