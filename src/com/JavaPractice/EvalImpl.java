package com.JavaPractice;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by JC52036 on 01-02-2020.
 */
public class EvalImpl implements Eval {
    public static void main(String[] args) {
        EvalImpl eval=new EvalImpl();
        System.out.println(eval.getTilte());
        System.out.println(eval.getAutor());
//        System.out.println(eval.getbookTitleVsBook());
        System.out.println(eval.getBookTitleOfAuthor("Monu"));
        System.out.println(eval.getAllbooksPageCount());


    }


    @Override
    public Set<String> getTilte() {
        return Book.getBooks().stream().map(x-> x.title).collect(Collectors.toSet());
    }

    @Override
    public List<String> getAutor() {
        return Book.getBooks().stream().map(x-> x.author).collect(Collectors.toList());
    }

    @Override
    public Map<String, Book> getbookTitleVsBook() {
        return Book.getBooks().stream().collect(Collectors.toMap(
                Book:: getTitle, book -> book
        ));
    }

    @Override
    public List<String> getBookTitleOfAuthor(String author) {
        return Book.getBooks().stream().filter(x->author.equals(x.author)).map(x->x.title).collect(Collectors.toList());
    }


    @Override
    public int getAllbooksPageCount() {
        return Book.getBooks().stream().mapToInt(x->x.page).sum();
    }
}
