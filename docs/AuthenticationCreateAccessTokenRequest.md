

# AuthenticationCreateAccessTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | The client_id of your Developer App. This can be found by visting https://app.oysterhr.com/developer |  [optional] |
|**clientSecret** | **String** | The secret of your Developer App. |  [optional] |
|**grantType** | **String** | First you need to request an &#x60;authorization_code&#x60;. Afterwards you can request a &#x60;refresh_token&#x60;. |  [optional] |
|**code** | **String** | The code is required when requesting an &#x60;authorization_code&#x60;. |  [optional] |
|**redirectUri** | **String** | The redirect_uri is required when requesting an &#x60;authorization_code&#x60;. |  [optional] |
|**refreshToken** | **String** | A &#x60;refresh_token&#x60; is required when requesting a &#x60;refresh_token&#x60;. A &#x60;refresh_token&#x60; will be provided when requesting an &#x60;authorization_code&#x60; |  [optional] |



