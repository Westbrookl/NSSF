package com.NSSFDataModel;

/**
 * @author jhc on 2018/10/15
 */
import java.util.List;

public class NssfEventSubscriptionCreateData {
    private String nfNssaiAvailabilityUri;
    private List<Tai> tai;
    private NssfEventType event;

    public String getNfNssaiAvailabilityUri() {
        return nfNssaiAvailabilityUri;
    }

    public void setNfNssaiAvailabilityUri(String nfNssaiAvailabilityUri) {
        this.nfNssaiAvailabilityUri = nfNssaiAvailabilityUri;
    }

    public List<Tai> getTai() {
        return tai;
    }

    public void setTai(List<Tai> tai) {
        this.tai = tai;
    }

    public NssfEventType getEvent() {
        return event;
    }

    public void setEvent(NssfEventType event) {
        this.event = event;
    }
}
