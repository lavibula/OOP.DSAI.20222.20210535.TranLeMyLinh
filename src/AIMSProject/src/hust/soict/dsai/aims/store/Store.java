package AIMSProject.src.hust.soict.dsai.aims.store;

import AIMSProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AIMSProject.src.hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    public static final int MAX_NUMBERS_ORDER = 10;
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    private int itemCount;

    public Store() {
        itemCount = 0;
    }

    public void addMedia(Media media) {
        if (itemCount < itemsInStore.size()) {
            itemsInStore.set(itemCount, media);
            itemCount++;
            System.out.println("DVD " + media.getTitle() + " added to the store.");
        } else {
            System.out.println("AIMSProject.src.hust.soict.dsai.aims.store.Store is full. Cannot add media.");
        }
    }

    public void removeDVD(Media media) {
        boolean found = false;
        int index = -1;

        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore.get(i) == (media)) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            // Shift the remaining DVDs to the left after removing the DVD
            for (int i = index; i < itemCount - 1; i++) {
                itemsInStore.set(i, itemsInStore.get(i + 1));
            }

            itemsInStore.set(itemCount - 1, null);
            itemCount--;
            System.out.println("Media " + media.getTitle() + " removed from the store.");
        } else {
            System.out.println("Media " + media.getTitle() + " not found in the store.");
        }
    }
}

