# OperationsApi

All URIs are relative to *https://api.oysterhr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByOperationKey**](OperationsApi.md#getByOperationKey) | **GET** /v1/meta/operations/{operation_key} | Retrieve an operation |


<a name="getByOperationKey"></a>
# **getByOperationKey**
> OperationsGetByOperationKeyResponse getByOperationKey(operationKey).execute();

Retrieve an operation

Returns details for an operation with a given operation key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Oyster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OperationsApi;
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
    String operationKey = "operationKey_example"; // Operation key
    try {
      OperationsGetByOperationKeyResponse result = client
              .operations
              .getByOperationKey(operationKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#getByOperationKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OperationsGetByOperationKeyResponse> response = client
              .operations
              .getByOperationKey(operationKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#getByOperationKey");
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
| **operationKey** | **String**| Operation key | |

### Return type

[**OperationsGetByOperationKeyResponse**](OperationsGetByOperationKeyResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **404** | Resource does not exist, or no permission to access resource |  -  |

