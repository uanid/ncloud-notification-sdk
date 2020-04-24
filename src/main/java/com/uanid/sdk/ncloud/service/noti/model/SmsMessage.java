package com.uanid.sdk.ncloud.service.noti.model;

import com.sun.istack.internal.Nullable;
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
public class SmsMessage {
    private String to;

    @Nullable
    private String subject; //LMS, MMS만 사용

    private String content;
}
