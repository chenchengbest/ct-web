package com.creazytooth.dao.cz;

import com.creazytooth.model.cz.UserInOrg;

/**
 * The type User in org.
 *
 * @author chencheng
 * @date 2016 -07-23 21:40:30
 */
public interface IUserInOrgDAO {
    /**
     * Delete by primary key int.
     *
     * @param ctUserorgrelationid the ct userorgrelationid
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:40:31
     */
    int deleteByPrimaryKey(Integer ctUserorgrelationid);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:40:31
     */
    int insert(UserInOrg record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:40:31
     */
    int insertSelective(UserInOrg record);

    /**
     * Select by primary key user in org.
     *
     * @param ctUserorgrelationid the ct userorgrelationid
     * @return the user in org
     * @author chencheng
     * @date 2016 -07-23 21:40:31
     */
    UserInOrg selectByPrimaryKey(Integer ctUserorgrelationid);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:40:31
     */
    int updateByPrimaryKeySelective(UserInOrg record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:40:31
     */
    int updateByPrimaryKey(UserInOrg record);
}