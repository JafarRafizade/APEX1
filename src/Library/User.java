package Library;

import java.util.Arrays;
import java.util.Objects;

public class User {
    String fullName;
    int id;
    static int lastId = 0;
    Book[] borrowedBooks;

    public User(String fullName,  Book[] borrowedBooks) {
        this.fullName = fullName;
        this.id = ++lastId;
        this.borrowedBooks = borrowedBooks;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(fullName, user.fullName);
    }
    public void borrowBook(Book book) throws CustomException {

        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i].equals(book)) {

                throw new CustomException("This book has already borrowed");
            }
        }
        borrowedBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length + 1);
        borrowedBooks[borrowedBooks.length - 1] = book;
    }

    public void printBorrowedBooks() {
        System.out.println(Arrays.toString(borrowedBooks));
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, id);
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                '}';
    }
}
