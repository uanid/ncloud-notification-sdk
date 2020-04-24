package com.uanid.sdk.ncloud.service.noti;

import lombok.Getter;

/**
 * @author uanid
 * @since 2020-04-23
 */
@Getter
public class SmsProfile {
    private final String serviceId;
    private final String fromNumber;

    public SmsProfile(String serviceId, String fromNumber) {
        this.serviceId = serviceId;
        this.fromNumber = fromNumber;
    }
}
