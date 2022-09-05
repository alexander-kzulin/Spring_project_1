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

    @NotEmpty
    @Max(value = 2023, message = "maximum year - 2023")
    @Pattern(regexp = "\\d{4}", message = "Year wrong format ")
    private long date;

}
