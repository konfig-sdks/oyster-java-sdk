<div align="left">

[![Visit Oyster](./header.png)](https://oysterhr.com)

# [Oyster](https://oysterhr.com)

Oyster uses OAuth2 to enable customers to grant access to their data to third party applications. Customers also need to use this API to authenticate themselves when making API requests.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Oyster&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>oyster-java-sdk</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:oyster-java-sdk:v1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/oyster-java-sdk-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.oysterhr.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**createAccessToken**](docs/AuthenticationApi.md#createAccessToken) | **POST** /oauth2/token | Create an access token
*CompanyApi* | [**detailsRetrieve**](docs/CompanyApi.md#detailsRetrieve) | **GET** /v1/company | Retrieve company details
*DepartmentsApi* | [**getAll**](docs/DepartmentsApi.md#getAll) | **GET** /v1/departments | Retrieve all departments
*EngagementsApi* | [**getAll**](docs/EngagementsApi.md#getAll) | **GET** /v1/engagements | Retrieve all engagements
*EngagementsApi* | [**getById**](docs/EngagementsApi.md#getById) | **GET** /v1/engagements/{id} | Retrieve an individual engagement
*ExpensesApi* | [**approveExpense**](docs/ExpensesApi.md#approveExpense) | **POST** /v1/expenses/{id}/approve | Approve expense
*ExpensesApi* | [**createOperationKey**](docs/ExpensesApi.md#createOperationKey) | **POST** /v1/expenses | Create expense
*ExpensesApi* | [**declineExpense**](docs/ExpensesApi.md#declineExpense) | **POST** /v1/expenses/{id}/decline | Decline expense
*ExpensesApi* | [**getById**](docs/ExpensesApi.md#getById) | **GET** /v1/expenses/{id} | Retrieve an individual expense
*OperationsApi* | [**getByOperationKey**](docs/OperationsApi.md#getByOperationKey) | **GET** /v1/meta/operations/{operation_key} | Retrieve an operation
*PayrollApi* | [**getAllPayrolls**](docs/PayrollApi.md#getAllPayrolls) | **GET** /v1/payroll | Retrieve all payroll
*PayrollApi* | [**getById**](docs/PayrollApi.md#getById) | **GET** /v1/payroll/{id} | Retrieve an individual payroll
*TimeOffApi* | [**approveRequest**](docs/TimeOffApi.md#approveRequest) | **POST** /v1/time_off/requests/{id}/approve | Approve request
*TimeOffApi* | [**getAllRequests**](docs/TimeOffApi.md#getAllRequests) | **GET** /v1/time_off/requests | Retrieve all requests
*TimeOffApi* | [**getEntitlements**](docs/TimeOffApi.md#getEntitlements) | **GET** /v1/time_off/entitlements | Retrieve entitlements
*TimeOffApi* | [**getRequest**](docs/TimeOffApi.md#getRequest) | **GET** /v1/time_off/requests/{id} | Retrieve an individual request
*TimeOffApi* | [**rejectRequest**](docs/TimeOffApi.md#rejectRequest) | **POST** /v1/time_off/requests/{id}/reject | Reject request


## Documentation for Models

 - [Address](docs/Address.md)
 - [Amount](docs/Amount.md)
 - [AsyncResponse](docs/AsyncResponse.md)
 - [AsyncResponseMeta](docs/AsyncResponseMeta.md)
 - [AuthenticationCreateAccessTokenRequest](docs/AuthenticationCreateAccessTokenRequest.md)
 - [Company](docs/Company.md)
 - [CompanyAddresses](docs/CompanyAddresses.md)
 - [CompanyDetailsRetrieveResponse](docs/CompanyDetailsRetrieveResponse.md)
 - [Department](docs/Department.md)
 - [DepartmentsGetAllResponse](docs/DepartmentsGetAllResponse.md)
 - [Engagement](docs/Engagement.md)
 - [EngagementBenefitEnrollmentsInner](docs/EngagementBenefitEnrollmentsInner.md)
 - [EngagementBenefitEnrollmentsInnerPlan](docs/EngagementBenefitEnrollmentsInnerPlan.md)
 - [EngagementDepartment](docs/EngagementDepartment.md)
 - [EngagementPersonalDetails](docs/EngagementPersonalDetails.md)
 - [EngagementPersonalDetailsAddresses](docs/EngagementPersonalDetailsAddresses.md)
 - [EngagementPersonalDetailsPhoneNumbers](docs/EngagementPersonalDetailsPhoneNumbers.md)
 - [EngagementTerminationsInner](docs/EngagementTerminationsInner.md)
 - [EngagementsGetAllResponse](docs/EngagementsGetAllResponse.md)
 - [EngagementsGetByIdResponse](docs/EngagementsGetByIdResponse.md)
 - [Expense](docs/Expense.md)
 - [ExpenseEngagement](docs/ExpenseEngagement.md)
 - [ExpensesCreateOperationKeyRequest](docs/ExpensesCreateOperationKeyRequest.md)
 - [ExpensesCreateOperationKeyRequestReceiptAmount](docs/ExpensesCreateOperationKeyRequestReceiptAmount.md)
 - [ExpensesDeclineExpenseRequest](docs/ExpensesDeclineExpenseRequest.md)
 - [ExpensesGetByIdResponse](docs/ExpensesGetByIdResponse.md)
 - [Meta](docs/Meta.md)
 - [Operation](docs/Operation.md)
 - [OperationMeta](docs/OperationMeta.md)
 - [OperationRequest](docs/OperationRequest.md)
 - [OperationsGetByOperationKeyResponse](docs/OperationsGetByOperationKeyResponse.md)
 - [Payroll](docs/Payroll.md)
 - [PayrollGetAllPayrollsResponse](docs/PayrollGetAllPayrollsResponse.md)
 - [PayrollGetByIdResponse](docs/PayrollGetByIdResponse.md)
 - [PayrollRecord](docs/PayrollRecord.md)
 - [PayrollRecordEngagement](docs/PayrollRecordEngagement.md)
 - [PhoneNumber](docs/PhoneNumber.md)
 - [TimeOffEngagementDetails](docs/TimeOffEngagementDetails.md)
 - [TimeOffEntitlementsInner](docs/TimeOffEntitlementsInner.md)
 - [TimeOffGetAllRequestsResponse](docs/TimeOffGetAllRequestsResponse.md)
 - [TimeOffGetEntitlementsResponse](docs/TimeOffGetEntitlementsResponse.md)
 - [TimeOffGetRequestResponse](docs/TimeOffGetRequestResponse.md)
 - [TimeOffRejectRequestRequest](docs/TimeOffRejectRequestRequest.md)
 - [TimeOffRequest](docs/TimeOffRequest.md)
 - [Token](docs/Token.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
