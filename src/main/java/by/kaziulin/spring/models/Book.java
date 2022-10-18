package by.kaziulin.spring.models;

import javax.validation.constraints.*;


public class Book {
    private int id;


    @NotEmpty
    @Size(min = 1, max = 20, message = "Book name must be min - 1 max - 20 characters")
    private String name;




    @NotEmpty
    @Size(min = 1, max = 30, message = "Author name must be min - 1 max - 30 characters")
    @Pattern(regexp = "[A-Z]\\w+ [A-Z]\\w+", message = "Author Name wrong format ")
     private String authorName;


    @Min(value =  1, message = "minimum year - 1")
    @Max(value = 2023, message = "maximum year - 2023")
    //@Pattern(regexp = "\\d{4}", message = "Year wrong format ")
    private int date;

    public Book(int id, String name, String authorName, int date) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.date = date;
    }

    public Book(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
