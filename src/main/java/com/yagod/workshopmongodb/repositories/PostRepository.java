package com.yagod.workshopmongodb.repositories;

import com.yagod.workshopmongodb.domain.Post;
import com.yagod.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
