package ua.lviv.desctop.min;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SupremeCouncil {
	Scanner sc = new Scanner(System.in);
	List<Fraction> fractions = new ArrayList<Fraction>();

	public void addFraction() {
		fractions.add(new Fraction());
		fractions.forEach(System.out::println);
	}

	public void removeFraction() {
		System.out.println("Your SupremeCouncil consist of next fractions: " + fractions);
		System.out.println("Enter index of fraction to remove it:");
		int index = sc.nextInt();
		fractions.remove(index);
		System.out.println("At now your SupremeCouncil consist of next fractions:" + fractions);

	}

	public void showAllFractions() {
//		for (Fraction fraction : fractions) {
//			System.out.println("Your SupremeCouncil consist of:" + fraction);
//		}
		fractions.forEach(System.out::println);
	}

	public void showFraction() {

		System.out.println("Enter index of fraction to show it:");
		int index = sc.nextInt();
		System.out.println("Your fraction is: " + fractions.get(index));
	}

	public void addDeputyToFraction() {
		System.out.println("Enter index of fraction to add deputy to it:");
		int index = sc.nextInt();
		fractions.get(index).addDeputy();
	}

	public void removeDeputy() {
		System.out.println("Your SupremeCouncil consist of: " + fractions);
		System.out.println("Enter index of fraction to remove him:");
		int index = sc.nextInt();
		fractions.get(index).removeDeputy();
		System.out.println("You delete deputy from fraction");
	}

	public void showAllBridetakers() {
		for (Fraction fraction : fractions) {
			fraction.showBrideTakers();
		}
	}

	public void showBiggestBridetaker() {
		for (Fraction fraction : fractions) {
			fraction.showBiggestbridetaker();
		}
	}

	public void showAllDeputs() {
		for (Fraction fraction : fractions) {
			fraction.showAllDeputats();
		}
	}

	public void giveBride() {
		for (Fraction fraction : fractions) {
			fraction.dgiveBride();
		}
	}

}
