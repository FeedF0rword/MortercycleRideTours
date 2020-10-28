package com.BCASKandy.MorterCycleTourPlanner.dao;
    import com.BCASKandy.MorterCycleTourPlanner.model.Rideout;
    import com.BCASKandy.MorterCycleTourPlanner.model.RideoutState;
    import com.BCASKandy.MorterCycleTourPlanner.model.User;

    import java.util.List;

    public interface RideoutDAO {

        public Rideout createRideout(Rideout rideout);

        public Rideout update(Rideout rideout);

        public void delete(Long Id);

        public Rideout retrieve(Long id);

        public List<Rideout> retrieveAll();

        public void deleteAll();

        public List<Rideout> retrieveLikeMatching(String title);

        public List<Rideout> retrieveLikeMatching(String title, List<RideoutState> rideoutStates);

        public List<Rideout> retrieveAllByRideLeader(User rideLeader, List<RideoutState> rideoutStates);

        public List<Rideout> retrieveAllByRider(User rider, List<RideoutState> rideoutStates);

        public List<Rideout> retrieveAll(List<RideoutState> rideoutStates);

        public List<Rideout> retrieveAllWaitListByRider(User rider, List<RideoutState> rideoutStates);

}
