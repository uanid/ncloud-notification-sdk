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
public class ReserveResponse {
    private String reserveId;
    private String reserveTimeZone;
    private String reserveTime;
    private ReserveStatus reserveStatus;
}
