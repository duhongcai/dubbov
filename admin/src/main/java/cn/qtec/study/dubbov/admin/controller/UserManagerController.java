package cn.qtec.study.dubbov.admin.controller;

import cn.qtec.study.dubbov.admin.service.UserService;
import cn.qtec.study.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by duhc on 2017/12/11.
 */
@Controller
@RequestMapping("/user")
public class UserManagerController {

    @Autowired
    UserService userService;
    @RequestMapping
    public String list(Model model) {
        List<User> allUser = userService.getAllUser();
        model.addAttribute("users",allUser);
        return "user/list";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "user/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        List<User> allUser = userService.getAllUser();
        return "user/list";
    }
}
