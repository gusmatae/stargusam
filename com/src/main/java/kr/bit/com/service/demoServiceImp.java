package kr.bit.com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.bit.com.mapper.demoMapper;

@Service
public class demoServiceImp{

    @Autowired
    demoMapper demomapper;

    public Map<String, Object> showList() {
        List<Map<String, Object>> list = demomapper.showList();
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("list", list);
        return result;
    }
    
}
