package AIMSProject.src.hust.soict.dsai.aims.media;

import java.util.Objects;

public class Track
implements Playable{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(String title) {
        this.title = title;
    }

    public Track(int length) {
        this.length = length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());

        System.out.println("Track length: " + this.getLength());
    }
    public boolean equals(Object obj){
        Track itm = (Track) obj;
        return this.getTitle().equals(itm.getTitle()) && this.getLength() == itm.getLength();
    }
}
