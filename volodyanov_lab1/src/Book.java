package volodyanov.lab1;

public class Book {
    private String title;      // Название
    private String author;     // Автор
    private int pagesCount;    // Кол-во страниц
    private String genre;      // Жанр

    public Book(String t, String a, int p, String g){
        title = t;
        author = a;
        pagesCount = p;
        genre = g;
    }
    public Book(String t, String a, int p){
        title = t;
        author = a;
        pagesCount = p;
        genre = "none";
    }
    public Book(String t, String a){
        title = t;
        author = a;
        pagesCount = 0;
        genre = "none";
    }
    public Book(String t){
        title = t;
        author = "none";
        pagesCount = 0;
        genre = "none";
    }
    public Book(){
        title = "none";
        author = "none";
        pagesCount = 0;
        genre = "none";
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPagesCount() {
        return pagesCount;
    }
    public String getGenre() {
        return genre;
    }

    public String toString(){
        return "Название: " + this.title + ", автор: " + this.author + ", страниц: " + this.pagesCount + ", жанр: " + this.genre;
    }
}
