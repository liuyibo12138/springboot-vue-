package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.config.ZuceInfo;

import com.example.demo.entity.loginDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LoginMapper extends BaseMapper<loginDTO> {
    @Select("select * from account where #{username}=username and #{password} =password")
    public loginDTO findlogin(loginDTO loginDTO);

    @Select("select * from account ")
    public List<loginDTO> findall(loginDTO loginDTO);

    @Insert("insert into account values ( #{username},#{password},0)")
    public void addaccount(ZuceInfo zuceInfo);
    @Insert("insert into tenant values (#{tenantid},#{tenantname},#{tenantgender},#{tenantphone})")
    public void addtenant(ZuceInfo zuceInfo);

    @Select("select * from account where #{username}=username ")
    public List<ZuceInfo> findbyusername(ZuceInfo zuceInfo);
}
