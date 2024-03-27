

# Engagement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**engagementId** | **String** |  |  |
|**modifiedAt** | **OffsetDateTime** |  |  [optional] |
|**startDate** | **LocalDate** |  |  |
|**engagementType** | [**EngagementTypeEnum**](#EngagementTypeEnum) |  |  |
|**state** | **String** |  |  [optional] |
|**role** | **String** |  |  |
|**countryCode** | **String** |  |  |
|**personalDetails** | [**EngagementPersonalDetails**](EngagementPersonalDetails.md) |  |  |
|**employment** | **Object** |  |  [optional] |
|**contract** | **Object** |  |  [optional] |
|**benefitEnrollments** | [**List&lt;EngagementBenefitEnrollmentsInner&gt;**](EngagementBenefitEnrollmentsInner.md) |  |  [optional] |
|**terminations** | [**List&lt;EngagementTerminationsInner&gt;**](EngagementTerminationsInner.md) |  |  [optional] |
|**department** | [**EngagementDepartment**](EngagementDepartment.md) |  |  [optional] |



## Enum: EngagementTypeEnum

| Name | Value |
|---- | -----|
| EMPLOYMENT | &quot;EMPLOYMENT&quot; |
| CONTRACT | &quot;CONTRACT&quot; |



