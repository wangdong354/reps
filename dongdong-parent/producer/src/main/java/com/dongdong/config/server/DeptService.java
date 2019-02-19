package com.dongdong.config.server;


import com.dongdong.pojo.Dept;

import java.util.List;

public interface DeptService
{
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
