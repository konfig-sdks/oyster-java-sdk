# ExpensesApi

All URIs are relative to *https://api.oysterhr.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveExpense**](ExpensesApi.md#approveExpense) | **POST** /v1/expenses/{id}/approve | Approve expense |
| [**createOperationKey**](ExpensesApi.md#createOperationKey) | **POST** /v1/expenses | Create expense |
| [**declineExpense**](ExpensesApi.md#declineExpense) | **POST** /v1/expenses/{id}/decline | Decline expense |
| [**getById**](ExpensesApi.md#getById) | **GET** /v1/expenses/{id} | Retrieve an individual expense |


<a name="approveExpense"></a>
# **approveExpense**
> approveExpense(id).execute();

Approve expense

Approves an expense.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Oyster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpensesApi;
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
    String id = "id_example"; // Expense ID
    try {
      client
              .expenses
              .approveExpense(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#approveExpense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .expenses
              .approveExpense(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#approveExpense");
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
| **id** | **String**| Expense ID | |

### Return type

null (empty response body)

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

<a name="createOperationKey"></a>
# **createOperationKey**
> AsyncResponse createOperationKey().expensesCreateOperationKeyRequest(expensesCreateOperationKeyRequest).execute();

Create expense

Creates a new expense for an engagement. This is an asynchronous operation. Returns operationKey that can be used to retrieve the operation to know if it&#39;s successfully completed

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Oyster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpensesApi;
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
    String engagementId = "engagementId_example";
    String name = "name_example";
    LocalDate incurredOn = LocalDate.now();
    String category = "category_example";
    String receiptUrl = "receiptUrl_example";
    ExpensesCreateOperationKeyRequestReceiptAmount receiptAmount = new ExpensesCreateOperationKeyRequestReceiptAmount();
    String description = "description_example";
    try {
      AsyncResponse result = client
              .expenses
              .createOperationKey(engagementId, name, incurredOn, category, receiptUrl, receiptAmount)
              .description(description)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#createOperationKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AsyncResponse> response = client
              .expenses
              .createOperationKey(engagementId, name, incurredOn, category, receiptUrl, receiptAmount)
              .description(description)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#createOperationKey");
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
| **expensesCreateOperationKeyRequest** | [**ExpensesCreateOperationKeyRequest**](ExpensesCreateOperationKeyRequest.md)|  | [optional] |

### Return type

[**AsyncResponse**](AsyncResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successfully created async operation |  -  |

<a name="declineExpense"></a>
# **declineExpense**
> declineExpense(id).expensesDeclineExpenseRequest(expensesDeclineExpenseRequest).execute();

Decline expense

Declines an expense.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Oyster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpensesApi;
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
    String id = "id_example"; // Expense ID
    String reason = "reason_example";
    try {
      client
              .expenses
              .declineExpense(id)
              .reason(reason)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#declineExpense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .expenses
              .declineExpense(id)
              .reason(reason)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#declineExpense");
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
| **id** | **String**| Expense ID | |
| **expensesDeclineExpenseRequest** | [**ExpensesDeclineExpenseRequest**](ExpensesDeclineExpenseRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |
| **404** | Resource does not exist, or no permission to access resource |  -  |

<a name="getById"></a>
# **getById**
> ExpensesGetByIdResponse getById(id).execute();

Retrieve an individual expense

Returns details for an expense with a given expense ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Oyster;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpensesApi;
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
    String id = "id_example"; // Expense ID
    try {
      ExpensesGetByIdResponse result = client
              .expenses
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpensesGetByIdResponse> response = client
              .expenses
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#getById");
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
| **id** | **String**| Expense ID | |

### Return type

[**ExpensesGetByIdResponse**](ExpensesGetByIdResponse.md)

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

