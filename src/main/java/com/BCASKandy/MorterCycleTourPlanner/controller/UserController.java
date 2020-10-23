package com.BCASKandy.MorterCycleTourPlanner.controller;

import com.BCASKandy.MorterCycleTourPlanner.model.User;
import com.BCASKandy.MorterCycleTourPlanner.repository.UserRepository;
import com.BCASKandy.MorterCycleTourPlanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public void getAllUsers(Model model){
        
    }



}
