package AIMSProject.src.hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String toString(){
        return "Book - " + this.getTitle() + " - " + this.getCategory() + ":" + this.getCost() + "$";
    }
    public void addAuthor(String authorName){
        for(String author: authors){
            if (authors.contains(authorName)){
                System.out.println("The author already!");
            }
            else {
                authors.add(authorName);
            }
        }
    }

    public void removeAuthor(String authorName){
        for(String author: authors){
            if (authors.contains(authorName)){
                authors.remove(authorName);
            }
            else {
                System.out.println("The author not exist!");
            }
        }
    }
}
