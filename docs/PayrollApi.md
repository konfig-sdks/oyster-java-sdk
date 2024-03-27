# PayrollApi

All URIs are relative to *https://api.oysterhr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllPayrolls**](PayrollApi.md#getAllPayrolls) | **GET** /v1/payroll | Retrieve all payroll |
| [**getById**](PayrollApi.md#getById) | **GET** /v1/payroll/{id} | Retrieve an individual payroll |


<a name="getAllPayrolls"></a>
# **getAllPayrolls**
> PayrollGetAllPayrollsResponse getAllPayrolls().perPage(perPage).page(page).from(from).to(to).includeRecords(includeRecords).execute();

Retrieve all payroll

Returns a list of payrolls

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Oyster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String from = "from_example";
    String to = "to_example";
    Boolean includeRecords = true;
    try {
      PayrollGetAllPayrollsResponse result = client
              .payroll
              .getAllPayrolls()
              .perPage(perPage)
              .page(page)
              .from(from)
              .to(to)
              .includeRecords(includeRecords)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getAllPayrolls");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollGetAllPayrollsResponse> response = client
              .payroll
              .getAllPayrolls()
              .perPage(perPage)
              .page(page)
              .from(from)
              .to(to)
              .includeRecords(includeRecords)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getAllPayrolls");
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
| **from** | **String**|  | [optional] |
| **to** | **String**|  | [optional] |
| **includeRecords** | **Boolean**|  | [optional] |

### Return type

[**PayrollGetAllPayrollsResponse**](PayrollGetAllPayrollsResponse.md)

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
> PayrollGetByIdResponse getById(id).execute();

Retrieve an individual payroll

Returns details for a payroll with a given payroll ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Oyster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String id = "id_example"; // Payroll ID
    try {
      PayrollGetByIdResponse result = client
              .payroll
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollGetByIdResponse> response = client
              .payroll
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getById");
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
| **id** | **String**| Payroll ID | |

### Return type

[**PayrollGetByIdResponse**](PayrollGetByIdResponse.md)

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

