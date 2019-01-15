package com.lee;

import com.lee.dao.UserDao;
import com.lee.model.User;
import org.beetl.sql.core.SQLManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeetlSqlApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    public void contextLoads() {
        User www = userDao.select("ww");
        System.out.println(www);
    }

}

