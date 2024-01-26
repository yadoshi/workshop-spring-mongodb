package com.yagod.workshopmongodb.resources;

import com.yagod.workshopmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User yago = new User("1", "Yago", "yago@gmail.com");
        User diane = new User("2", "Diane", "diane@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(yago,diane));
        return ResponseEntity.ok().body(list);
    }
}
