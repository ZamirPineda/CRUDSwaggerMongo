package com.crudmongo.crudmongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "posts")
public class PostsDTO {
    @Id
    private String _id;

    private String name;

    private Double price;

    private LocalDate expiry_date;

}
