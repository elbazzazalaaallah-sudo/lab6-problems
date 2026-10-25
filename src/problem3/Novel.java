package problem3;

public class Novel extends Book{
    public double price;

    public Novel(String title, String author, int nbrPages, double price){
        super(title, author, nbrPages);
        this.price = price;
    }

    public String toString(){
        return "Novel "+numRec+"- title : "+title+" author : "+author+", nbr of pages : "+nbrPages+ ", priced at : "+price;
    }
}
