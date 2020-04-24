package com.uanid.sdk.ncloud.service.noti.model.sms;

import lombok.*;

/**
 * @author uanid
 * @since 2020-04-23
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SmsResponse {
    private String statusCode;
    private String statusName;
    private String requestId;
    private String requestTime;
}
