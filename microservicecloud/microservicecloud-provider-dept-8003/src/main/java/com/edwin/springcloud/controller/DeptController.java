package com.edwin.springcloud.controller;

import com.edwin.springcloud.entities.Dept;
import com.edwin.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wenpuzhao on 2018/10/12.
 */
@RestController
public class DeptController {

    @Autowired
    DeptClientService service;

    @RequestMapping(value = "dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id){
        return  service.get(id);
    }
}
