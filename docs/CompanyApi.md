# CompanyApi

All URIs are relative to *https://api.oysterhr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**detailsRetrieve**](CompanyApi.md#detailsRetrieve) | **GET** /v1/company | Retrieve company details |


<a name="detailsRetrieve"></a>
# **detailsRetrieve**
> CompanyDetailsRetrieveResponse detailsRetrieve().execute();

Retrieve company details

Returns details about the connected company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Oyster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.oysterhr.com";
    
    // Configure HTTP bearer authorization: bearer_auth
    configuration.token = "BEARER TOKEN";
    Oyster client = new Oyster(configuration);
    try {
      CompanyDetailsRetrieveResponse result = client
              .company
              .detailsRetrieve()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#detailsRetrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyDetailsRetrieveResponse> response = client
              .company
              .detailsRetrieve()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#detailsRetrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompanyDetailsRetrieveResponse**](CompanyDetailsRetrieveResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

