package com.chen.springboot.controller;

import com.chen.springboot.entity.DissolvedOxygenData;
import com.chen.springboot.service.DissolvedOxygenDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dissolved-oxygen-data")
public class DissolvedOxygenDataController {

    @Autowired
    private DissolvedOxygenDataService dissolvedOxygenDataService;

    @GetMapping
    public List<DissolvedOxygenData> getAllDissolvedOxygenData() {
        return dissolvedOxygenDataService.getAllDissolvedOxygenData();
    }

    @GetMapping("/{dataId}")
    public DissolvedOxygenData getDissolvedOxygenDataById(@PathVariable int dataId) {
        return dissolvedOxygenDataService.getDissolvedOxygenDataById(dataId);
    }

    @PostMapping
    public void createDissolvedOxygenData(@RequestBody DissolvedOxygenData dissolvedOxygenData) {
        dissolvedOxygenDataService.createDissolvedOxygenData(dissolvedOxygenData);
    }

    @PutMapping
    public void updateDissolvedOxygenData(@RequestBody DissolvedOxygenData dissolvedOxygenData) {
        dissolvedOxygenDataService.updateDissolvedOxygenData(dissolvedOxygenData);
    }

    @DeleteMapping("/{dataId}")
    public void deleteDissolvedOxygenData(@PathVariable int dataId) {
        dissolvedOxygenDataService.deleteDissolvedOxygenData(dataId);
    }
}



