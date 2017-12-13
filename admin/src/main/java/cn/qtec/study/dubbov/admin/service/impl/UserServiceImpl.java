package cn.qtec.study.dubbov.admin.service.impl;

import cn.qtec.study.dubbov.admin.service.UserService;
import cn.qtec.study.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by duhc on 2017/12/11.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource(name = "userService")
    cn.qtec.study.interfaces.UserService userService;

    @Override
    public List<User> getAllUser() {
        //cn.qtec.study.interfaces.UserService userService
        List<User> allUser = userService.getAllUser();
        return allUser;
    }
}
