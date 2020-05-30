package io.rachidassouani.cinemaapi.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Session implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double hourStart;

    // constructors
    public Session() {
    }

    public Session(double hourStart) {
        this.hourStart = hourStart;
    }

    //getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getHourStart() {
        return hourStart;
    }

    public void setHourStart(double hourStart) {
        this.hourStart = hourStart;
    }
}
