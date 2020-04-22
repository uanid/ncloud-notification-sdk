package com.uanid.sdk.ncloud.service.noti;

import com.nbp.ncp.nes.ApiClient;

/**
 * @author uanid
 * @since 2020-04-23
 */
public class NotificationService {
    private final ApiClient apiClient;

    public NotificationService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }
}
