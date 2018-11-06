package com.edwin.springcloud.controller;

import com.edwin.springcloud.entities.Dept;
import com.edwin.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wenpuzhao on 2018/10/11.
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id){
        return service.get(id);
    }

    @RequestMapping(value = "consumer/dept/list")
    public List<Dept> list(){
        return service.list();
    }

    @RequestMapping(value = "consumer/dept/add")
    public Object add(Dept dept){
        return service.add(dept);
    }

}
