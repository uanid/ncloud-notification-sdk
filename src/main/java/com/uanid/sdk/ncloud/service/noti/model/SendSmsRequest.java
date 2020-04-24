package com.uanid.sdk.ncloud.service.noti.model;

import com.sun.istack.internal.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author uanid
 * @since 2020-04-23
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SendSmsRequest {
    private SmsType type;

    @Nullable
    private SmsContentType contentType; //default COMM

    @Nullable
    private String countryCode; //default 82

    private String from; //SmsProfile에서 채워질 정보

   @Nullable
    private String subject; //LMS, MMS만 선택 가능

    private String content;

    private List<SmsMessage> messages;

    @Nullable
    private List<SmsFile> files;


    @Nullable
    private String reserveTime; //메시지 발송 예약 일시 (yyyy-MM-dd HH:mm)

    @Nullable
    private String reserveTimeZone; //예약 일시 타임존 (기본: Asia/Seoul)

    @Nullable
    private String scheduleCode; //등록하려는 스케줄 코드

    public SendSmsRequest(SmsType type, String content, List<SmsMessage> messages) {
        this.type = type;
        this.content = content;
        this.messages = messages;
    }
}
