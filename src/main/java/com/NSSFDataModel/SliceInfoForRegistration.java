package com.NSSFDataModel;

import java.util.List;

/**
 * @author jhc on 2018/10/13
 */
public class SliceInfoForRegistration {
    private List<SubscribedSnssai> subscribedNssai;
    private AllowedNssai allowedNssai;
    private List<Snssai> sNssaiForMapping;
    private List<MappingOfRequestedSnssai> mappingOfRequestedNssai;
    private List<Snssai>  requestedNssai;
    private boolean requestMapping;

    public List<SubscribedSnssai> getSubscribedNssai() {
        return subscribedNssai;
    }

    public void setSubscribedNssai(List<SubscribedSnssai> subscribedNssai) {
        this.subscribedNssai = subscribedNssai;
    }

    public AllowedNssai getAllowedNssai() {
        return allowedNssai;
    }

    public void setAllowedNssai(AllowedNssai allowedNssai) {
        this.allowedNssai = allowedNssai;
    }

    public List<Snssai> getsNssaiForMapping() {
        return sNssaiForMapping;
    }

    public void setsNssaiForMapping(List<Snssai> sNssaiForMapping) {
        this.sNssaiForMapping = sNssaiForMapping;
    }

    public List<MappingOfRequestedSnssai> getMappingOfRequestedNssai() {
        return mappingOfRequestedNssai;
    }

    public void setMappingOfRequestedNssai(List<MappingOfRequestedSnssai> mappingOfRequestedNssai) {
        this.mappingOfRequestedNssai = mappingOfRequestedNssai;
    }

    public List<Snssai> getRequestedNssai() {
        return requestedNssai;
    }

    public void setRequestedNssai(List<Snssai> requestedNssai) {
        this.requestedNssai = requestedNssai;
    }

    public boolean isRequestMapping() {
        return requestMapping;
    }

    public void setRequestMapping(boolean requestMapping) {
        this.requestMapping = requestMapping;
    }
}
