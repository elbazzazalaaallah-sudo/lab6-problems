package problem3;

public class Book extends Document {
    protected String author;
    protected int nbrPages;

    public Book(String title, String author, int nbrPages){
        super(title);
        this.author = author;
        this.nbrPages = nbrPages;
    }

    public String toString(){
        return "Book "+numRec+"- title : "+title+" author : "+author+" and nbr of pages : "+nbrPages;
    }
}
