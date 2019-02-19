package com.dongdong.config.server.impl;


import com.dongdong.pojo.Dept;
import com.dongdong.config.dao.DeptDao;
import com.dongdong.config.server.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;


    @Override
    public boolean add(Dept dept)
    {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return deptDao.findAll();
    }
}
