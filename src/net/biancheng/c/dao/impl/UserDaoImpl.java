package net.biancheng.c.dao.impl;

import net.biancheng.c.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("C语言中文网");
    }
}
