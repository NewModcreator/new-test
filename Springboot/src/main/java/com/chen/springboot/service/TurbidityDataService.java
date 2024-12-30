package com.chen.springboot.service;

import com.chen.springboot.entity.TurbidityData;
import com.chen.springboot.mapper.TurbidityDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurbidityDataService {

    @Autowired
    private TurbidityDataMapper turbidityDataMapper;

    public List<TurbidityData> getAllTurbidityData() {
        return turbidityDataMapper.getAllTurbidityData();
    }

    public TurbidityData getTurbidityDataById(int dataId) {
        return turbidityDataMapper.getTurbidityDataById(dataId);
    }

    public void createTurbidityData(TurbidityData turbidityData) {
        turbidityDataMapper.createTurbidityData(turbidityData);
    }

    public void updateTurbidityData(TurbidityData turbidityData) {
        turbidityDataMapper.updateTurbidityData(turbidityData);
    }

    public void deleteTurbidityData(int dataId) {
        turbidityDataMapper.deleteTurbidityData(dataId);
    }
}



