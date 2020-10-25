package com.BCASKandy.MorterCycleTourPlanner.controller;

import java.util.List;
import com.BCASKandy.MorterCycleTourPlanner.model.User;
import com.BCASKandy.MorterCycleTourPlanner.repository.UserRepository;
import com.BCASKandy.MorterCycleTourPlanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserByID(@PathVariable (value = "id") long userId) throws Exception {
        return this.userRepository.findById(userId).orElseThrow(()->
                new Exception("No User Found"));
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return  this.userRepository.save(user);
    }

//    @PutMapping("/{id}")
//    public User updateUser(@RequestBody User user, @PathVariable (value = "id") long userId){
//        User userOld = this.userRepository.findById(userId).orElseThrow(()->
//                new Exception("No User Found"));
//        userOld.setUserName(userOld.getUserName());
//        userOld.setPassword(userOld.getPassWordHash());
//
//
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable (value = "id") long userId) throws Exception {
        User userOld = this.userRepository.findById(userId).orElseThrow(() ->
                new Exception("No User Found"));
        this.userRepository.delete(userOld);
        return ResponseEntity.ok().build();
    }
}
