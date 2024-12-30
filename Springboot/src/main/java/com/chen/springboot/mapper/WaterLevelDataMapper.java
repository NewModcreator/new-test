package com.chen.springboot.mapper;

import com.chen.springboot.entity.WaterLevelData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WaterLevelDataMapper {

    @Select("SELECT * FROM water_level_data")
    List<WaterLevelData> getAllWaterLevelData();

    @Select("SELECT * FROM water_level_data WHERE id = #{dataId}")
    WaterLevelData getWaterLevelDataById(int dataId);

    @Insert("INSERT INTO water_level_data(water_level, segment_id) VALUES(#{waterLevel}, #{segmentId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createWaterLevelData(WaterLevelData waterLevelData);

    @Update("UPDATE water_level_data SET water_level = #{waterLevel}, segment_id = #{segmentId} WHERE id = #{id}")
    void updateWaterLevelData(WaterLevelData waterLevelData);

    @Delete("DELETE FROM water_level_data WHERE id = #{dataId}")
    void deleteWaterLevelData(int dataId);
}



