package com.sunglowsys.service;

import com.sunglowsys.domain.A;
import com.sunglowsys.domain.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

    @Autowired
    A a;

    @Autowired
    B b;
    public void service(){
        a.getA();
        b.getB();
    }
}
