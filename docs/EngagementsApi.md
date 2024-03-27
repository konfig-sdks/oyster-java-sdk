# EngagementsApi

All URIs are relative to *https://api.oysterhr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](EngagementsApi.md#getAll) | **GET** /v1/engagements | Retrieve all engagements |
| [**getById**](EngagementsApi.md#getById) | **GET** /v1/engagements/{id} | Retrieve an individual engagement |


<a name="getAll"></a>
# **getAll**
> EngagementsGetAllResponse getAll().perPage(perPage).page(page).execute();

Retrieve all engagements

Returns a list of engagements

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Oyster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EngagementsApi;
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
    Integer perPage = 56;
    Integer page = 56;
    try {
      EngagementsGetAllResponse result = client
              .engagements
              .getAll()
              .perPage(perPage)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EngagementsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EngagementsGetAllResponse> response = client
              .engagements
              .getAll()
              .perPage(perPage)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EngagementsApi#getAll");
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
| **perPage** | **Integer**|  | [optional] |
| **page** | **Integer**|  | [optional] |

### Return type

[**EngagementsGetAllResponse**](EngagementsGetAllResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

<a name="getById"></a>
# **getById**
> EngagementsGetByIdResponse getById(id).execute();

Retrieve an individual engagement

Returns details for an engagement with a given engagement ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Oyster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EngagementsApi;
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
    String id = "id_example"; // Engagement ID
    try {
      EngagementsGetByIdResponse result = client
              .engagements
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EngagementsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EngagementsGetByIdResponse> response = client
              .engagements
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EngagementsApi#getById");
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
| **id** | **String**| Engagement ID | |

### Return type

[**EngagementsGetByIdResponse**](EngagementsGetByIdResponse.md)

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

