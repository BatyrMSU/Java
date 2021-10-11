package mypackage2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mypackage.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<Book>();
    static int size = 0;

    public void addBook(Book book) {
        books.add(book);
        size++;
    }

    public void showBookOfAuthor(String name) {
        GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
        Gson gson = builder.create();
        for (Book book: books) {
            if (book.author.name.equals(name)) {
                String json = gson.toJson(book);
                System.out.println(json);
            }
        }
    }

}
