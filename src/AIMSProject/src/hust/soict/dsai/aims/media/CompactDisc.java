package AIMSProject.src.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc
implements Playable {
    private String artist;
    private List<Track> tracks;

    public String getArtist() {
        return artist;
    }

    public CompactDisc(int id, String title, String category, float cost, String artist) {
        super(id, title, category, cost);
        this.artist = artist;
    }

    public CompactDisc(String title, String category, float cost, String artist) {
        super(title, category, cost);
        this.artist = artist;
    }

    public void addTrack(Track track){
        if (tracks.contains(track)) {
            System.out.println("The track already!");
        }
        else {
            tracks.add(track);
            System.out.println("The track has been added!");
        }
    }

    public void removeTrack(Track track){
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("The track has been removed!");
        }
        else {
            System.out.println("The track not exist!");
        }
    }

    public float getLength(){
        int length = 0;
        for (Track item: tracks){
            length += item.getLength();
        }
        return length;
    }
    public void play(){
        for (Track item: tracks){
            item.play();
        }
    }
    public String toString(){
        return "CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getArtist() + ":" + this.getCost() + "$";
    }
}

