package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book1 implements Comparator<Book1> {
    String title;
    String author;
    double price;
    int pubYear;

    public Book1(String title, String author, double price, int pubYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPubYear() {
        return pubYear;
    }

    @Override
    public int compare(Book1 o1, Book1 o2) {
        if (o1.price > o2.price || o1.pubYear < o2.pubYear){
            return 1;
        } else if (o1.price < o2.price || o1.pubYear > o2.pubYear) {
            return -1;

        }
        return 0;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", pubYear=" + pubYear +
                '}';
    }

    public static void main(String[] args) {

        Book1 book1 = new Book1("a1","qw",12,1890);
        Book1 book2 = new Book1("b1","we",10,1920);
        Book1 book3 = new Book1("w1","ed",23,1679);
        ArrayList<Book1> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Collections.sort(books, new Comparator<Book1>() {
            @Override
            public int compare(Book1 o1, Book1 o2) {
                if (o1.price > o2.price || o1.pubYear < o2.pubYear){
                    return 1;
                } else if (o1.price < o2.price || o1.pubYear > o2.pubYear) {
                    return -1;

                }
                return 0;
            }
        });
        System.out.println(books);


    }


}
