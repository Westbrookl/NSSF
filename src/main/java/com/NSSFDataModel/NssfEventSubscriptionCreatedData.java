package com.NSSFDataModel;

import java.util.List;

/**
 * @author jhc on 2018/10/15
 */
public class NssfEventSubscriptionCreatedData {
    private String subscriptionId;
    private List<AuthorizedNssaiAvailabilityData> authorizedNssaiAvailabilityData;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public List<AuthorizedNssaiAvailabilityData> getAuthorizedNssaiAvailabilityData() {
        return authorizedNssaiAvailabilityData;
    }

    public void setAuthorizedNssaiAvailabilityData(List<AuthorizedNssaiAvailabilityData> authorizedNssaiAvailabilityData) {
        this.authorizedNssaiAvailabilityData = authorizedNssaiAvailabilityData;
    }
}
