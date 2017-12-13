package cn.qtec.study.service;

import cn.qtec.study.entity.User;
import cn.qtec.study.interfaces.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duhc on 2017/12/13.
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUser() {
        User user;
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            user = new User();
            user.setUserName("duhc"+i);
            user.setAge(10+i);
            user.setPassword("1103320");
            user.setUserId(Long.valueOf(i+1));
            users.add(user);
        }
        System.out.println("输出用户");
        return users;
    }
}
