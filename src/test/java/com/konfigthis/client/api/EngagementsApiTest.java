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
import com.konfigthis.client.model.EngagementsGetAllResponse;
import com.konfigthis.client.model.EngagementsGetByIdResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EngagementsApi
 */
@Disabled
public class EngagementsApiTest {

    private static EngagementsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EngagementsApi(apiClient);
    }

    /**
     * Retrieve all engagements
     *
     * Returns a list of engagements
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        Integer perPage = null;
        Integer page = null;
        EngagementsGetAllResponse response = api.getAll()
                .perPage(perPage)
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve an individual engagement
     *
     * Returns details for an engagement with a given engagement ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String id = null;
        EngagementsGetByIdResponse response = api.getById(id)
                .execute();
        // TODO: test validations
    }

}
