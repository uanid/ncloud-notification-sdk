package com.uanid.sdk.ncloud.service.noti.model.sms;

import lombok.*;

import java.util.List;

/**
 * @author uanid
 * @since 2020-04-24
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SmsResultResponse {
    private String statusCode;
    private String statusName;
    private String requestId;
    private List<SmsResultResponseMessage> messages;
}
