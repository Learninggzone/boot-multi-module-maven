package edu.domain;

import javax.persistence.*;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long ID;
    private String name;
    private int classification;
    private boolean isOpen;

    protected Hotel(){}

    public Hotel(String name, int classification, boolean isOpen) {
        this.name = name;
        this.classification = classification;
        this.isOpen = isOpen;
    }

    public long getID() {
        return ID;
    }

    public String getName(){
        return name;
    }
}
