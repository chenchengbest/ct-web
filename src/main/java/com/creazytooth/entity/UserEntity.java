package com.creazytooth.entity;

/**
 * The type User entity.
 */
public class UserEntity {
    private String UserName;
    private String Sex;

    /**
     * Instantiates a new User entity.
     *
     * @param userName the user name
     * @param sex      the sex
     */
    public UserEntity(String userName, String sex) {
        UserName = userName;
        Sex = sex;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        UserName = userName;
    }

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex() {
        return Sex;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex) {
        Sex = sex;
    }
}
