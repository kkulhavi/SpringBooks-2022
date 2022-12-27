package hr.tsd.springbooks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    @Id
    private int id;
    private String title;
    private String author;
    private int price;
}
