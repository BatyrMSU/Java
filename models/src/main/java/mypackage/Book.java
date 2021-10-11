package mypackage;

import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;

@AllArgsConstructor
public class Book {

    @NotNull public String title;
    public Author author;
    public int numberOfPages;
    public int yearOfPublication;
    public String publisher;


}
