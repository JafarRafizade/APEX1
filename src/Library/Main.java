package Library;

public class Main {
    public static void main(String[] args) throws CustomException {


        Book book1 = new Book("The Metamorphosis", "Franz Kafka");
        Book book2 = new Book("Meditations", "Marcus Aurelius");
        Book book3 = new Book("Harry Potter", "J.K Rowling");
        Book book4 = new Book("Dune", "Frank Herbert");
        Book book5 = new Book("2001 A Space Odyssey", "Arthur C. Clark");
        Book[] borrowedBooks = new Book[]{book1, book2, book3, book4};
        User user = new User("Elvin Qasimov",  borrowedBooks);
        try {
            user.borrowBook(book5);
        }catch (CustomException e) {
            System.out.println("This book has already borrowed");
        }
        user.printBorrowedBooks();

        Library1 library1 = new Library1("Jafar");
        try {


            library1.addBooks(book4, borrowedBooks);
        }catch (CustomException e){
            System.out.println("This book has already been");
        }




    }

}
