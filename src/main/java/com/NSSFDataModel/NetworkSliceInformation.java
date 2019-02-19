package com.NSSFDataModel;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author jhc on 2018/12/14
 */
public class NetworkSliceInformation {
    public NFType nfType;
    public String nfInstanceId;
    public SliceInfoForRegistration sliceInfoForRegistration;
    public PlmnId plmnId;
    public Tai tai;
    public String supportedFeatures;
    public NetworkSliceInformation(){

    }

    public NFType getNfType() {
        return nfType;
    }

    public void setNfType(NFType nfType) {
        this.nfType = nfType;
    }

    public String getNfInstanceId() {
        return nfInstanceId;
    }

    public void setNfInstanceId(String nfInstanceId) {
        this.nfInstanceId = nfInstanceId;
    }

    public SliceInfoForRegistration getSliceInfoForRegistration() {
        return sliceInfoForRegistration;
    }

    public void setSliceInfoForRegistration(SliceInfoForRegistration sliceInfoForRegistration) {
        this.sliceInfoForRegistration = sliceInfoForRegistration;
    }

    public PlmnId getPlmnId() {
        return plmnId;
    }

    public void setPlmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
    }

    public Tai getTai() {
        return tai;
    }

    public void setTai(Tai tai) {
        this.tai = tai;
    }

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }
}
