package ua.lviv.desctop.max;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commodity {
	Scanner sc = new Scanner(System.in);
	List<Product> cm = new ArrayList<Product>();
	
	public void addProduct() {
		System.out.println("Your list consist of: " + cm);
		System.out.println("Please enter name of product: ");
		String n = sc.next();
		System.out.println("Please enter product lenght: ");
		int l = sc.nextInt();
		System.out.println("Please enter product width: ");
		int w = sc.nextInt();
		System.out.println("Please enter product weight");
		int we = sc.nextInt();
		cm.add(new Product(n, l, w, we));
		System.out.println("At now your list consist of: " + cm);
	}
	public void removeProduct() {
		System.out.println("Your list consist of: " + cm);
		System.out.println("Enter index of removing product");
		int index = sc.nextInt();
		cm.remove(index);
		System.out.println("At now your list consist of: " + cm);
	}
	public void setProduct() {
		System.out.println("Your list consist of: " + cm);
		System.out.println("Enter index of removing product");
		int index = sc.nextInt();
		cm.set(index, newProduct());
		System.out.println("At now your list consist of: " + cm);

	}
	public Product newProduct() {
		String[] m = { "Product1", "Product2", "Product3", "Product4", "Product5" };
		String name = m[(int) (Math.random() * 6)];
		int lenght = (int) (Math.random() * 101);
		int width = (int) (Math.random() * 101);
		int weight = (int) (Math.random() * 101);
		Product n = new Product(name, lenght, width, weight);
		return n;
	}
	public void sortByName() {
		System.out.println("Your list before sorting: " + cm);
//		Collections.sort(cm, new ProductSortedByName());
		cm.stream().sorted( new ProductSortedByName());
		System.out.println("Your list after sorting: " + cm);
	}

	public void sortByLenght() {
		System.out.println("Your list before sorting: " + cm);
		//Collections.sort(cm, new ProductSortedByLenght());
		cm.stream().sorted( new ProductSortedByLenght());
		System.out.println("Your list after sorting: " + cm);
	}

	public void sortByWidth() {
		System.out.println("Your list before sorting: " + cm);
		//Collections.sort(cm, new ProductsSortedByWidth());
		cm.stream().sorted( new ProductsSortedByWidth());
		System.out.println("Your list after sorting: " + cm);
	}

	public void sortByWeight() {
		System.out.println("Your list before sorting: " + cm);
		//Collections.sort(cm, new ProductSortedByWeight());
		cm.stream().sorted( new ProductSortedByWeight());
		System.out.println("Your list after sorting: " + cm);
	}

	public void showElement() {
		System.out.println("Your list consist of: " + cm);
		System.out.println("Enter index of element");
		int index = sc.nextInt();
		System.out.println("Your element is: " + (cm.get(index)));

	}

	public void exit() {
		System.out.println("You exit from program, see you.....");
		System.exit(0);
	}

}
