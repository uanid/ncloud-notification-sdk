package com.uanid.sdk.ncloud.service.noti.model.sms;

import com.sun.istack.internal.Nullable;
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

    @Nullable
    private String subject; //LMS, MMS만 사용

    private String content;
}
