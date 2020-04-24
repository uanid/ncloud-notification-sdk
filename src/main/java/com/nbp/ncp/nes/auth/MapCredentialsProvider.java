package com.nbp.ncp.nes.auth;

import com.nbp.ncp.nes.exception.SdkException;
import lombok.NonNull;

import java.util.Map;

/**
 * @author uanid
 * @since 2020-04-24
 */
public class MapCredentialsProvider implements CredentialsProvider {

    private Credentials credentials;

    public MapCredentialsProvider(@NonNull Map<String, String> properties) {
        String type = properties.get("type");
        if (type == null) {
            throw new SdkException("It doesn't contain the required properties 'type'.");
        } else if (type.equalsIgnoreCase("default") || type.equalsIgnoreCase("apikey")) {
            String apiKey = properties.get("apiKey");
            if (apiKey == null || apiKey.isEmpty()) {
                throw new SdkException("It doesn't contain the required properties 'apiKey'.");
            }
            this.credentials = new DefaultCredentials(apiKey);
        } else if (type.equalsIgnoreCase("iam")) {
            String apiKey = properties.get("apiKey");
            String accessKey = properties.get("accessKey");
            String secretKey = properties.get("secretKey");
            if (accessKey == null || secretKey == null || accessKey.isEmpty() || secretKey.isEmpty()) {
                throw new SdkException("It doesn't contain the required properties 'accessKey' and 'secretKey'.");
            }
            this.credentials = new IamCredentials(apiKey, accessKey, secretKey);
        }

    }

    @Override
    public Credentials getCredentials() {
        return credentials;
    }

    @Override
    public void refresh() {

    }
}
