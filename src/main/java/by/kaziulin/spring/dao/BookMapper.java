package by.kaziulin.spring.dao;

import by.kaziulin.spring.models.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
        Book book = new Book();
        book.setId(resultSet.getInt("id"));
        book.setName(resultSet.getString("name"));
        book.setAuthorName(resultSet.getString("authorName"));
        book.setDate(resultSet.getInt("date"));
        return book;
    }
}