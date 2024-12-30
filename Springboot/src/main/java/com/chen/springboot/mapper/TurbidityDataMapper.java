package com.chen.springboot.mapper;

import com.chen.springboot.entity.TurbidityData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TurbidityDataMapper {

    @Select("SELECT * FROM turbidity_data")
    List<TurbidityData> getAllTurbidityData();

    @Select("SELECT * FROM turbidity_data WHERE id = #{dataId}")
    TurbidityData getTurbidityDataById(int dataId);

    @Insert("INSERT INTO turbidity_data(turbidity, segment_id) VALUES(#{turbidity}, #{segmentId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createTurbidityData(TurbidityData turbidityData);

    @Update("UPDATE turbidity_data SET turbidity = #{turbidity}, segment_id = #{segmentId} WHERE id = #{id}")
    void updateTurbidityData(TurbidityData turbidityData);

    @Delete("DELETE FROM turbidity_data WHERE id = #{dataId}")
    void deleteTurbidityData(int dataId);
}



