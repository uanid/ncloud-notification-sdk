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
public class SmsRequestMessage {
    private String to;

    //nullable
    private String subject; //LMS, MMS만 사용

    private String content;

    public SmsRequestMessage(String to) {
        this.to = to;
    }
}
