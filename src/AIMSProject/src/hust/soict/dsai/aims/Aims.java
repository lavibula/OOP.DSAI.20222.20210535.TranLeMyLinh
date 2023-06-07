package AIMSProject.src.hust.soict.dsai.aims;

import AIMSProject.src.hust.soict.dsai.aims.cart.Cart;
import AIMSProject.src.hust.soict.dsai.aims.media.CompactDisc;
import AIMSProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AIMSProject.src.hust.soict.dsai.aims.media.Media;
import AIMSProject.src.hust.soict.dsai.aims.store.Store;

import java.util.Scanner;

public class Aims {

	public static void main(String[] args) {
		/* Cart anOrder = new Cart();

		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc (
				"The Lion King", "Animation", 19.95f, "Roger Allers", 87);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc (
				"Star Wars", "Science Fiction", 24.95f, "George Lucas", 87);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc (
				"Aladin", "Animation", 18.99f, "Director A", 78);

		// add
		anOrder.addMedia(dvd3);
		anOrder.addMedia(dvd2);
		anOrder.addMedia(dvd1);
		//print total cost of the items in the cart
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());

		// sort by cost title
		java.util.Collections.sort(anOrder.getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);

		System.out.println(anOrder.getItemsOrdered());

		// sort by title cost
		java.util.Collections.sort(anOrder.getItemsOrdered(), Media.COMPARE_BY_TITLE_COST);

		System.out.println(anOrder.getItemsOrdered());


		// toString
		ArrayList<Media> media = new ArrayList<Media>();

		CompactDisc cd = new CompactDisc("CD","",0.0f,"","");
		DigitalVideoDisc dvd = new DigitalVideoDisc("DVD", null, 0, null, 0);
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Author A");
		authors.add("Author B");
		Book book = new Book("Book","",0.0f,authors);

		media.add(book);
		media.add(dvd);
		media.add(cd);

		for (Media m: media) {
			System.out.println(m.toString());
		}	*/

		Store storeA = new Store();
		Cart yourCart = new Cart();

		showMenu();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your option: ");
		int Option = scanner.nextInt();

		switch(Option) {
			case 0: // exit
				System.out.println("Exiting...");
				break;
			case 1: // view store
				storeMenu();
				System.out.println("Enter your option: ");
				Option = scanner.nextInt();
				switch (Option) {
					case 0:
						System.out.println("Back");
						break;
					case 1: // See a media’s details
						System.out.println("Enter the title of Media: ");

						String title = scanner.next();
						while (!(title instanceof String)) {
							System.out.println("Your title is not valid.");
							title = scanner.next();
						}

						Media media = new Media(title);
						System.out.println(media);

						mediaDetailsMenu();
						System.out.println("Enter your choice: ");
						int choice = scanner.nextInt();
						switch (choice) {
							case 1: // Add to cart
								yourCart.addMedia(media);
								break;
							case 2: // Play
								if (media instanceof CompactDisc) {
									CompactDisc cd = (CompactDisc) media;
									cd.play();
								}
								else if (media instanceof DigitalVideoDisc) {
									DigitalVideoDisc dvd = (DigitalVideoDisc) media;
									dvd.play();
								}
								else {
									System.out.println("You media you have chosen can not be played.");
								}
								break;
							case 0: // Back
								System.out.println("Back");
								break;
						}
						break;
					case 2: // add a media to cart
						// enter the title of the media
						System.out.println("Enter the title of the media: ");

						// check if the title is valid
						String title2 = scanner.next();
						while (!(title2 instanceof String)) {
							System.out.println("Your title is not valid.");
							System.out.println("Please enter another.");
							title2 = scanner.next();
						}

						Media media2 = new Media(title2);

						// check if the media is exist in the store
						boolean check = false;
						for (int i = 0; i < storeA.getItemsInStore().size(); i++) {
							if (storeA.getItemsInStore().get(i).getTitle() == media2.getTitle()) {
								check = true;
							}
						}
						while (!(check)) {
							System.out.println("Your media is not in the store");
							System.out.println("Please enter another.");
							title2 = scanner.next();
						}

						yourCart.addMedia(media2);
						break;
					case 3: // play a media
						// enter the title of the media
						System.out.println("Enter the title of the media: ");

						// check if the title is valid
						String title3 = scanner.next();
						while (!(title3 instanceof String)) {
							System.out.println("Your title is not valid.");
							System.out.println("Please enter another.");
							title3 = scanner.next();
						}

						Media media3 = new Media(title3);

						// check if the media is exist in the store
						boolean check3 = false;
						for (int i = 0; i < storeA.getItemsInStore().size(); i++) {
							if (storeA.getItemsInStore().get(i).getTitle() == media3.getTitle()) {
								check3 = true;
							}
						}
						while (!(check3)) {
							System.out.println("Your media is not in the store");
							System.out.println("Please enter another.");
							title3 = scanner.next();
						}

						// check if this kind of media valid to play
						if (media3 instanceof CompactDisc) {
							CompactDisc cd = (CompactDisc) media3;
							cd.play();
						}
						else if (media3 instanceof DigitalVideoDisc) {
							DigitalVideoDisc dvd = (DigitalVideoDisc) media3;
							dvd.play();
						}
						else {
							System.out.println("You media you have chosen can not be played.");
						}
						break;
					case 4: // see current cart
						seeCurrentCart(scanner, yourCart);
						break;
				}
				break;
			case 2: // update store
				System.out.println("1: Add a media; 2: Remove a media"
						+"\n" +"Enter the kind of updatation:");
				int kindOfUpdate = scanner.nextInt();
				System.out.println("Enter the name of media: ");
				String name = scanner.next();
				Media m = new Media(name);
				if (kindOfUpdate == 1) {
					storeA.addMedia(m);
					System.out.println(storeA.getItemsInStore());
				}
				else {
					storeA.removeMedia(m);
				}
				break;
			case 3: // see current cart
				seeCurrentCart(scanner, yourCart);
				break;
		}
	}

	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}

	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}

	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}

	public static void seeCurrentCart(Scanner scanner, Cart cart) {
		cartMenu();
		System.out.println("Choose a number:");
		int number = scanner.nextInt();
		switch (number) {
			case 0:
				System.out.println("Back");
				break;
			case 1: // Filter medias in cart
				System.out.println("Filter by: id(1) or title(2)");
				int choice = scanner.nextInt();
				if (choice == 1) { // id
					System.out.println("Enter the Id:");
					int id = scanner.nextInt();
					for (int i = 0; i < cart.getItemsOdered().size(); i++) {
						if (id == cart.getItemsOdered().get(i).getId()) {
							System.out.println(cart.getItemsOdered().get(i));
						}
					}
				}
				else if (choice == 2){ // title
					System.out.println("Enter the title:");
					String title = scanner.next();
					for (int i = 0; i < cart.getItemsOdered().size(); i++) {
						if (cart.getItemsOdered().get(i).getTitle() == title) {
							System.out.println(cart.getItemsOdered().get(i));
						}
					}

				}
				else {
					System.out.println("Invalid.");
				}
				break;
			case 2: // sort media in cart
				System.out.println("Sort by? title(1) or cost(2)");
				int sortby = scanner.nextInt();
				if (sortby == 1) {
					java.util.Collections.sort(cart.getItemsOdered(), Media.COMPARE_BY_TITLE_COST);
					System.out.println(cart.getItemsOdered());
				}
				else if (sortby == 2){
					java.util.Collections.sort(cart.getItemsOdered(), Media.COMPARE_BY_COST_TITLE);
					System.out.println(cart.getItemsOdered());
				}
				else {
					System.out.println("Invalid.");
				}
				break;
			case 3: // Remove media from cart
				System.out.println("Enter the name of media: ");
				String name = scanner.next();
				Media m = new Media(name);
				cart.removeMedia(m);
				break;
			case 4: //  Play a media
				// enter the title of the media
				System.out.println("Enter the title of the media: ");

				// check if the title is valid
				String title3 = scanner.next();
				while (!(title3 instanceof String)) {
					System.out.println("Your title is not valid.");
					System.out.println("Please enter another.");
					title3 = scanner.next();
				}

				Media media3 = new Media(title3);

				// check if the media is exist in the store
				boolean check3 = false;
				for (int i = 0; i < cart.getItemsOdered().size(); i++) {
					if (cart.getItemsOdered().get(i).getTitle() == media3.getTitle()) {
						check3 = true;
					}
				}
				while (!(check3)) {
					System.out.println("Your media is not in the cart");
					System.out.println("Please enter another.");
					title3 = scanner.next();
				}

				// check if this kind of media valid to play
				if (media3 instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) media3;
					cd.play();
				}
				else if (media3 instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) media3;
					dvd.play();
				}
				else {
					System.out.println("You media you have chosen can not be played.");
				}
				break;
			case 5:
				System.out.println("An order is created.");
				break;
		}

	}
}