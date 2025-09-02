//class Book already exists
import java.util.*;
public class LibraryManagement{
    //list of books created
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main (String []args){
        System.out.println("    LIBRARY MANAGEMENT SYSTEM   ");
        //choices for user
        System.out.println("Enter a choice \n1: Add new books \n2: Display all books \n3: Search a book by title \n4: Remove a book \n5: EXIT");
        int c = sc.nextInt();
        sc.nextLine();
        switch (c){
            case 1:
               addbook();
               break;
            case 2:
               displaybook();
               break;
            case 3:
               searchbook();
               break;
            case 4:
               removebook();
               break;
            case 5:
               System.out.println("Exiting");
               break;
            default: 
               System.out.println("Invalid Choice");
        }
    }
    //method to add book
    private static void addbook(){
        System.out.println("Enter book title: ");
        String title = sc.nextLine();
        System.out.println("Enter author's name: ");
        String author = sc.nextLine();
        System.out.println("Enter ISBN: ");
        String isbn = sc.nextLine();
        books.add(new Book(title, author, isbn));
        System.out.println("Book added successfully!");
    }
    //method to display book
    private static void displaybook(){
        if(books.isEmpty())
          System.out.println("No Books Available");
        else{
            System.out.println("List of books: ");
            for(Book b: books){
                System.out.println(b);
            }
        }
    }
    //method to search for a book
    private static void searchbook(){
        System.out.println("Enter Book Name: ");
        String title = sc.nextLine();
        boolean found = false;
        for( Book b : books){
            if(b.getTitle().equalsIgnoreCase(title)){
                System.out.println("Book Found "+b);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Book Not Found");//book doesn't exist in the list
        }
    }
    private static void removebook(){
        System.out.println("Enter Book Name: ");
        String title = sc.nextLine();
        boolean removed  = false;
        for(int i=0; i< books.size(); i++){
            if(books.get(i).getTitle().equalsIgnoreCase(title)){
                books.remove(i);
                System.out.println("Book removed ");
                removed=true;
                break;
            }
        }
        if(!removed)
          System.out.println("Book Not Found");
    }
}