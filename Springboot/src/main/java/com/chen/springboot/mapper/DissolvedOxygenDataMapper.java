package com.chen.springboot.mapper;

import com.chen.springboot.entity.DissolvedOxygenData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DissolvedOxygenDataMapper {

    @Select("SELECT * FROM dissolved_oxygen_data")
    List<DissolvedOxygenData> getAllDissolvedOxygenData();

    @Select("SELECT * FROM dissolved_oxygen_data WHERE id = #{dataId}")
    DissolvedOxygenData getDissolvedOxygenDataById(int dataId);

    @Insert("INSERT INTO dissolved_oxygen_data(do_value, segment_id) VALUES(#{doValue}, #{segmentId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createDissolvedOxygenData(DissolvedOxygenData dissolvedOxygenData);

    @Update("UPDATE dissolved_oxygen_data SET do_value = #{doValue}, segment_id = #{segmentId} WHERE id = #{id}")
    void updateDissolvedOxygenData(DissolvedOxygenData dissolvedOxygenData);

    @Delete("DELETE FROM dissolved_oxygen_data WHERE id = #{dataId}")
    void deleteDissolvedOxygenData(int dataId);
}



