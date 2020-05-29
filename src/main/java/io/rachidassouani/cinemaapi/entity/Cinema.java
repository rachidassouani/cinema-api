package io.rachidassouani.cinemaapi.entity;

import java.io.Serializable;

public class Cinema implements Serializable {
    private Long id;
    private String name;
    private String address;
    private int countRooms;

    // constructors
    public Cinema() {}

    public Cinema(String name, String address, int countRooms) {
        this.name = name;
        this.address = address;
        this.countRooms = countRooms;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCountRooms() {
        return countRooms;
    }

    public void setCountRooms(int countRooms) {
        this.countRooms = countRooms;
    }
}
