package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.earning;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.demo.config.EarningInfoResult;
import java.util.List;

@Mapper
public interface EarningMapper extends BaseMapper<EarningInfoResult> {

    @Select("select earningid,e.homeid,homesize,hometype,earningmoney from earning e left join home h on e.homeid = h.homeid;")
    public List<EarningInfoResult> findearning();
}
