package com.BCASKandy.MorterCycleTourPlanner.dao;

import com.BCASKandy.MorterCycleTourPlanner.model.Rideout;
import com.BCASKandy.MorterCycleTourPlanner.model.RideoutState;
import com.BCASKandy.MorterCycleTourPlanner.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class RideoutDAOImpl implements RideoutDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf)
    {
        this.sessionFactory = sf;
    }
    @Override
    public Rideout createRideout(Rideout rideout) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(rideout);
        return rideout;
    }

    @Override
    public Rideout update(Rideout rideout) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(rideout);
        return rideout;
    }

    @Override
    public void delete(Long Id) {
        Session session = sessionFactory.getCurrentSession();
        Rideout rideout = retrieve(Id);
        session.delete(rideout);
    }

    @Override
    public Rideout retrieve(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Rideout rideout = (Rideout) session.get(Rideout.class,id);
        return rideout;
    }

    @Override
    public List<Rideout> retrieveAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Rideout> rideoutList = session.createQuery("from Rideout").list();
        return rideoutList;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Rideout> retrieveLikeMatching(String title) {
        return null;
    }

    @Override
    public List<Rideout> retrieveLikeMatching(String title, List<RideoutState> rideoutStates) {
        return null;
    }

    @Override
    public List<Rideout> retrieveAllByRideLeader(User rideLeader, List<RideoutState> rideoutStates) {
        return null;
    }

    @Override
    public List<Rideout> retrieveAllByRider(User rider, List<RideoutState> rideoutStates) {
        return null;
    }

    @Override
    public List<Rideout> retrieveAll(List<RideoutState> rideoutStates) {
        return null;
    }

    @Override
    public List<Rideout> retrieveAllWaitListByRider(User rider, List<RideoutState> rideoutStates) {
        return null;
    }
}
