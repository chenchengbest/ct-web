package com.creazytooth.impl.cz;

import com.creazytooth.dao.cz.IUserInOrgDAO;
import com.creazytooth.dao.cz.IUserInfoDAO;
import com.creazytooth.interfac.cz.IUserInfoService;
import com.creazytooth.model.cz.OrgInfo;
import com.creazytooth.model.cz.UserInOrg;
import com.creazytooth.model.cz.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type User info.
 *
 * @author chencheng
 * @date 2016 -07-23 22:32:28
 */
@Service
public class UserInfoImpl implements IUserInfoService {
    /**
     * The User info.
     *
     * @author chencheng
     * @date 2016 -07-23 22:32:28
     */
    @Autowired
    private IUserInfoDAO userInfoDAO;
    @Autowired
    private IUserInOrgDAO userInOrgDAO;
    @Override
    public UserInfo getUserInfoById(UserInfo userInfo) {
       return userInfoDAO.selectByPrimaryKey(userInfo.getId());
    }

    @Override
    public void addUserIntoSchool(UserInfo userInfo, OrgInfo org) {
        //todo 新增用户并将用户添加到指定的组织机构
        userInfoDAO.insert(userInfo);
        UserInOrg userInOrg=new UserInOrg();
        userInOrg.setUserid(userInfo.getId());
        userInOrg.setOrgid(org.getOrgid());
        userInOrgDAO.insert(userInOrg);
    }
}
