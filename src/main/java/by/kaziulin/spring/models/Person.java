package by.kaziulin.spring.models;

import javax.validation.constraints.*;

public class Person {

    private int id;

    @NotEmpty(message = "Name can't be empty")
    @Size(min = 8, max =40, message = "min 8 max 40 characters")
    @Pattern(regexp = "[A-Z]\\w+ [A-Z]\\w+ [A-Z]\\w+", message = " Name wrong format " )
    private String nameLastName;

    @NotEmpty
    @Min(value = 1900, message = "enter correct date of birth")
    @Max(value = 2012, message = "minimum age - 10")
    @Pattern(regexp = "\\d{2}.\\d{2}.\\d{4}", message = "Date Of Birth  wrong format ")
    private long dateOfBirth;

    public Person(){}

    public Person(int id, String nameLastName, long dateOfBirth) {
        this.id = id;
        this.nameLastName = nameLastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameLastName() {
        return nameLastName;
    }

    public void setNameLastName(String nameLastName) {
        this.nameLastName = nameLastName;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
