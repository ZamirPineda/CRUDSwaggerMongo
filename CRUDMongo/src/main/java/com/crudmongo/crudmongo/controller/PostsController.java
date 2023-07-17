package com.crudmongo.crudmongo.controller;

import com.crudmongo.crudmongo.model.PostsDTO;
import com.crudmongo.crudmongo.repository.IRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
        RequestMethod.DELETE })
@RequestMapping("/api/products")
public class PostsController {
    @Autowired
    private IRepo repo;

    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    public PostsDTO create(@Validated @RequestBody PostsDTO p) {
        return repo.insert(p);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<PostsDTO> readAll() {
        return repo.findAll();
    }

    @PutMapping("/product/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PostsDTO update(@PathVariable String id, @Validated @RequestBody PostsDTO p) {
        return repo.save(p);
    }

    @DeleteMapping("/product/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
