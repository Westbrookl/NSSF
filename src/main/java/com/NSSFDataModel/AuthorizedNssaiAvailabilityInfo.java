package com.NSSFDataModel;

import java.util.List;

/**
 * @author jhc on 2018/10/15
 */
public class AuthorizedNssaiAvailabilityInfo {
    private List<AuthorizedNssaiAvailabilityData> authorizedNssaiAvailabilityData;
    private String nfNssaiAvailabilityUri;
    private String supportedFeatures;

    public List<AuthorizedNssaiAvailabilityData> getAuthorizedNssaiAvailabilityData() {
        return authorizedNssaiAvailabilityData;
    }

    public void setAuthorizedNssaiAvailabilityData(List<AuthorizedNssaiAvailabilityData> authorizedNssaiAvailabilityData) {
        this.authorizedNssaiAvailabilityData = authorizedNssaiAvailabilityData;
    }

    public String getNfNssaiAvailabilityUri() {
        return nfNssaiAvailabilityUri;
    }

    public void setNfNssaiAvailabilityUri(String nfNssaiAvailabilityUri) {
        this.nfNssaiAvailabilityUri = nfNssaiAvailabilityUri;
    }

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }
}
