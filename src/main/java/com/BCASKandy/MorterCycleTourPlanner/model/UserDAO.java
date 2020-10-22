package com.BCASKandy.MorterCycleTourPlanner.model;

import java.util.List;

public interface UserDAO {

    public User create(User user);

    public void delete(Long id);

    public User retrieve(Long id);

    public User retrieveByUserName(String username);

    public List<User> retrieveAll();

    public List<User> retrieveLikeMatching(String surname, String firstname);

    public List<User> retrieveAll(List<Role> userRoles);

    public List<User> retrieveLikeMatching(String surname, String firstname, List<Role> userRoles);

    public User update(User entity);

    public void deleteAll();

}
