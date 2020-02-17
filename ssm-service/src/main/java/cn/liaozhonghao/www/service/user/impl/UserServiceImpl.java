package cn.liaozhonghao.www.service.user.impl;

import cn.liaozhonghao.www.dao.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.liaozhonghao.www.pojo.User;
import cn.liaozhonghao.www.service.user.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
