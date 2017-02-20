package com.creazytooth.model.cz;

/**
 * The type Org info.
 *
 * @author chencheng
 * @date 2016 -07-23 18:55:36
 */
public class OrgInfo {
    /**
     * The Orgid.
     *
     * @author chencheng
     * @date 2016 -07-23 18:55:36
     */
    private Integer orgid;

    /**
     * The Orgname.
     *
     * @author chencheng
     * @date 2016 -07-23 18:55:36
     */
    private String orgname;

    /**
     * Get orgid integer.
     *
     * @return the integer
     * @author chencheng
     * @date 2016 -07-23 18:55:36
     */
    public Integer getOrgid() {
        return orgid;
    }

    /**
     * Set orgid.
     *
     * @param orgid the orgid
     * @author chencheng
     * @date 2016 -07-23 18:55:36
     */
    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    /**
     * Get orgname string.
     *
     * @return the string
     * @author chencheng
     * @date 2016 -07-23 18:55:36
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * Set orgname.
     *
     * @param orgname the orgname
     * @author chencheng
     * @date 2016 -07-23 18:55:36
     */
    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }
}