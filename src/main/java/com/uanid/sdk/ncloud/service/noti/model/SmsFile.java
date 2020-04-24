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
public class SmsFile {

    /**
     * MMS만 사용 가능
     * jpg, jpeg 확장자를 가진 파일 이름
     * 최대 40자
     */
    private String name;

    /**
     * MMS에서만 사용 가능
     * jpg, jpeg 이미지를 Base64로 인코딩한 값
     * 원 파일 기준 최대 300Kbyte
     * 파일 명 최대 40자
     * 해상도 최대 1500 * 1500
     */
    private String body;
}
