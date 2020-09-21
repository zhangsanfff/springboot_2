package com.hd.boot.mapper;

import com.hd.boot.pojo.EmpInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpMapper {

    @Select("select * from emp")
    public List<EmpInfo> findAll();

}
