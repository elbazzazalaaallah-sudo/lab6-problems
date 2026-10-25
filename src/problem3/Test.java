package problem3;
import java.util.Scanner;

public class Test {
    // methods printMenu() and dispatch() both were taken from lab4-problems-
    // and modified to match the operations asked
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Add new book");
        System.out.println("2: Display all th books in the library");
        System.out.println("3: Delete the specified document");
        System.out.println("4: Search for the document with the record number you provide");
        System.out.println("5: Display the list of authors");
        System.out.print("\nEnter your choice: ");
    }

    public static void dispatch(int choice, Library lib)
    {
        Scanner scan = new Scanner(System.in);
        int loc;
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("Document to add");
                System.out.print("Enter book title: ");
                String title = scan.nextLine();
                Document doc = new Document(title);
                lib.addDocument(doc);
                break;
            case 2:
                lib.displayDocuments();
                break;
            case 3 :
                System.out.println("Document to delete");
                System.out.print("Enter book title: ");
                title = scan.nextLine();
                doc = new Document(title);
                lib.delete(doc);
                break;
            case 4 :
                System.out.println("Enter the record number ");
                int recordNumber = scan.nextInt();
                lib.document(recordNumber);
                break;
            case 5 :
                lib.DisplayAuthors();
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the capacity of your library : ");
        int n = scan.nextInt();
        Library lib = new Library(n);
        Book b = new Book("The void", "Me", 100);
        Novel no = new Novel("The void", "Me", 100, 0);

        lib.addDocument(b);
        lib.addDocument(no);

        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice, lib);
            printMenu();
            choice = scan.nextInt();
        }

    }

}
