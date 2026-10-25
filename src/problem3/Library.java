package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    ArrayList<Document> documents = new ArrayList<>();

    public Library(int capacity){
        this.capacity = capacity;
    }

    public boolean addDocument(Document d){
        if (!documents.contains(d)){
            documents.add(d);
            return true;
        }return false;
    }

    public String toString(){
        return "Library with capacity "+capacity;
    }

    public void displayDocuments(){
        for (Document doc : documents){
            System.out.println(doc.toString());
        }
    }

    public boolean delete(Document doc){
        if (documents.contains(doc)){
            documents.remove(doc);
            return true;
        }return false;
    }

    public Document document(int numEnrg){
        for(Document doc : documents){
            if (doc.numRec == numEnrg){
                return doc;
            }
        }return null;
    }

    public void DisplayAuthors(){
        for(Document doc : documents){
            if (doc instanceof Book){
                System.out.println(((Book) doc).author);
            }
        }
    }
}
