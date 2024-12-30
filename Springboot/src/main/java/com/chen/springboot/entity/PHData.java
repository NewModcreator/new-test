package com.chen.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PHData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dataId;
    private Date timestamp;
    private float phValue;
    private int segmentId;

    // Getters and Setters
    public int getDataId() {
        return dataId;
    }

    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public float getPhValue() {
        return phValue;
    }

    public void setPhValue(float phValue) {
        this.phValue = phValue;
    }

    public int getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }
}



