package com.chen.springboot.service;

import com.chen.springboot.entity.DissolvedOxygenData;
import com.chen.springboot.mapper.DissolvedOxygenDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DissolvedOxygenDataService {

    @Autowired
    private DissolvedOxygenDataMapper dissolvedOxygenDataMapper;

    public List<DissolvedOxygenData> getAllDissolvedOxygenData() {
        return dissolvedOxygenDataMapper.getAllDissolvedOxygenData();
    }

    public DissolvedOxygenData getDissolvedOxygenDataById(int dataId) {
        return dissolvedOxygenDataMapper.getDissolvedOxygenDataById(dataId);
    }

    public void createDissolvedOxygenData(DissolvedOxygenData dissolvedOxygenData) {
        dissolvedOxygenDataMapper.createDissolvedOxygenData(dissolvedOxygenData);
    }

    public void updateDissolvedOxygenData(DissolvedOxygenData dissolvedOxygenData) {
        dissolvedOxygenDataMapper.updateDissolvedOxygenData(dissolvedOxygenData);
    }

    public void deleteDissolvedOxygenData(int dataId) {
        dissolvedOxygenDataMapper.deleteDissolvedOxygenData(dataId);
    }
}



