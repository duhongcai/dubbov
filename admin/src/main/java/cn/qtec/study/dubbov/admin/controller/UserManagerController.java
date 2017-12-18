package cn.qtec.study.dubbov.admin.controller;

import cn.qtec.study.dubbov.admin.service.UserService;
import cn.qtec.study.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by duhc on 2017/12/11.
 */
@Controller
@RequestMapping("/user")
public class UserManagerController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        return "user/list";
    }

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public Map<String, Object> getUsers() {
        List<User> allUser = userService.getAllUser();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", allUser);
        map.put("total", allUser.size());
        return map;
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
