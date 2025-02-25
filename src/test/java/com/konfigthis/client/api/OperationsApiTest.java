/*
 * Endpoints
 * Oyster uses OAuth2 to enable customers to grant access to their data to third party applications. Customers also need to use this API to authenticate themselves when making API requests.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.OperationsGetByOperationKeyResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OperationsApi
 */
@Disabled
public class OperationsApiTest {

    private static OperationsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new OperationsApi(apiClient);
    }

    /**
     * Retrieve an operation
     *
     * Returns details for an operation with a given operation key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByOperationKeyTest() throws ApiException {
        String operationKey = null;
        OperationsGetByOperationKeyResponse response = api.getByOperationKey(operationKey)
                .execute();
        // TODO: test validations
    }

}
