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
public class MessageResponseMessage {
    private String requestTime;

    private SmsContentType contentType;

    private String content;

    private String countryCode;

    private String from;

    private String to;

    private String status;

    private String statusCode;

    private String statusMessage;

    private String statusName;

    private String completeTime;

    private String teleoCode;

    private List<MessageResponseFile> files;
}
