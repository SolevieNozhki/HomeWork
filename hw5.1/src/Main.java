import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String booksInfo = "";
    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double priceBook = inputPriceBook();
            addBook(name);
            addBook(name, pageCount);
            addBook(name, pageCount,priceBook);
            print();
        }
    }
    public static String inputBookName(){
        System.out.println("Введите название книги");
        return new Scanner(System.in).nextLine();
    }
    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц");
        return new Scanner(System.in).nextInt();
    }
    public static double inputPriceBook(){
        System.out.println("Введите стоимость книги");
        return new Scanner(System.in).nextDouble();
    }
    public static void addBook(String bookName){
        addBook(bookName,0);
    }
    public static void addBook(String bookName, int pageCount){
        addBook(bookName,0,0);
        }
    public static void addBook(String bookName, int pageCount, double priceBook){
        booksInfo = booksInfo + bookName +" - " +(pageCount > 0  ? pageCount : "N/A")+" стр. - "+(priceBook>0 ? priceBook+" руб.": "N/A") + "\n";
    }
    public static void print(){
        System.out.println(booksInfo);
    }
}