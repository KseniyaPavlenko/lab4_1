/**
 * Вариант 4.
 * поля класса:
 * Автор
 * Жанр
 * Название
 * Тираж
 */

public class Book {
    public static final int MIN_EDITION = 1;


    String author = "";
    String name = "";
    String genre = "";

    private int edition = 0;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEdition() {
        return this.edition;
    }

    public void setEdition(int edition) {
        if (edition < MIN_EDITION)
            this.edition = MIN_EDITION;
        else
            this.edition = edition;
    }

    public Book() {
    }
    public Book(String author, String name, String genre, int edition) {
        setAuthor(author);
        setName(name);
        setGenre(genre);
        setEdition(edition);
    }

    public String ToString() {
        return "Author: " + author + "\nTitle: " + name + "\nGenre: " + genre + "\nEdition: " + edition;
    }
}


