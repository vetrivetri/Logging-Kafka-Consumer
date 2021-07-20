package com.logging.kafka.consumer.kafkaconsumer.db.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "successrequestlog")
public class SuccessRequestLog {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "SUCCESS_REQUEST")
    private String successRequest;
    @Column(name = "SUCCESS_RESPONSE")
    private String successResponse;
    @Column(name = "METHOD")
    private String method;
    @Column(name = "QUERY_PARAM")
    private String queryParam;
    @Column(name = "HEADERS")
    private String headers;
    @Column(name = "URI")
    private String uri;
    @Column(name = "CREATED_TIME")
    private Date createdTime;
    @Column(name = "REQUEST_TIME")
    private Date requestTime;
    @Column(name = "RESPONSE_TIME")
    private Date responsetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSuccessRequest() {
        return successRequest;
    }

    public void setSuccessRequest(String successRequest) {
        this.successRequest = successRequest;
    }

    public String getSuccessResponse() {
        return successResponse;
    }

    public void setSuccessResponse(String successResponse) {
        this.successResponse = successResponse;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(String queryParam) {
        this.queryParam = queryParam;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getResponsetime() {
        return responsetime;
    }

    public void setResponsetime(Date responsetime) {
        this.responsetime = responsetime;
    }
}
