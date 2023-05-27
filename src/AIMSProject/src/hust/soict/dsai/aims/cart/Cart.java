package AIMSProject.src.hust.soict.dsai.aims.cart;

import AIMSProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	// Add a field as an array to store a list of DigitalVideoDisc.  
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	// To keep track of how many DigitalVideoDiscs are in the cart
	private int qtyOrdered = 0;
	
	//add an item to the list
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOdered[qtyOrdered++] = disc;
			System.out.println("The disc has been added");
		}
		else {
			System.out.println("The cart is almost full");
		}
		
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (DigitalVideoDisc disc: dvdList) {
			if (qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOdered[qtyOrdered++] = disc;
				System.out.println("The disc has been added");
			}
			else {
				System.out.println("The cart is almost full");
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) { 
			addDigitalVideoDisc(dvd1);
			addDigitalVideoDisc(dvd2);
	}
	
	//remove the item passed by argument from the list
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i <qtyOrdered; i++) {
			if (itemsOdered[i] == disc) {
				for(int j = i; j < qtyOrdered; j++) {
					itemsOdered[j] = itemsOdered[i+1];
				}
				itemsOdered[--qtyOrdered] = null; 
				
			}
		}
	}
	
	//TotalCost method
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost +=  itemsOdered[i].getCost();
		}
		return totalCost;
	}

	public void print(){
		System.out.println("***********************CART*********************** ");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			DigitalVideoDisc dvd = itemsOdered[i];
			System.out.println((i+1) + " " + dvd.toString());
		}
		System.out.println("Total Cost: " + totalCost());
		System.out.println("***************************************************");
	}
}
