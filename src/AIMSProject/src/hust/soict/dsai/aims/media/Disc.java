package AIMSProject.src.hust.soict.dsai.aims.media;

public class Disc extends Media {
    private float length;
    private String director;

    public Disc(String title) {
        super(title);
    }

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Disc() {
        super();
    }

    public float getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public Disc(int id, String title, String category, float cost){
        super(id, title, category, cost);

    }

    public Disc(int id, String title) {
        super(id, title);
    }


}
