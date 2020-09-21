package com.hd.boot.service.impl;

import com.hd.boot.mapper.EmpMapper;
import com.hd.boot.pojo.EmpInfo;
import com.hd.boot.service.EmpService;
import com.hd.boot.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public JsonData allEmp() {
        List<EmpInfo> all = empMapper.findAll();
        return JsonData.buildSuc(all);
    }
}
