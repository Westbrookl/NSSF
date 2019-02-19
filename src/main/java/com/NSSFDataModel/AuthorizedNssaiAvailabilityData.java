package com.NSSFDataModel;

import java.util.List;

/**
 * @author jhc on 2018/10/15
 */
public class AuthorizedNssaiAvailabilityData {
   private Tai tai;
   private List<Snssai> supportedSnssai;
   private RestrictedSnssai restrictedSnssai;

    public Tai getTai() {
        return tai;
    }

    public void setTai(Tai tai) {
        this.tai = tai;
    }

    public List<Snssai> getSupportedSnssai() {
        return supportedSnssai;
    }

    public void setSupportedSnssai(List<Snssai> supportedSnssai) {
        this.supportedSnssai = supportedSnssai;
    }

    public RestrictedSnssai getRestrictedSnssai() {
        return restrictedSnssai;
    }

    public void setRestrictedSnssai(RestrictedSnssai restrictedSnssai) {
        this.restrictedSnssai = restrictedSnssai;
    }
}
