package com.creazytooth.service;

import com.creazytooth.entity.UserEntity;

import java.util.List;


/**
 * The interface Account service.
 *
 * @author chencheng
 * @date 2016 -07-20 22:46:21
 */
public interface AccountService {
	/**
	 * Save.
	 *
	 * @param loginName the login name
	 * @param passWord  the pass word
	 * @param users     the users
	 * @author chencheng
	 * @date 2016 -07-20 22:46:09
	 */
	public void save(String loginName,String passWord,List<UserEntity> users);

	/**
	 * Save all.
	 *
	 * @param loginName the login name
	 * @param passWord  the pass word
	 * @author chencheng
	 * @date 2016 -07-20 22:46:17
	 */
	public void saveAll(String loginName,String passWord);
}
