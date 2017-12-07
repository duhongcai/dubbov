package cn.qtec.study.dubbov.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by duhc on 2017/12/6.
 */
@Controller
public class CommonController {

    @RequestMapping(value = "/")
    public String toIndex(){
        System.out.println("转到index");
        return "index";
    }

    @RequestMapping(value = "/icons")
    public String toMain(){
        return "/manager/icons";
    }
}
