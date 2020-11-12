package com.BCASKandy.MorterCycleTourPlanner.model;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class RideoutDays {
    private long id;
    @XmlElementWrapper(name = "itineraryItems")
    @XmlElement(name = "itineraryItem")
    private List<ItineraryItem> itineraryItems = new ArrayList<ItineraryItem>();

    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId()
    {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @OrderColumn(name = "itineraryIndex")
    public List<ItineraryItem> getItineraryItems()
    {
        return itineraryItems;
    }

    public void setItineraryItems(List<ItineraryItem> itineraryItems) {
        this.itineraryItems = itineraryItems;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RideoutDays{" +
                "id=" + id +
                ", itineraryItems=" + itineraryItems +
                ", description='" + description + '\'' +
                '}';
    }
}