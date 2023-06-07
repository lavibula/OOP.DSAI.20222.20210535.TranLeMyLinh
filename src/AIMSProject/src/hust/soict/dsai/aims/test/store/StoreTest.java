package AIMSProject.src.hust.soict.dsai.aims.test.store;

import AIMSProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AIMSProject.src.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Movie 3");

        // Add DVDs to the store
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        // Remove a DVD from the store
        store.removeMedia(dvd2);

        // Try to remove a DVD that doesn't exist in the store
        store.removeMedia(new DigitalVideoDisc("Non-existent Movie"));
    }
}
