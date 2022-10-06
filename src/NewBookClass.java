import java.util.Arrays;

public class NewBookClass {
    Book[] books;


    public NewBookClass() {
        this.books = new Book[0];
    }

    public void addBook(Book book) {
        Book[] temp = Arrays.copyOf(books, books.length + 1);
        temp[books.length] = book;
        books = temp;
    }


    public NewBookClass Less10000edition(int edition) {
        NewBookClass temp = new NewBookClass();
        for (Book book : books) {
            if (book.getEdition() < edition)
                temp.addBook(book);
        }
        return temp;
    }


    public String toString() {
        return Arrays.toString(books) + "\n";
    }










}
