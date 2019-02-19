package com.NSSFDataModel;


import java.util.List;

/**
 * @author jhc on 2018/10/13
 */
public class AuthorizedNetworkSliceInfo {
    private List<AllowedNssai> allowedNssaiList ;
    private List<ConfiguredSnssai> configuredNssai ;
    private String targetAmfSet;
    private List<String>  candidateAmfList;
    private List<Snssai> rejectedNssaiInPlmn;
    private List<Snssai> rejectedNssaiInTa;
    private NsiInformation nsiInformation;
    private String supportedFeatures;
    private  String nrfAmfSet;

    public List<AllowedNssai> getAllowedNssaiList() {
        return allowedNssaiList;
    }

    public void setAllowedNssaiList(List<AllowedNssai> allowedNssaiList) {
        this.allowedNssaiList = allowedNssaiList;
    }

    public List<ConfiguredSnssai> getConfiguredNssai() {
        return configuredNssai;
    }

    public void setConfiguredNssai(List<ConfiguredSnssai> configuredNssai) {
        this.configuredNssai = configuredNssai;
    }

    public String getTargetAmfSet() {
        return targetAmfSet;
    }

    public void setTargetAmfSet(String targetAmfSet) {
        this.targetAmfSet = targetAmfSet;
    }

    public List<String> getCandidateAmfList() {
        return candidateAmfList;
    }

    public void setCandidateAmfList(List<String> candidateAmfList) {
        this.candidateAmfList = candidateAmfList;
    }

    public List<Snssai> getRejectedNssaiInPlmn() {
        return rejectedNssaiInPlmn;
    }

    public void setRejectedNssaiInPlmn(List<Snssai> rejectedNssaiInPlmn) {
        this.rejectedNssaiInPlmn = rejectedNssaiInPlmn;
    }

    public List<Snssai> getRejectedNssaiInTa() {
        return rejectedNssaiInTa;
    }

    public void setRejectedNssaiInTa(List<Snssai> rejectedNssaiInTa) {
        this.rejectedNssaiInTa = rejectedNssaiInTa;
    }

    public NsiInformation getNsiInformation() {
        return nsiInformation;
    }

    public void setNsiInformation(NsiInformation nsiInformation) {
        this.nsiInformation = nsiInformation;
    }

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }

    public String getNrfAmfSet() {
        return nrfAmfSet;
    }

    public void setNrfAmfSet(String nrfAmfSet) {
        this.nrfAmfSet = nrfAmfSet;
    }
}
