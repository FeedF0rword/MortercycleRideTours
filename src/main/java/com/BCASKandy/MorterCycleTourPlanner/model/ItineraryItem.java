package com.BCASKandy.MorterCycleTourPlanner.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

@Entity
public class ItineraryItem {

    private long id;

    private String startTime;

    private String endTime;

    private String description;

    private String bookingReference;

    private Address address;

    private double distance;

    private String gisRoute;

    private ItineraryItemType itineraryItemType = ItineraryItemType.STOP;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String getEndTime()
    {
        return endTime;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getBookingReference()
    {
        return bookingReference;
    }

    public void setBookingReference(String bookingReference)
    {
        this.bookingReference = bookingReference;
    }

    @Embedded
    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public double getDistance()
    {
        return distance;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public void setGisRoute(String gisRoute)
    {
        this.gisRoute = gisRoute;
    }

    public String getGisRoute()
    {
        return gisRoute;
    }

    public ItineraryItemType getItineraryItemType()
    {
        return itineraryItemType;
    }

    @Override
    public String toString() {
        return "ItineraryItem{" +
                "id=" + id +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", description='" + description + '\'' +
                ", bookingReference='" + bookingReference + '\'' +
                ", address=" + address +
                ", distance=" + distance +
                ", gisRoute='" + gisRoute + '\'' +
                ", itineraryItemType=" + itineraryItemType +
                '}';
    }
}
