package com.hd.boot.controller;

import com.hd.boot.service.EmpService;
import com.hd.boot.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/allEmp")
    public JsonData allEmp(){
        JsonData jsonData = empService.allEmp();
        return jsonData;
    }

}
