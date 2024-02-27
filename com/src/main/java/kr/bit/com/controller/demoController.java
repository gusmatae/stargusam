    package kr.bit.com.controller;

    import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.RequestMapping;

import kr.bit.com.service.demoServiceImp;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



    @Controller
    public class demoController {

        @Autowired
        demoServiceImp demoserviceimp;

        @RequestMapping("/aaa")
        public String requestMethodName(Model model) {
            
            return "index";
        }

        @ResponseBody
        @RequestMapping("/bbb")
        public Map<String, Object> requestMethodName() {
            Map<String, Object> list = demoserviceimp.showList();
            return list;
        }
        
        
    }
    