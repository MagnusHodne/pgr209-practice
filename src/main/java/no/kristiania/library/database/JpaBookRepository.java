package no.kristiania.library.database;

import jakarta.inject.Inject;

import javax.sql.DataSource;
import java.util.List;

public class JpaBookRepository implements BookRepository {

    private final DataSource dataSource;

    @Inject
    public JpaBookRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public void save(Book book) {

    }

    @Override
    public Book retrieve(long id) {
        return null;
    }

    @Override
    public List<Book> listAll() {
        return null;
    }
}
