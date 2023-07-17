package com.crudmongo.crudmongo.repository;

import com.crudmongo.crudmongo.model.PostsDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepo extends MongoRepository<PostsDTO, String> {
}
