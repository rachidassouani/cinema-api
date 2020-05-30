package io.rachidassouani.cinemaapi.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Room implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    private int countSeats;

    @ManyToOne
    private Cinema cinema;

    @OneToMany(mappedBy = "room")
    private Collection<Seat> seats;

    @OneToMany(mappedBy = "room")
    private Collection<ProjectionMovie> projectionMovies;

    // constructors
    public Room() {
    }

    public Room(String name, int countSeats, Cinema cinema) {
        this.name = name;
        this.countSeats = countSeats;
        this.cinema = cinema;
    }

    // getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public void setCountSeats(int countSeats) {
        this.countSeats = countSeats;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Collection<Seat> seats) {
        this.seats = seats;
    }

    public Collection<ProjectionMovie> getProjectionMovies() {
        return projectionMovies;
    }

    public void setProjectionMovies(Collection<ProjectionMovie> projectionMovies) {
        this.projectionMovies = projectionMovies;
    }
}
