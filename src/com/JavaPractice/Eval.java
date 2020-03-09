package com.JavaPractice;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by JC52036 on 01-02-2020.
 */
public interface Eval {
    Set<String> getTilte();
    List<String> getAutor();
    Map<String,Book> getbookTitleVsBook();
    List<String> getBookTitleOfAuthor(String author);
    int getAllbooksPageCount();
}
