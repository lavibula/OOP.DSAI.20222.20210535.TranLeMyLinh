package AIMSProject.src.hust.soict.dsai.aims;

import AIMSProject.src.hust.soict.dsai.aims.cart.Cart;
import AIMSProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		// create new Cart
		Cart anOrder = new Cart();
		
		//create new DVD object and add them to the Cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science iction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		//print total cost
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
		System.out.println("-------------------------:3-------------------------");
		System.out.println("After remove");
		
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
	}

}
