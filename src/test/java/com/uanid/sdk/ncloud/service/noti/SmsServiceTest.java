package com.uanid.sdk.ncloud.service.noti;

import com.nbp.ncp.nes.ApiClient;
import com.nbp.ncp.nes.ApiResponse;
import com.nbp.ncp.nes.auth.CredentialsProvider;
import com.nbp.ncp.nes.auth.PropertiesFileCredentialsProvider;
import com.nbp.ncp.nes.marshaller.JsonMarshaller;
import com.uanid.sdk.ncloud.service.noti.model.sms.*;
import com.uanid.sdk.ncloud.service.util.Utils;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Properties;

/**
 * @author uanid
 * @since 2020-04-23
 */
public class SmsServiceTest {

    private SmsService smsService;
    private SmsProfile smsProfile;

    @Before
    public void setup() {
        CredentialsProvider provider = new PropertiesFileCredentialsProvider("credentials.properties");
        ApiClient apiClient = new ApiClient.ApiClientBuilder()
                .addMarshaller(JsonMarshaller.getInstance())
                .setCredentials(provider.getCredentials())
                .build();
        this.smsService = new SmsService(apiClient);

        Properties properties = Utils.loadPropertiesFromFile("smsProfile.properties");
        this.smsProfile = new SmsProfile(properties.getProperty("serviceId"), properties.getProperty("fromNumber"));
    }

    @Test
    public void postSmsTest() {
        SmsRequest request = new SmsRequest();
        request.setType(SmsType.SMS);
        request.setContent("Faker fFFFF");

        //이렇게 쪼개면 개인정보 수집하는 봇이 수집 못할듯?
        request.setMessages(Collections.singletonList(new SmsRequestMessage("010" + "3759" + "1038", null, null)));
        ApiResponse<SmsResponse> response = smsService.postSms(request, smsProfile);
        System.out.println(response.getBody().toString());
    }

    @Test
    public void reserveSmsTest(){
        SmsRequest request = new SmsRequest();
        request.setType(SmsType.SMS);
        request.setContent("TTTTTTAAAAA");
        request.setMessages(Collections.singletonList(new SmsRequestMessage("010" + "3759" + "1038", null, null)));

        request.setReserveTime("2020-04-24 18:30");
        request.setReserveTimeZone("Asia/Seoul");
        ApiResponse<SmsResponse> response = smsService.postSms(request, smsProfile);
        System.out.println(response.getBody().toString());
    }

    @Test
    public void getSmsTest(){
        ApiResponse<SmsResultResponse> response = smsService.getSmsRequest("8d6f4a2d50ef4c5d8fa8f6ccb32feae3", smsProfile);
        System.out.println(response.getBody().toString());
    }

    @Test
    public void getMessageTest(){
        ApiResponse<MessageResponse> response = smsService.getMessageResult("0-ESA-202004-420971-0", smsProfile);
        System.out.println(response.getBody().toString());
    }

    @Test
    public void getReserveTest(){
        ApiResponse<ReserveResponse> response = smsService.getReserveStatus("609978273a624599b2445ceece08e5f1", smsProfile);
        System.out.println(response.getBody().toString());
    }
}
