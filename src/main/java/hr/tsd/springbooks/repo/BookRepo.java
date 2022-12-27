package hr.tsd.springbooks.repo;

import hr.tsd.springbooks.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
