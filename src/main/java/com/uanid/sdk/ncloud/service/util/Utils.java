package com.uanid.sdk.ncloud.service.util;

import com.nbp.ncp.nes.exception.SdkException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author uanid
 * @since 2020-04-24
 */
public class Utils {
    public static Properties loadPropertiesFromFile(String path) {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new SdkException("Failed to load credentials from the " + path + " file", e);
        }
        return properties;
    }
}
