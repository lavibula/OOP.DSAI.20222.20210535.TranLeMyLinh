public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int itemCount;

    public Store() {
        itemsInStore = new DigitalVideoDisc[10]; // Assuming a maximum of 10 DVDs in the store
        itemCount = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (itemCount < itemsInStore.length) {
            itemsInStore[itemCount] = dvd;
            itemCount++;
            System.out.println("DVD " + dvd.getTitle() + " added to the store.");
        } else {
            System.out.println("Store is full. Cannot add DVD.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        int index = -1;

        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore[i].equals(dvd)) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            // Shift the remaining DVDs to the left after removing the DVD
            for (int i = index; i < itemCount - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }

            itemsInStore[itemCount - 1] = null;
            itemCount--;
            System.out.println("DVD " + dvd.getTitle() + " removed from the store.");
        } else {
            System.out.println("DVD " + dvd.getTitle() + " not found in the store.");
        }
    }
}

