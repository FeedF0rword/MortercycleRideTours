package com.BCASKandy.MorterCycleTourPlanner.dao;

import com.BCASKandy.MorterCycleTourPlanner.model.Role;
import com.BCASKandy.MorterCycleTourPlanner.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf)
    {
        this.sessionFactory = sf;
    }

    @Override
    public User create(User user) {

        Session session = this.sessionFactory.getCurrentSession();
        session.save(user);
        return null;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        User user = retrieve(id);
        session.delete(user);
    }

    @Override
    public User retrieve(Long id) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.get(User.class,id);
        return user;
    }

    @Override
    public User retrieveByUserName(String username) {
        return null;
    }

    @Override
    public List<User> retrieveAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List<User> userList = session.createQuery("from User").list();
        return userList;
    }

    @Override
    public List<User> retrieveLikeMatching(String surname, String firstname) {
        return null;
    }

    @Override
    public List<User> retrieveAll(List<Role> userRoles) {
//        with aUth???
        List <User> userList = retrieveAll();
        return userList;
    }

    @Override
    public List<User> retrieveLikeMatching(String surname, String firstname, List<Role> userRoles) {
        return null;
    }

    @Override
    public User update(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
        return user;
    }

    @Override
    public void deleteAll() {

    }
}
