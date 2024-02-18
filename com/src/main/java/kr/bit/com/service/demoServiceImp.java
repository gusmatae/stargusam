package kr.bit.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.bit.com.mapper.demoMapper;
import kr.bit.com.vo.vo;

@Service
public class demoServiceImp implements demoService{

    @Autowired
    demoMapper demomapper;

    @Override
    public List<vo> showList() {
        List<vo> list = demomapper.showList();
        return list;
    }
    
}
