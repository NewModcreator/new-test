package com.chen.springboot.controller;

import com.chen.springboot.entity.PHData;
import com.chen.springboot.service.PHDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ph-data")
public class PHDataController {

    @Autowired
    private PHDataService phDataService;

    @GetMapping
    public List<PHData> getAllPHData() {
        return phDataService.getAllPHData();
    }

    @GetMapping("/{dataId}")
    public PHData getPHDataById(@PathVariable int dataId) {
        return phDataService.getPHDataById(dataId);
    }

    @PostMapping
    public void createPHData(@RequestBody PHData phData) {
        phDataService.createPHData(phData);
    }

    @PutMapping
    public void updatePHData(@RequestBody PHData phData) {
        phDataService.updatePHData(phData);
    }

    @DeleteMapping("/{dataId}")
    public void deletePHData(@PathVariable int dataId) {
        phDataService.deletePHData(dataId);
    }
}



