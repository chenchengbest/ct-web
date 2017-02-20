package com.creazytooth.common.db;

import java.util.List;

/**
 * Created by Administrator on 2016/7/11.
 */
public interface DaoInterface<T> {
    /**
     * 添加单个实体
     * @param entity
     * @return
     */
    Boolean addEntity(T entity);

    /**
     * 查找单个符合条件的实体
     * @param entity
     * @return
     */
    T findSingleEntity(T entity);

    /**
     * 查找符合条件的集合
     * @param entity
     * @return
     */
    List<T> findEntities(T entity);
}
