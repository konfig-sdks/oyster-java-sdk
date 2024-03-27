# AuthenticationApi

All URIs are relative to *https://api.oysterhr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccessToken**](AuthenticationApi.md#createAccessToken) | **POST** /oauth2/token | Create an access token |


<a name="createAccessToken"></a>
# **createAccessToken**
> Token createAccessToken(authenticationCreateAccessTokenRequest).clientId(clientId).clientSecret(clientSecret).grantType(grantType).code(code).redirectUri(redirectUri).refreshToken(refreshToken).execute();

Create an access token

Oyster grants access to API resources based on OAuth. This means that individual customers grant API access to Developer Apps that you create. This applies to both customers and partners. Follow these simple steps: &lt;br&gt;&lt;br&gt; 1. [Create an Oyster account](https://app.oysterhr.com/sign_up) or [log in](https://app.oysterhr.com/users/sign_in) to your existing account. &lt;br&gt; &lt;br&gt; 2. Create an Oyster Developer App in the [Developer Tab](https://app.oysterhr.com/developer) (If you can&#39;t see the developer tab please contact us to enable it for your account). &lt;br&gt; Hint: If you are a customer doing this as a one time action you don&#39;t need to specify a functioning URL as step 3 will explain. &lt;br&gt; &lt;br&gt; 3. If you are a customer you can simply click on the \&quot;Authorization URL\&quot; and grant access to your own app. You will be redirected to the URL you specified when creating the Developer App. In the URL you will see that &#x60;?code&#x3D;xxx&#x60; has been added to the URL. This is the &#x60;code&#x60; you need to create an access token. &lt;br&gt; If you are a partner add \&quot;Authorization URL to your application. The redirect_url should be a URL that goes back to your app and you&#39;re able to programmatically retrieve the URL query param of &#x60;?code&#x3D;xxx&#x60; to then create an access token. &lt;br&gt; &lt;br&gt; 4. You need to first request an &#x60;authorization_code&#x60; with the API request detailed below. This will provide an &#x60;access_token&#x60; that is used as the Bearer Token for making API requests to Oyster. Ensure that you store the &#x60;refresh_token&#x60; for making future API requests. &lt;br&gt; &lt;br&gt; 5. If your &#x60;access_token&#x60; has expired then request a new one using your &#x60;refresh_token&#x60; that you have stored earlier. Ensure you store the new &#x60;refresh_token&#x60; each time as the previous ones will expire. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Oyster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.oysterhr.com";
    Oyster client = new Oyster(configuration);
    String clientId = "clientId_example"; // The client_id of your Developer App. This can be found by visting https://app.oysterhr.com/developer
    String clientSecret = "clientSecret_example"; // The secret of your Developer App.
    String grantType = "grantType_example"; // First you need to request an `authorization_code`. Afterwards you can request a `refresh_token`.
    String code = "code_example"; // The code is required when requesting an `authorization_code`.
    String redirectUri = "redirectUri_example"; // The redirect_uri is required when requesting an `authorization_code`.
    String refreshToken = "refreshToken_example"; // A `refresh_token` is required when requesting a `refresh_token`. A `refresh_token` will be provided when requesting an `authorization_code`
    try {
      Token result = client
              .authentication
              .createAccessToken()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .grantType(grantType)
              .code(code)
              .redirectUri(redirectUri)
              .refreshToken(refreshToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getScope());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#createAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Token> response = client
              .authentication
              .createAccessToken()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .grantType(grantType)
              .code(code)
              .redirectUri(redirectUri)
              .refreshToken(refreshToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#createAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticationCreateAccessTokenRequest** | [**AuthenticationCreateAccessTokenRequest**](AuthenticationCreateAccessTokenRequest.md)|  | |
| **clientId** | **String**| The client_id of your Developer App. This can be found by visting https://app.oysterhr.com/developer | [optional] |
| **clientSecret** | **String**| The secret of your Developer App. | [optional] |
| **grantType** | **String**| First you need to request an &#x60;authorization_code&#x60;. Afterwards you can request a &#x60;refresh_token&#x60;. | [optional] |
| **code** | **String**| The code is required when requesting an &#x60;authorization_code&#x60;. | [optional] |
| **redirectUri** | **String**| The redirect_uri is required when requesting an &#x60;authorization_code&#x60;. | [optional] |
| **refreshToken** | **String**| A &#x60;refresh_token&#x60; is required when requesting a &#x60;refresh_token&#x60;. A &#x60;refresh_token&#x60; will be provided when requesting an &#x60;authorization_code&#x60; | [optional] |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create an access token to make an API request |  -  |

