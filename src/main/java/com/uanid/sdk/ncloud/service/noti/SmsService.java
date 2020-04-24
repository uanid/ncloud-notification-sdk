package com.uanid.sdk.ncloud.service.noti;

import com.nbp.ncp.nes.ApiClient;
import com.nbp.ncp.nes.ApiRequest;
import com.nbp.ncp.nes.ApiResponse;
import com.uanid.sdk.ncloud.service.noti.model.sms.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author uanid
 * @since 2020-04-23
 */
public class SmsService {
    private final ApiClient apiClient;

    private final String domain = "https://sens.apigw.ntruss.com";
    private final String basePath = "/sms/v2";
    private final String[] emptyArray = new String[]{};

    public SmsService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    private Map<String, Object> getDefaultHeaders() {
        Map<String, Object> httpHeaders = new HashMap<String, Object>();
        String accept = apiClient.selectHeaderAccept(emptyArray);
        httpHeaders.put("accept", accept);
        String contentType = apiClient.selectHeaderContentType(emptyArray);
        httpHeaders.put("content-type", contentType);
        return httpHeaders;
    }

    public ApiResponse<SmsResponse> postSms(SmsRequest requestBody, SmsProfile profile) {
        requestBody.setFrom(profile.getFromNumber());

        String path = String.format("/services/%s/messages", profile.getServiceId());
        // query params
        Map<String, Object> queryParams = new HashMap<String, Object>();
        // form params
        Map<String, Object> formParams = new HashMap<String, Object>();
        // headers
        Map<String, Object> httpHeaders = getDefaultHeaders();

        ApiRequest apiRequest = new ApiRequest("POST", path, domain, basePath, queryParams, formParams, httpHeaders, requestBody, false, false);
        return apiClient.call(apiRequest, SmsResponse.class);
    }

    public ApiResponse<SmsResultResponse> getSmsRequest(String requestId, SmsProfile profile) {
        String path = String.format("/services/%s/messages", profile.getServiceId());
        // query params
        Map<String, Object> queryParams = new HashMap<String, Object>();
        queryParams.put("requestId", requestId);
        // form params
        Map<String, Object> formParams = new HashMap<String, Object>();
        // headers
        Map<String, Object> httpHeaders = getDefaultHeaders();

        ApiRequest apiRequest = new ApiRequest("GET", path, domain, basePath, queryParams, formParams, httpHeaders, null, false, false);
        return apiClient.call(apiRequest, SmsResultResponse.class);
    }

    public ApiResponse<MessageResponse> getMessageResult(String messageId, SmsProfile profile) {
        String path = String.format("/services/%s/messages/%s", profile.getServiceId(), messageId);
        // query params
        Map<String, Object> queryParams = new HashMap<String, Object>();
        // form params
        Map<String, Object> formParams = new HashMap<String, Object>();
        // headers
        Map<String, Object> httpHeaders = getDefaultHeaders();

        ApiRequest apiRequest = new ApiRequest("GET", path, domain, basePath, queryParams, formParams, httpHeaders, null, false, false);
        return apiClient.call(apiRequest, MessageResponse.class);
    }

    public ApiResponse<ReserveResponse> getReserveStatus(String reserveId, SmsProfile profile) {
        String path = String.format("/services/%s/reservations/%s/reserve-status", profile.getServiceId(), reserveId);
        // query params
        Map<String, Object> queryParams = new HashMap<String, Object>();
        // form params
        Map<String, Object> formParams = new HashMap<String, Object>();
        // headers
        Map<String, Object> httpHeaders = getDefaultHeaders();

        ApiRequest apiRequest = new ApiRequest("GET", path, domain, basePath, queryParams, formParams, httpHeaders, null, false, false);
        return apiClient.call(apiRequest, ReserveResponse.class);
    }

    public ApiResponse deleteReservation(String reserveId, SmsProfile profile) {
        String path = String.format("/services/%s/reservations/%s", profile.getServiceId(), reserveId);
        // query params
        Map<String, Object> queryParams = new HashMap<String, Object>();
        // form params
        Map<String, Object> formParams = new HashMap<String, Object>();
        // headers
        Map<String, Object> httpHeaders = getDefaultHeaders();

        ApiRequest apiRequest = new ApiRequest("DELETE", path, domain, basePath, queryParams, formParams, httpHeaders, null, false, false);
        return apiClient.call(apiRequest, null);
    }

    public ApiResponse deleteScheduleStatus(String scheduleCode, String messageId, SmsProfile profile) {
        String path = String.format("/services/%s/schedules/%s/messages/%s", profile.getServiceId(), scheduleCode, messageId);
        // query params
        Map<String, Object> queryParams = new HashMap<String, Object>();
        // form params
        Map<String, Object> formParams = new HashMap<String, Object>();
        // headers
        Map<String, Object> httpHeaders = getDefaultHeaders();

        ApiRequest apiRequest = new ApiRequest("DELETE", path, domain, basePath, queryParams, formParams, httpHeaders, null, false, false);
        return apiClient.call(apiRequest, null);
    }
}
