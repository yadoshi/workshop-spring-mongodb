package com.yagod.workshopmongodb.services;

import com.yagod.workshopmongodb.domain.Post;
import com.yagod.workshopmongodb.domain.User;
import com.yagod.workshopmongodb.dto.UserDTO;
import com.yagod.workshopmongodb.repositories.PostRepository;
import com.yagod.workshopmongodb.repositories.UserRepository;
import com.yagod.workshopmongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repo.findByTitleContainingIgnoreCase(text);
    }
}
