package com.zyl.services;

import com.zyl.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoDao demoDao;
    public String hello1(){
        return demoDao.hello1();
    }
}
