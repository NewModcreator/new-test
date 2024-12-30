package com.chen.springboot.service;

import com.chen.springboot.entity.WaterLevelData;
import com.chen.springboot.mapper.WaterLevelDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterLevelDataService {

    @Autowired
    private WaterLevelDataMapper waterLevelDataMapper;

    public List<WaterLevelData> getAllWaterLevelData() {
        return waterLevelDataMapper.getAllWaterLevelData();
    }

    public WaterLevelData getWaterLevelDataById(int dataId) {
        return waterLevelDataMapper.getWaterLevelDataById(dataId);
    }

    public void createWaterLevelData(WaterLevelData waterLevelData) {
        waterLevelDataMapper.createWaterLevelData(waterLevelData);
    }

    public void updateWaterLevelData(WaterLevelData waterLevelData) {
        waterLevelDataMapper.updateWaterLevelData(waterLevelData);
    }

    public void deleteWaterLevelData(int dataId) {
        waterLevelDataMapper.deleteWaterLevelData(dataId);
    }
}



