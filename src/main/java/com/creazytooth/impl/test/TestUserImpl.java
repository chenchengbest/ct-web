package com.creazytooth.impl.test;

import com.creazytooth.dao.test.ITestUserDAO;
import com.creazytooth.interfac.test.ITestUser;
import com.creazytooth.model.test.test_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/7 0007.
 */
@Service
public class TestUserImpl implements ITestUser {
    @Autowired
    private ITestUserDAO testUserDAO;
    /**
     * Get test user by id test user.
     *
     * @return the test user
     * @author chencheng
     * @date 2016 -08-07 10:34:07
     */
    public test_user getTestUserById() {
       return testUserDAO.selectByPrimaryKey(1);
    }
}
