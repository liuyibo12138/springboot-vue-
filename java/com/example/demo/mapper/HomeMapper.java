package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.config.HomeaddInfo;
import com.example.demo.entity.home;
import com.example.demo.entity.landlord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.demo.config.HomeInfoResult;
import java.util.List;

@Mapper
public interface HomeMapper extends BaseMapper<home> {

    @Select("select homeid,homeaddress,homesize,hometype,homeprice,h.landlordid,landlordphone from home h left join landlord l on h.landlordid=l.landlordid;")
    public List<HomeInfoResult> findhome();
    @Select("select homeid,homeaddress,homesize,hometype,homeprice,h.landlordid,landlordphone from home h left join landlord l on h.landlordid=l.landlordid where homeid=#{info}")
    public List<HomeInfoResult> searchbyid(Integer info);
    @Select("select homeid,homeaddress,homesize,hometype,homeprice,h.landlordid,landlordphone from home h left join landlord l on h.landlordid=l.landlordid where homeaddress=#{info}")
    public List<HomeInfoResult> searchbyaddress(String info);
    @Select("select homeid,homeaddress,homesize,hometype,homeprice,h.landlordid,landlordphone from home h left join landlord l on h.landlordid=l.landlordid where homesize=#{info}")
    public List<HomeInfoResult> searchbysize(Integer info);
    @Select("select homeid,homeaddress,homesize,hometype,homeprice,h.landlordid,landlordphone from home h left join landlord l on h.landlordid=l.landlordid where homeprice>=#{info}")
    public List<HomeInfoResult> searchbyminprice(Integer info);
    @Select("select homeid,homeaddress,homesize,hometype,homeprice,h.landlordid,landlordphone from home h left join landlord l on h.landlordid=l.landlordid where homeprice<=#{info}")
    public List<HomeInfoResult> searchbymaxprice(Integer info);

    @Insert("insert into home value(#{homeid},#{homeaddress},#{homesize},#{hometype},#{homeprice},#{landlordid})")
    public void addhomeinfo(HomeaddInfo info);
}
