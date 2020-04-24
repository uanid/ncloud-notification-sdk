package com.uanid.sdk.ncloud.service.noti.model.sms;

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
public class SmsRequest {
    private SmsType type;

    //nullable
    private SmsContentType contentType; //default COMM

    //nullable
    private String countryCode; //default 82

    private String from; //SmsProfile에서 채워질 정보

    //nullable
    private String subject; //LMS, MMS만 선택 가능

    private String content;

    private List<SmsRequestMessage> messages;

    //nullable
    private List<SmsFile> files;


    //nullable
    private String reserveTime; //메시지 발송 예약 일시 (yyyy-MM-dd HH:mm)

    //nullable
    private String reserveTimeZone; //예약 일시 타임존 (기본: Asia/Seoul)

    //nullable
    private String scheduleCode; //등록하려는 스케줄 코드

    public SmsRequest(SmsType type, String content, List<SmsRequestMessage> messages) {
        this.type = type;
        this.content = content;
        this.messages = messages;
    }
}
