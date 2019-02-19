package com.NSSFDataModel;

import java.util.List;

/**
 * @author jhc on 2018/10/13
 */
public class AllowedNssai {
    private List<AllowedSnssai> allowedSnssaiList ;
    private AccessType accessType;

    public List<AllowedSnssai> getAllowedSnssaiList() {
        return allowedSnssaiList;
    }

    public void setAllowedSnssaiList(List<AllowedSnssai> allowedSnssaiList) {
        this.allowedSnssaiList = allowedSnssaiList;
    }

    public AccessType getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }
}
