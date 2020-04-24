package com.uanid.sdk.ncloud.service.noti;

import com.nbp.ncp.nes.ApiClient;
import com.nbp.ncp.nes.ApiRequest;
import com.nbp.ncp.nes.ApiResponse;
import com.uanid.sdk.ncloud.service.noti.model.SendSmsRequest;
import com.uanid.sdk.ncloud.service.noti.model.SendSmsResponse;

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

    public SmsService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public ApiResponse<SendSmsResponse> sendSms(SendSmsRequest requestBody, SmsProfile profile) {
        requestBody.setFrom(profile.getFromNumber());

        String path = String.format("/services/%s/messages", profile.getServiceId());
        // query params
        Map<String, Object> queryParams = new HashMap<String, Object>();
        // form params
        Map<String, Object> formParams = new HashMap<String, Object>();
        // headers
        Map<String, Object> httpHeaders = new HashMap<String, Object>();
        // accept
        final String[] accepts = {
        };
        String accept = apiClient.selectHeaderAccept(accepts);
        httpHeaders.put("accept", accept);

        // content-type
        final String[] contentTypes = {
        };
        String contentType = apiClient.selectHeaderContentType(contentTypes);
        httpHeaders.put("content-type", contentType);

        ApiRequest apiRequest = new ApiRequest("POST", path, domain, basePath, queryParams, formParams, httpHeaders, requestBody, false, false);
        return apiClient.call(apiRequest, SendSmsResponse.class);
    }
}
