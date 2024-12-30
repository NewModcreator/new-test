package com.chen.springboot.controller;

import com.chen.springboot.entity.TurbidityData;
import com.chen.springboot.service.TurbidityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turbidity-data")
public class TurbidityDataController {

    @Autowired
    private TurbidityDataService turbidityDataService;

    @GetMapping
    public List<TurbidityData> getAllTurbidityData() {
        return turbidityDataService.getAllTurbidityData();
    }

    @GetMapping("/{dataId}")
    public TurbidityData getTurbidityDataById(@PathVariable int dataId) {
        return turbidityDataService.getTurbidityDataById(dataId);
    }

    @PostMapping
    public void createTurbidityData(@RequestBody TurbidityData turbidityData) {
        turbidityDataService.createTurbidityData(turbidityData);
    }

    @PutMapping
    public void updateTurbidityData(@RequestBody TurbidityData turbidityData) {
        turbidityDataService.updateTurbidityData(turbidityData);
    }

    @DeleteMapping("/{dataId}")
    public void deleteTurbidityData(@PathVariable int dataId) {
        turbidityDataService.deleteTurbidityData(dataId);
    }
}



