package com.JavaPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JC52036 on 01-02-2020.
 */

public class Book {
    int book_id;
    String title;
    String author;
    int page;

    public Book(int book_id, String title, String author, int page) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    /* public Book(int book_id,String title){

                this.book_id=book_id;
                this.title=title;

            }*/
    public static List<Book> getBooks(){
        List<Book> list= new ArrayList<>();
        list.add(new Book(1,"Core Java","Monu",20));
        list.add(new Book(2,"Cpp","Joy",10));
        list.add(new Book(3,"Python","Joy",13));
        list.add(new Book(4,"Cpp","Monu",23));
        list.add(new Book(5,"JS","Vikas",23));
        return list;
    }

}
