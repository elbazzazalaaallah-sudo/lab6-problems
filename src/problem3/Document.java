package problem3;

public class Document {
    protected int numRec;
    protected String title;

    public int getNumRec() {
        return numRec;
    }

    public Document(){
        numRec++;
    }

    public Document(String title){
        this.title = title;
        numRec++;
    }

    public String toString(){
        return numRec+": "+title;
    }
}
