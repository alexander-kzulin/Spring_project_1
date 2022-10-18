package by.kaziulin.spring.dao;

import by.kaziulin.spring.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
       Person person = new Person();
       person.setId(resultSet.getInt("id"));
       person.setNameLastName(resultSet.getString("nameLastName"));
       person.setDateOfBirth(resultSet.getInt("dateOfBirth"));
return person;
    }
}
