package AIMSProject.src.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(String title) {
        this.title = title;
    }

    public Media(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media() {

    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String toString(){
        return "Media - " + this.getTitle() + " - " + this.getCategory() + " - " +  ":" + this.getCost() + "$";
    }

    public boolean equals(Object obj){
        Media itm = (Media) obj;
        return this.getTitle().equals(itm.getTitle());
    }

    public static void main(String[] args){
        List<Media> mediae = new ArrayList<Media>();

        Media cd = new CompactDisc("LOVE", "LoveSongs", 15,"Ho Ngoc Ha");
        Media dvd = new DigitalVideoDisc("US", "US", 8);
        Media book = new Book("De men phieu luu ky", "Truyen", 10);
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for (Media m: mediae){
            System.out.println(m.toString());
        }
        Collections.sort(mediae,Media.COMPARE_BY_TITLE_COST);
    }
}
