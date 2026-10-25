package problem3;

public class Magazine extends Document{
    private String month;
    private int year;

    public Magazine(String title, String month, int year){
        super(title);
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return "Magazine "+numRec+"- title : "+title+" month : "+month+" year : "+year;
    }
}
