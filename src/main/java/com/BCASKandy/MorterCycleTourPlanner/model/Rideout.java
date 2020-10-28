package com.BCASKandy.MorterCycleTourPlanner.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="Rideout")
@EntityListeners(AuditingEntityListener.class)

public class Rideout<RideoutState>
{
    private Long id;

    @XmlElementWrapper(name = "Riders")
    @XmlElement(name = "user")
    private List<User> Riders = new ArrayList<User>();

    private User RideLeader;

    private String Description;

    private Integer MaxRiders;

    @XmlElementWrapper(name = "WaitList")
    @XmlElement(name = "user")
    private List<User> waitList= new ArrayList<User>();

    private RideoutState rideoutState;

    @XmlElementWrapper(name = "RideoutDays")
    @XmlElement(name = "rideoutDay")
    private List<RideoutDays> rideoutDays= new ArrayList<RideoutDays>();

    private String Tittle;

    private Date StartDate= new Date();

    private Date LeaseTime= new Date();

    private String  LeaseUserName;

    private List<User> riders;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId(){return id; }
    public void setId(Long id)
    {
        this.id = id;
    }

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )

    @JoinTable(name = "User")
    @OrderBy("userName ASC")
    public List<User> getRiders()
    {
        return Riders;
    }

    public void setRiders(List<User> riders)
    {
        this.riders = Riders;
    }

    public User getRideLeader()
    {
        return RideLeader;
    }

    public void setRideLeader(User rideLeader)
    {
        this.RideLeader = rideLeader;

    }

    public String getDescription()
    {
        return Description;
    }

    public void setDescription(String description)
    {
        this.Description = description;
    }

    public Integer getMaxRiders()
    {
        return MaxRiders;
    }

    public void setMaxRiders(Integer maxRiders)
    {
        this.MaxRiders = maxRiders;
    }

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    @JoinTable(name = "waitList")
    @OrderBy("userName ASC")
    public List<User> getWaitList()
    {
        return waitList;
    }

    public void setWaitList(List<User> waitList)
    {
        this.waitList = waitList;
    }

    public RideoutState getRideoutState()
    {
        return rideoutState;
    }

    public void setRideoutState(RideoutState rideoutState)
    {
        this.rideoutState = rideoutState;
    }

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @OrderColumn(name = "dayindex")
    public List<RideoutDays> getRideOutDay()
    {
        return rideoutDays;
    }

    public void setRideoutDays(List<RideoutDays> rideoutDays)
    {
        this.rideoutDays = rideoutDays;
    }

    public String getTittle()
    {
        return Tittle;
    }

    public void setTittle(String tittle)
    {
        this.Tittle = tittle;
    }

    public Date getStartDate()
    {
        return StartDate;
    }

    public void setStartDate(Date startDate)
    {
        StartDate = startDate;
    }

    public Date getLeaseTime()
    {
        return LeaseTime;
    }

    @Override
    public String toString() {
        return "Rideout{" +
                "id=" + id +
                "Riders=" + Riders +
                ", RideLeader=" + RideLeader +
                ", Description='" + Description + '\'' +
                ", MaxRiders=" + MaxRiders +
                ", waitList=" + waitList +
                ", rideoutState=" + rideoutState +
                ", rideoutDays=" + rideoutDays +
                ", Tittle='" + Tittle + '\'' +
                ", StartDate=" + StartDate +
                ", LeaseTime=" + LeaseTime +
                ", LeaseUserName='" + LeaseUserName + '\'' +
                ", riders=" + riders +
                '}';
    }

    private class PLANNING {
    }
}