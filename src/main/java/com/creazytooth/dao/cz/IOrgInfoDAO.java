package com.creazytooth.dao.cz;

import com.creazytooth.model.cz.OrgInfo;

/**
 * The type Org info dao.
 *
 * @author chencheng
 * @date 2016 -07-23 22:20:11
 */
public interface IOrgInfoDAO {
    /**
     * Delete by primary key int.
     *
     * @param orgid the orgid
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:39:44
     */
    int deleteByPrimaryKey(Integer orgid);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:39:44
     */
    int insert(OrgInfo record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:39:44
     */
    int insertSelective(OrgInfo record);

    /**
     * Select by primary key org info.
     *
     * @param orgid the orgid
     * @return the org info
     * @author chencheng
     * @date 2016 -07-23 21:39:44
     */
    OrgInfo selectByPrimaryKey(Integer orgid);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:39:44
     */
    int updateByPrimaryKeySelective(OrgInfo record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     * @author chencheng
     * @date 2016 -07-23 21:39:44
     */
    int updateByPrimaryKey(OrgInfo record);
}