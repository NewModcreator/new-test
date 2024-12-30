package com.chen.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RiverSegment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int segmentId;
    private String name;
    private float length;
    private String riverManager;
    private String contactInfo;

    // Getters and Setters
    public int getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getRiverManager() {
        return riverManager;
    }

    public void setRiverManager(String riverManager) {
        this.riverManager = riverManager;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}



