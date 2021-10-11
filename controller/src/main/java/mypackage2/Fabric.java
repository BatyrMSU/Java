package mypackage2;

import mypackage.Author;
import mypackage.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fabric {

    public Library createLibrary() {

        Library myLibrary = new Library();
        List<Author> authors = new ArrayList<Author>();
        List<String> authorsNames = new ArrayList<String>();

        try {
            Scanner scanner = new Scanner(new File("library.txt"));

            while (scanner.hasNextLine()) {
                String current_line = scanner.nextLine();
                String[] words = current_line.split(",");

                Author author;
                int index = authorsNames.indexOf(words[1]);
                if (index == -1) {
                    author = new Author(words[1]);
                    authors.add(author);
                    authorsNames.add(author.name);
                } else {
                    author = authors.get(index);
                }

                myLibrary.addBook(new Book(words[0], author,  Integer.parseInt(words[2]), Integer.parseInt(words[3]), words[4]));

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return myLibrary;
    }



}
