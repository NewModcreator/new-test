package com.chen.springboot.service;

import com.chen.springboot.entity.PHData;
import com.chen.springboot.mapper.PHDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PHDataService {

    @Autowired
    private PHDataMapper phDataMapper;

    public List<PHData> getAllPHData() {
        return phDataMapper.getAllPHData();
    }

    public PHData getPHDataById(int dataId) {
        return phDataMapper.getPHDataById(dataId);
    }

    public void createPHData(PHData phData) {
        phDataMapper.createPHData(phData);
    }

    public void updatePHData(PHData phData) {
        phDataMapper.updatePHData(phData);
    }

    public void deletePHData(int dataId) {
        phDataMapper.deletePHData(dataId);
    }
}



