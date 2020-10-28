package com.BCASKandy.MorterCycleTourPlanner.controller;

import java.util.List;
import com.BCASKandy.MorterCycleTourPlanner.model.User;
import com.BCASKandy.MorterCycleTourPlanner.service.UserFacadeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserFacadeImpl userFacadeImpl;


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {

        System.out.println("Fetching User with id " + id);
        User user = userFacadeImpl.retrieveUser(id,"Admin" );
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PostMapping(value="/create",headers="Accept=application/json")
    public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder){
        System.out.println("Creating User "+user.getUserName());
        userFacadeImpl.createUser(user, "Admin");

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @GetMapping(value="/get", headers="Accept=application/json")
    public List<User> getAllUser() {
        List<User> users = userFacadeImpl.retrieveAllUsers("Admin");
        return users;

    }

    @PutMapping(value="/update", headers="Accept=application/json")
    public ResponseEntity<String> updateUser(@RequestBody User currentUser)
    {
        System.out.println("sd");
        User user = userFacadeImpl.retrieveUser(currentUser.getId(),"Admin");
        if (user==null) {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        userFacadeImpl.updateUser(currentUser, "Admin");
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}", headers ="Accept=application/json")
    public ResponseEntity<User> deleteUser(@PathVariable("id") long id){
        User user = userFacadeImpl.retrieveUser(id, "Admin");
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        userFacadeImpl.deleteUser(id, "Admin");
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }

    }
}
