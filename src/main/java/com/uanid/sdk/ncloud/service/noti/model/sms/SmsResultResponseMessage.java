package com.uanid.sdk.ncloud.service.noti.model.sms;

import lombok.*;

/**
 * @author uanid
 * @since 2020-04-24
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SmsResultResponseMessage {

    private String messageId;

    private String requestTime;

    private SmsContentType contentType;

    private String countryCode;

    private String from;

    private String to;
}
