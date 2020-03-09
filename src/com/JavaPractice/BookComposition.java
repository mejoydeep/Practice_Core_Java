package com.JavaPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JC52036 on 29-01-2020.
 */
 class BookComposition {
    public String title;
    public String author;

    public BookComposition(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library{
        private List<BookComposition> books;

    public Library(List<BookComposition> books) {
        this.books = books;
    }
    public List<BookComposition> gettotalBooksInLibrary(){
        return books;
    }
}

class MainClass{
    public static void main(String[] args) {
        BookComposition b1=new BookComposition("Physics","S.N.Dey");
        BookComposition b2=new BookComposition("Chemistry","P.K.Das");
        BookComposition b3=new BookComposition("Math","K.C.nag");

        List<BookComposition> books=new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library library=new Library(books);

        List<BookComposition> bks=library.gettotalBooksInLibrary();
        for (BookComposition bk : bks){
            System.out.println(bk.title+" : "+bk.author);
        }
    }
}
