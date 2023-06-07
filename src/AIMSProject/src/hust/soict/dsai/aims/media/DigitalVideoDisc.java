package AIMSProject.src.hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc
implements  Playable{
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(){
		super();
		nbDigitalVideoDiscs++;
	}

	public String getDirector() {
		return director;
	}
	public float getLength() {
		return length;
	}

	public DigitalVideoDisc(String title) {

		super(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}

	public boolean isMatch(String title){

		return true;
	}
	
	public String toString(){
		return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ":" + this.getCost() + "$";
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());

		System.out.println("DVD length: " + this.getLength());
	}
}
