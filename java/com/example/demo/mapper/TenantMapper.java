package com.example.demo.mapper;

import com.example.demo.entity.tenant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TenantMapper {
    @Select("select * from tenant")
    public List<tenant> findtenant();
}
