package cn.qtec.study.dubbov.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by duhc on 2017/12/11.
 */
@Controller
@RequestMapping("/system")
public class SystemManagerController {
    @RequestMapping("/operateLog")
    public String operateLog(){
        return "operation/operation";
    }
}
