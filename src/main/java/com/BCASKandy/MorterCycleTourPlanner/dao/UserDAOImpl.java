package com.BCASKandy.MorterCycleTourPlanner.dao;

import com.BCASKandy.MorterCycleTourPlanner.controller.UserController;
import com.BCASKandy.MorterCycleTourPlanner.model.Role;
import com.BCASKandy.MorterCycleTourPlanner.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    @Autowired
    UserController userController;


    @Override
    public User create(User user) {

        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User retrieve(Long id) {
        return null;
    }

    @Override
    public User retrieveByUserName(String username) {
        return null;
    }

    @Override
    public List<User> retrieveAll() {
        return null;
    }

    @Override
    public List<User> retrieveLikeMatching(String surname, String firstname) {
        return null;
    }

    @Override
    public List<User> retrieveAll(List<Role> userRoles) {
        return null;
    }

    @Override
    public List<User> retrieveLikeMatching(String surname, String firstname, List<Role> userRoles) {
        return null;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
