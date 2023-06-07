package AIMSProject.src.hust.soict.dsai.aims.cart;

import AIMSProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AIMSProject.src.hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Cart {
	// Add a field as an array to store a list of DigitalVideoDisc.  
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOdered = new ArrayList<>();

	//add an item to the list
	public void addMedia(Media media){
		if (itemsOdered.size() < MAX_NUMBERS_ORDERED){
			itemsOdered.add(media);
		}
		System.out.println("Your items has been added!");
	}
	public void addMedia(Media media1, Media media2){
		if (itemsOdered.size() < MAX_NUMBERS_ORDERED){
			itemsOdered.add(media1);
			itemsOdered.add(media2);
		}
		System.out.println("Your items has been added!");
	}

	public void addMedia(Media[] setMedia) {
		for (Media a : setMedia) {
			if (itemsOdered.size() < MAX_NUMBERS_ORDERED) {
				itemsOdered.add(a);
			}
		}
		System.out.println("Your items has been added!");
	}
	//remove the item passed by argument from the list
	public void removeMedia(Media media){
		for (int i = 0; i < itemsOdered.size(); i++){
			Media a = itemsOdered.get(i);
			if (media == a){
				itemsOdered.remove(media);
				i--;
			}
		}
		System.out.println("Your items has been removed!");
	}
	
	//TotalCost method
	public float totalCost() {
		float totalCost = 0;
		for (Media a: itemsOdered){
			totalCost -= a.getCost();
		}
		return totalCost;
	}

	public void print(){
		System.out.println("***********************CART*********************** ");
		System.out.println("Ordered Items:");
		for (Media media: itemsOdered) {

			System.out.println((itemsOdered.indexOf(media)+1) + " " + media.toString());
		}
		System.out.println("Total Cost: " + totalCost());
		System.out.println("***************************************************");
	}
}
