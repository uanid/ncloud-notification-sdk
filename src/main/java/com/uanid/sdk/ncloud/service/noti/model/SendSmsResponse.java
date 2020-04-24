package com.uanid.sdk.ncloud.service.noti.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author uanid
 * @since 2020-04-23
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SendSmsResponse {
    private String statusCode;
    private String statusName;
    private String requestId;
    private String requestTime;
}
