package com.chen.springboot.controller;

import com.chen.springboot.entity.WaterLevelData;
import com.chen.springboot.service.WaterLevelDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/water-level-data")
public class WaterLevelDataController {

    @Autowired
    private WaterLevelDataService waterLevelDataService;

    @GetMapping
    public List<WaterLevelData> getAllWaterLevelData() {
        return waterLevelDataService.getAllWaterLevelData();
    }

    @GetMapping("/{dataId}")
    public WaterLevelData getWaterLevelDataById(@PathVariable int dataId) {
        return waterLevelDataService.getWaterLevelDataById(dataId);
    }

    @PostMapping
    public void createWaterLevelData(@RequestBody WaterLevelData waterLevelData) {
        waterLevelDataService.createWaterLevelData(waterLevelData);
    }

    @PutMapping
    public void updateWaterLevelData(@RequestBody WaterLevelData waterLevelData) {
        waterLevelDataService.updateWaterLevelData(waterLevelData);
    }

    @DeleteMapping("/{dataId}")
    public void deleteWaterLevelData(@PathVariable int dataId) {
        waterLevelDataService.deleteWaterLevelData(dataId);
    }
}



