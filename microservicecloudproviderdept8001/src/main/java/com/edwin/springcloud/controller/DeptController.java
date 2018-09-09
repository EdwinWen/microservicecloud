package com.edwin.springcloud.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wenpuzhao on 2018/9/9.
 */

@RestController
public class DeptController {

    @RequestMapping(value="dept/get/{id}",method= RequestMethod.GET)
    public String get(@PathVariable("id") String id) {
        System.out.println("deptcontroller:--edwin--" + id);
        return "hello,world";

    }
}
