# 네이버 클라우드 플랫폼 Simple & Easy - Notification Service SDK
[![](https://jitci.com/gh/Uanid/ncloud-notification-sdk/svg)](https://jitci.com/gh/Uanid/ncloud-notification-sdk)

1. 해당 프로젝트는 NCP에서 'Simple & Easy - Notification Service'라는 상품의 클라이언트 Java SDK를 제공하는 프로젝트입니다.

2. 해당 상품에 대한 자세한 설명은 다음 주소에서 확인할 수 있습니다. [바로가기](https://www.ncloud.com/product/applicationService/sens)

3. 원본 소스코드는 [여기](https://apidocs.ncloud.com/ko/common/ncpapi/) (	ncloud_outboundmailer.zip) 에서 참고했습니다.
원래 원본에서 포크를 따오고 싶었지만, 아쉽게도 Mailer SDK는 NCP 깃허브에 올라오지 않아 Git 기록 없이 추가하게 되었습니다.

## 라이브러리 Import 방법
MavenCentral 레포지토리에 업로드 하기 위해선 복잡한 과정이 필요하기 때문에 아티팩트를 JitPack 레포지토리에 올렸습니다.
아울러 버전 정보는 다음 링크에서 확인할 수 있습니다. 
[바로가기](https://jitpack.io/#com.uanid/ncloud-notification-sdk/)

1.JitPack 레포지토리를 추가합니다. (settings.xml 또는 프로젝트 pom.xml에 추가할 수 있습니다)
```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
2.라이브러리 의존성 관계를 추가합니다.
```xml
<dependency>
    <groupId>com.uanid</groupId>
    <artifactId>ncloud-notification-sdk</artifactId>
    <version>0.1</version>
</dependency>
```
Maven외 다른 빌드툴은 위의 링크에서 사용 방법을 확인할 수 있습니다.

## 사용 예시
우선 아래와 같이 사용할 Service와 SmsProfile을 정의합니다.
```java
ApiClient apiClient = new ApiClient.ApiClientBuilder()
                      .addMarshaller(JsonMarshaller.getInstance())
                      .setCredentials(new PropertiesFileCredentialsProvider("credentials.properties").getCredentials())
                      .build();
SmsService smsService = new SmsService(apiClient); === 1 ===
OutboundMailerService mailerService = new OutboundMailerService(apiClient); === 2 ===

Properties properties = Utils.loadPropertiesFromFile("smsProfile.properties");
SmsProfile smsProfile = new SmsProfile(properties.getProperty("serviceId"), properties.getProperty("fromNumber"));
```

Service객체는 Thread-Safe하기 때문에 이후 싱글턴처럼 사용하면 됩니다. 

## 기능
Cloud Outbound Mailer 상품:
- 상품 전체 (구현)

Simple & Easy - Notification Service 상품:
- SMS API v2 (구현)
- PUSH API v2 (구현안됨)
- 알림톡 API v2 (구현안됨)

사업자 등록증이 없어 알림톡과 PUSH 테스트가 불가능해 개발 할 수 없었습니다.
