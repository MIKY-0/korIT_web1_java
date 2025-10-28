package _20_OOP.book;

public class Book {
    String title;
    String author;

    Book(String title , String author){
        this.title = title;
        this.author = author;
    }
    public String toString() {return "제목 : " + title + " , 저자 : " + author;}

}
