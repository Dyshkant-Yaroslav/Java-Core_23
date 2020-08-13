package ua.lviv.desctop.max;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Commodity c = new Commodity();
		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				c.addProduct();
			}
				break;
			case "2": {
				c.removeProduct();
			}
				break;
			case "3": {
				c.setProduct();
			}
				break;
			case "4": {
				c.sortByName();
			}
				break;
			case "5": {
				c.sortByLenght();
			}
				break;
			case "6": {
				c.sortByWidth();
			}
				break;
			case "7": {
				c.sortByWeight();
			}
				break;
			case "8": {
				c.showElement();
			}
				break;
			case "9": {
				c.exit();
			}
			}
		}
	}

	public static void menu() {
		System.out.println("Press button 1 to: add product");
		System.out.println("Press button 2 to: delete product");
		System.out.println("Press button 3 to: replace product");
		System.out.println("Press button 4 to: sorting by name");
		System.out.println("Press button 5 to: sorting by lenght");
		System.out.println("Press button 6 to: sorting by width");
		System.out.println("Press button 7 to: sorting by weight");
		System.out.println("Press button 8 to: show i-element");
		System.out.println("Press button 9 to: exit from program");

	}
}
