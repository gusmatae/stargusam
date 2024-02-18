    package kr.bit.com.controller;

    import java.util.List;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.RequestMapping;

    import kr.bit.com.service.demoService;
    import kr.bit.com.vo.vo;


    @Controller
    public class demoController {

        @Autowired
        demoService demoservice;

        @RequestMapping("/aaa")
        public String requestMethodName(Model model) {
            List<vo> list = demoservice.showList();
            model.addAttribute("list", list);
            return "index";
        }
        
    }
    