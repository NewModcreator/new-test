package com.chen.springboot.service;

import com.chen.springboot.entity.RiverSegment;
import com.chen.springboot.mapper.RiverSegmentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiverSegmentService {

    @Autowired
    private RiverSegmentsMapper riverSegmentsMapper;

    public List<RiverSegment> getAllRiverSegments() {
        return riverSegmentsMapper.getAllRiverSegments();
    }

    public RiverSegment getRiverSegmentById(int segmentId) {
        return riverSegmentsMapper.getRiverSegmentById(segmentId);
    }

    public void createRiverSegment(RiverSegment riverSegment) {
        riverSegmentsMapper.createRiverSegment(riverSegment);
    }

    public void updateRiverSegment(RiverSegment riverSegment) {
        riverSegmentsMapper.updateRiverSegment(riverSegment);
    }

    public void deleteRiverSegment(int segmentId) {
        riverSegmentsMapper.deleteRiverSegment(segmentId);
    }
}



