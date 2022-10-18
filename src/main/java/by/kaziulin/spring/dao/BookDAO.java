package by.kaziulin.spring.dao;

import by.kaziulin.spring.models.Book;
import by.kaziulin.spring.models.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component

public class BookDAO {
    private final JdbcTemplate jdbcTemplate;

    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List <Book> index() {
        return jdbcTemplate.query("SELECT * FROM Book", new BeanPropertyRowMapper<>(Book.class));
    }
public Book show(int id) {
        return jdbcTemplate.query("SELECT * FROM BOOK WHERE id=?",
                new Object[] {id}, new BookMapper()).stream().findAny().orElse(null);
}
    public Optional<Book> show(String name) {
        return jdbcTemplate.query("SELECT * FROM Book WHERE name=?",
                new Object[]{name}, new BeanPropertyRowMapper<>(Book.class)).stream().findAny();
    }

    public void save(Book book) {
        jdbcTemplate.update("INSERT INTO Book(name, authorName, date) " +
                "VALUES (?,?,?)", book.getName(), book.getAuthorName(), book.getDate());
    }

    public void update(int id, Book updatedBook) {
        jdbcTemplate.update("UPDATE Book SET name=?, authorName=?, date=? WHERE id=?",
                updatedBook.getName(), updatedBook.getAuthorName(), updatedBook.getDate(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM Book WHERE id=?", id);
    }
}
