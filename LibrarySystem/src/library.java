import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Book {

    private String bookName;
    private String Author;
    private float price;

    public Book(String bookName, String Author, float price){

        this.bookName = bookName;
        this.Author = Author;
        this.price = price;

    }

    public String getbookName() {return bookName;}
    public String getAuthor() {return Author;}
    public float getprice() {return price;}

    public String chageToString() {return bookName + Author + price;}
}

public class library {
    
    public static boolean running = true;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<Book> mylibrary = new ArrayList<>();
        
        while (running) {
            System.out.println("\nwelocome to the library customer system");
            System.out.println("press 0 for add the book\npress 1 for Search(not work now)\npress 2 for remove the book(out of order)\n");
            System.out.print("choose your options:");

            int models = scanner.nextInt();

            switch (models) {
                case 0:
                    System.out.println("input your book name:");
                    String bookName = scanner.next();

                    System.out.println("input your book Author:");
                    String Author = scanner.next();

                    System.out.println("input your book price:");
                    float price = scanner.nextFloat();

                    mylibrary.add(new Book(bookName, Author, price));
                    System.out.println("Success, this is your book:");
                    System.out.printf("|Book name: %s | Author: %s | price: %s |", bookName, Author, price);

                    running = false;
                    break;
            
                default:
                    break;
            }
        }
        scanner.close();
    }
}