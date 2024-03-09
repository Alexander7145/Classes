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


    }
