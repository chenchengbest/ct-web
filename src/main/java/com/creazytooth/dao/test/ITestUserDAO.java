package com.creazytooth.dao.test;

import com.creazytooth.model.test.test_user;

/**
 * The type Test user dao.
 *
 * @author chencheng
 * @date 2016 -08-06 21:40:00
 */
public interface ITestUserDAO {
    /**
     * Delete by primary key int.
     *
     * @param userId the user id
     * @return the int
     * @author chencheng
     * @date 2016 -08-06 21:40:00
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -08-06 21:40:00
     */
    int insert(test_user record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -08-06 21:40:01
     */
    int insertSelective(test_user record);

    /**
     * Select by primary key test user.
     *
     * @param userId the user id
     * @return the test user
     * @author chencheng
     * @date 2016 -08-06 21:40:01
     */
    test_user selectByPrimaryKey(Integer userId);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -08-06 21:40:01
     */
    int updateByPrimaryKeySelective(test_user record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -08-06 21:40:01
     */
    int updateByPrimaryKey(test_user record);
}