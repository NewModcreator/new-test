package com.chen.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class DissolvedOxygenData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dataId;
    private Date timestamp;
    private float doValue;
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

    public float getDoValue() {
        return doValue;
    }

    public void setDoValue(float doValue) {
        this.doValue = doValue;
    }

    public int getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }
}



