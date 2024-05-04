package Library;

import java.util.Arrays;

public class Library1 {
    String name;
    Book[] books;
    User[] users;

    public Library1(String name) {
        this.name = name;
    }
    public void addBooks(Book book, Book[] books) throws CustomException {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {

                throw new CustomException("This book has already been");
            }
        }
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
    }

    public void addUsers(User user, User[] users) throws CustomException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user)) {

                throw new CustomException("This user has already registered");
            }
        }
        users = Arrays.copyOf(users, users.length + 1);
        users[users.length - 1] = user;
    }

    public void printBooks(){
        System.out.println(Arrays.toString(books));
    }

    public void printUsers() {
        System.out.println(Arrays.toString(users));
    }


}
