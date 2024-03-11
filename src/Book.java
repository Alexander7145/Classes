import java.util.Objects;

public class Book {

    private String name;

    private int publishingYear;


    private Author author;






    public Book(String name, int publishingYear, Author author){
        this.name = name;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear(){
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
    public Author getAuthor(){
        return author;

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishingYear=" + publishingYear +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publishingYear, author);
    }
}
