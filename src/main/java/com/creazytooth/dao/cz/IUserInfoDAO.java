package com.creazytooth.dao.cz;

import com.creazytooth.model.cz.UserInfo;

/**
 * The type User info.
 *
 * @author chencheng
 * @date 2016 -07-23 21:40:09
 */
public interface IUserInfoDAO {
    /**
     * Delete by primary key int.
     *
     * @param id the id
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:40:09
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:40:09
     */
    int insert(UserInfo record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:40:09
     */
    int insertSelective(UserInfo record);

    /**
     * Select by primary key user info.
     *
     * @param id the id
     * @return the user info
     * @author chencheng
     * @date 2016 -07-23 21:40:09
     */
    UserInfo selectByPrimaryKey(Integer id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:40:09
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:40:09
     */
    int updateByPrimaryKey(UserInfo record);
}