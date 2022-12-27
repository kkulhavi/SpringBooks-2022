package hr.tsd.springbooks.controller;

import hr.tsd.springbooks.model.Book;
import hr.tsd.springbooks.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {
    @Autowired
    BookRepo bookRepo;

    @GetMapping("/")
    public List<Book> allBooks(){
        return bookRepo.findAll();
    }
    @PostMapping("/")
    public void addBook(@RequestBody Book book){
         bookRepo.save(book);
        System.out.println(book+" saved...");
    }
    @PutMapping("/")
    public void updateBook(@RequestBody Book book){
        bookRepo.save(book);
        System.out.println(book+" updated...");
    }
    @DeleteMapping("/")
    public void update1Book(@RequestBody int id){
        try {
            bookRepo.deleteById(id);
            System.out.println(" deleted...");
        }
        catch (Exception e){
            System.out.println("no book found with id: "+id);
        }
    }
}
