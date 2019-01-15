package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoImpl implements UserDao {


    public List<User> selectList() {
        List<User> users = new ArrayList<User>();
        for(int i = 1 ; i <= 10; i++){
            User user = new User();
            user.setId(i);
            user.setUsername("TOM"+i);
            user.setBirthday(new Date());
            user.setPrice(11.11+i);
            users.add(user);
        }
        return users;
    }
}
