package com.chen.springboot.mapper;

import com.chen.springboot.entity.RiverSegment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RiverSegmentsMapper {

    @Select("SELECT * FROM river_segments")
    List<RiverSegment> getAllRiverSegments();

    @Select("SELECT * FROM river_segments WHERE id = #{segmentId}")
    RiverSegment getRiverSegmentById(int segmentId);

    @Insert("INSERT INTO river_segments(name, length, river_manager, contact_info) VALUES(#{name}, #{length}, #{riverManager}, #{contactInfo})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createRiverSegment(RiverSegment riverSegment);

    @Update("UPDATE river_segments SET name = #{name}, length = #{length}, river_manager = #{riverManager}, contact_info = #{contactInfo} WHERE id = #{id}")
    void updateRiverSegment(RiverSegment riverSegment);

    @Delete("DELETE FROM river_segments WHERE id = #{segmentId}")
    void deleteRiverSegment(int segmentId);
}



