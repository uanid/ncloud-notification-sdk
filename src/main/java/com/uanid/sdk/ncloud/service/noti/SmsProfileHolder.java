package com.uanid.sdk.ncloud.service.noti;

import java.util.HashMap;
import java.util.Map;

/**
 * @author uanid
 * @since 2020-04-23
 */
public class SmsProfileHolder {

    private Map<String, SmsProfile> profiles = new HashMap<>();

    private SmsProfileHolder() {
    }

    private static SmsProfileHolder getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final SmsProfileHolder INSTANCE = new SmsProfileHolder();
    }

    /**
     * @return 중복되는 이름으로 등록 실패시 false를 반환
     */
    public static synchronized boolean registerNewProfile(String profileName, SmsProfile smsProfile) {
        SmsProfileHolder holder = getInstance();
        if (holder.profiles.containsKey(profileName)) {
            return false;
        }

        holder.profiles.put(profileName, smsProfile);
        return true;
    }

    public static SmsProfile getProfile(String profileName) {
        return getInstance().profiles.get(profileName);
    }
}
