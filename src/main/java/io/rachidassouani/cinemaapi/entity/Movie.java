package io.rachidassouani.cinemaapi.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
public class Movie implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String title;

    @Column(length = 50)
    private String director;

    private String description;
    private String duration;
    private String photo;
    private Date releaseDate;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "movie")
    private Collection<ProjectionMovie> projectionMovies;

    // constructors
    public Movie() {
    }

    public Movie(String title, String duration, String director, String description) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.description = description;
    }

    // getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Collection<ProjectionMovie> getProjectionMovies() {
        return projectionMovies;
    }

    public void setProjectionMovies(Collection<ProjectionMovie> projectionMovies) {
        this.projectionMovies = projectionMovies;
    }
}
