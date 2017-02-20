package com.creazytooth.interfac.cz;

import com.creazytooth.model.cz.OrgInfo;
import com.creazytooth.model.cz.UserInfo;

/**
 * The type User info service.
 *
 * @author chencheng
 * @date 2016 -07-23 22:33:44
 */
public interface IUserInfoService {
    UserInfo getUserInfoById(UserInfo userInfo);
    void addUserIntoSchool(UserInfo userInfo,OrgInfo org);
}
