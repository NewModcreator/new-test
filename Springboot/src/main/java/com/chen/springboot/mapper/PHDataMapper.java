package com.chen.springboot.mapper;

import com.chen.springboot.entity.PHData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PHDataMapper {

    @Select("SELECT * FROM ph_data")
    List<PHData> getAllPHData();

    @Select("SELECT * FROM ph_data WHERE id = #{dataId}")
    PHData getPHDataById(int dataId);

    @Insert("INSERT INTO ph_data(ph_value, segment_id) VALUES(#{phValue}, #{segmentId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createPHData(PHData phData);

    @Update("UPDATE ph_data SET ph_value = #{phValue}, segment_id = #{segmentId} WHERE id = #{id}")
    void updatePHData(PHData phData);

    @Delete("DELETE FROM ph_data WHERE id = #{dataId}")
    void deletePHData(int dataId);
}



