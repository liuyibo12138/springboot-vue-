package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.config.LeaseDelete;
import com.example.demo.config.LeaseHome;
import com.example.demo.entity.lease;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LeaseMapper extends BaseMapper<lease> {
    @Select("select * from lease")
    public List<lease> findlease();

    @Insert("insert into lease value(#{leaseid},#{homeid},#{tenantid})")
    public void addlease(LeaseHome info);

    @Select("select leaseid,h.homeid,tenantid,hometype,homeprice,homeaddress from lease l join home h on l.homeid=h.homeid where l.tenantid=2 ")
    public List<LeaseHome> findalllease();

    @Delete("delete from lease where tenantid=2 and homeid=#{homeid}")
    public void deletelease(LeaseDelete info);
}
