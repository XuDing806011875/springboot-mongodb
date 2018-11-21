package com.dingxu.mongodb;

import com.dingxu.mongodb.dao.UserDao;
import com.dingxu.mongodb.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private UserDao userDao;

    @Test
    public void testSaveUser() throws Exception {
        User user=new User();
        user.setId(10l);
        user.setName("小明");
        user.setAge(22);
        user.setGender(1);
        userDao.saveUser(user);
    }

    @Test
    public void findUserByUserName(){
        User user= userDao.findUserByUserName("小明");
        System.out.println("user is "+user);
    }

    @Test
    public void updateUser(){
        User user=new User();
        user.setId(2l);
        user.setName("天空");
        user.setAge(18);
        user.setGender(2);
        userDao.updateUser(user);
    }

    @Test
    public void deleteUserById(){
        userDao.deleteUserById(1l);
    }

}
