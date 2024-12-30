package com.chen.springboot.controller;

import com.chen.springboot.entity.RiverSegment;
import com.chen.springboot.service.RiverSegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/river-segments")
public class RiverSegmentController {

    @Autowired
    private RiverSegmentService riverSegmentService;

    @GetMapping
    public List<RiverSegment> getAllRiverSegments() {
        return riverSegmentService.getAllRiverSegments();
    }

    @GetMapping("/{segmentId}")
    public RiverSegment getRiverSegmentById(@PathVariable int segmentId) {
        return riverSegmentService.getRiverSegmentById(segmentId);
    }

    @PostMapping
    public void createRiverSegment(@RequestBody RiverSegment riverSegment) {
        riverSegmentService.createRiverSegment(riverSegment);
    }

    @PutMapping
    public void updateRiverSegment(@RequestBody RiverSegment riverSegment) {
        riverSegmentService.updateRiverSegment(riverSegment);
    }

    @DeleteMapping("/{segmentId}")
    public void deleteRiverSegment(@PathVariable int segmentId) {
        riverSegmentService.deleteRiverSegment(segmentId);
    }
}



