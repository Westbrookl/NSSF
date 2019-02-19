package com.NSSFDataModel;
/**
 * when the HTTP status code is not enough for the NF/NF service acting as an HTTP client to determine the cause of the error, the NF/NF service as an HTTP server
 * should provide additional application related error info, by including in the reponse body a presentation of a "ProblemDetails" data structure that provides
 * additional details of the error.
 *
 * the "ProblemDetails" does not to be sent for a particular HTTP status code if that HTTP status code itself provides enough information of the error
 * or if there are security concerns disclosing detailed error info.
 *
 * the NF/NF service that generates the HTTP response shall include in the HTTP response a "Content-Type" header field set to:
 * - "application/problem+json", if the response includes a payload body containing the "ProblemDetails" data structure
 * - "application/json", if the response includes a payload body containing an application-specific data structure
 */

import java.util.ArrayList;
import java.util.List;

public class ProblemDetails {

    public String type = null; //String providing an URI formatted according to  IETF RFC 3986 [6]. In an OpenAPI Specification[3] schema, the format shall be designated as "Uri"
                               // An URI reference that indicates the problem type
    public String title = null; // the short human-readable summary of the problem type
    public Integer status = null; //the HTTP status code for this occurrence of the problem
    public String detail = null; //a human-readable explanation specific to this occurrence of the problem
    public String instance = null; // an URI reference that identifies the specific occurrence of the problem


    public String cause = null; // a machine-readable application error cause specific to this occurrence of the problem.
                                // this IE should be present and provide application-related error information, if available.
    public List<InvalidParam> invalidParams = new ArrayList<InvalidParam>(); // invalid parameters causing a request to be rejected.
                                                                 // the IE should be present when a request is rejected due to invalid parameters

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail(){
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getInstance() {
        return instance;
    }
    public void setInstance(String instance) {
        this.instance = instance;
    }

    public String getCause() {
        return cause;
    }
    public void setCause(String cause) {
        this.cause = cause;
    }

    public List<InvalidParam> getInvalidParams() {
        return invalidParams;
    }
    public void setInvalidParams(List<InvalidParam> invalidParams) {
        this.invalidParams = invalidParams;
    }
}
