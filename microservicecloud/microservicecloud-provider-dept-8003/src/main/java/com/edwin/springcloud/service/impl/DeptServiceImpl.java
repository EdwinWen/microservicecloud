package com.edwin.springcloud.service.impl;

import com.edwin.springcloud.dao.DeptDao;
import com.edwin.springcloud.entities.Dept;
import com.edwin.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by wenpuzhao on 2018/10/12.
 */
@Service
public class DeptServiceImpl implements DeptClientService {

    @Autowired
    private DeptDao dao;


    @Override
    public Dept get(@PathVariable("id") long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }



}