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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.TimeOffEngagementDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * TimeOffRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimeOffRequest {
  public static final String SERIALIZED_NAME_TIME_OFF_REQUEST_ID = "timeOffRequestId";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_REQUEST_ID)
  private String timeOffRequestId;

  public static final String SERIALIZED_NAME_ENGAGEMENT = "engagement";
  @SerializedName(SERIALIZED_NAME_ENGAGEMENT)
  private TimeOffEngagementDetails engagement;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_FIRST_DAY_DURATION = "firstDayDuration";
  @SerializedName(SERIALIZED_NAME_FIRST_DAY_DURATION)
  private String firstDayDuration;

  public static final String SERIALIZED_NAME_LAST_DAY_DURATION = "lastDayDuration";
  @SerializedName(SERIALIZED_NAME_LAST_DAY_DURATION)
  private String lastDayDuration;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_REQUESTER_COMMENTS = "requesterComments";
  @SerializedName(SERIALIZED_NAME_REQUESTER_COMMENTS)
  private String requesterComments;

  public static final String SERIALIZED_NAME_REJECTION_REASON = "rejectionReason";
  @SerializedName(SERIALIZED_NAME_REJECTION_REASON)
  private String rejectionReason;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_PERIOD_IN_HOURS = "periodInHours";
  @SerializedName(SERIALIZED_NAME_PERIOD_IN_HOURS)
  private Float periodInHours;

  public TimeOffRequest() {
  }

  public TimeOffRequest timeOffRequestId(String timeOffRequestId) {
    
    
    
    
    this.timeOffRequestId = timeOffRequestId;
    return this;
  }

   /**
   * Get timeOffRequestId
   * @return timeOffRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimeOffRequestId() {
    return timeOffRequestId;
  }


  public void setTimeOffRequestId(String timeOffRequestId) {
    
    
    
    this.timeOffRequestId = timeOffRequestId;
  }


  public TimeOffRequest engagement(TimeOffEngagementDetails engagement) {
    
    
    
    
    this.engagement = engagement;
    return this;
  }

   /**
   * Get engagement
   * @return engagement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeOffEngagementDetails getEngagement() {
    return engagement;
  }


  public void setEngagement(TimeOffEngagementDetails engagement) {
    
    
    
    this.engagement = engagement;
  }


  public TimeOffRequest startDate(LocalDate startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    
    
    
    this.startDate = startDate;
  }


  public TimeOffRequest endDate(LocalDate endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    
    
    
    this.endDate = endDate;
  }


  public TimeOffRequest firstDayDuration(String firstDayDuration) {
    
    
    
    
    this.firstDayDuration = firstDayDuration;
    return this;
  }

   /**
   * Get firstDayDuration
   * @return firstDayDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstDayDuration() {
    return firstDayDuration;
  }


  public void setFirstDayDuration(String firstDayDuration) {
    
    
    
    this.firstDayDuration = firstDayDuration;
  }


  public TimeOffRequest lastDayDuration(String lastDayDuration) {
    
    
    
    
    this.lastDayDuration = lastDayDuration;
    return this;
  }

   /**
   * Get lastDayDuration
   * @return lastDayDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastDayDuration() {
    return lastDayDuration;
  }


  public void setLastDayDuration(String lastDayDuration) {
    
    
    
    this.lastDayDuration = lastDayDuration;
  }


  public TimeOffRequest state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public TimeOffRequest type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public TimeOffRequest requesterComments(String requesterComments) {
    
    
    
    
    this.requesterComments = requesterComments;
    return this;
  }

   /**
   * Get requesterComments
   * @return requesterComments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequesterComments() {
    return requesterComments;
  }


  public void setRequesterComments(String requesterComments) {
    
    
    
    this.requesterComments = requesterComments;
  }


  public TimeOffRequest rejectionReason(String rejectionReason) {
    
    
    
    
    this.rejectionReason = rejectionReason;
    return this;
  }

   /**
   * Get rejectionReason
   * @return rejectionReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRejectionReason() {
    return rejectionReason;
  }


  public void setRejectionReason(String rejectionReason) {
    
    
    
    this.rejectionReason = rejectionReason;
  }


  public TimeOffRequest reason(String reason) {
    
    
    
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    
    
    
    this.reason = reason;
  }


  public TimeOffRequest periodInHours(Float periodInHours) {
    
    
    
    
    this.periodInHours = periodInHours;
    return this;
  }

   /**
   * Get periodInHours
   * @return periodInHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getPeriodInHours() {
    return periodInHours;
  }


  public void setPeriodInHours(Float periodInHours) {
    
    
    
    this.periodInHours = periodInHours;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TimeOffRequest instance itself
   */
  public TimeOffRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffRequest timeOffRequest = (TimeOffRequest) o;
    return Objects.equals(this.timeOffRequestId, timeOffRequest.timeOffRequestId) &&
        Objects.equals(this.engagement, timeOffRequest.engagement) &&
        Objects.equals(this.startDate, timeOffRequest.startDate) &&
        Objects.equals(this.endDate, timeOffRequest.endDate) &&
        Objects.equals(this.firstDayDuration, timeOffRequest.firstDayDuration) &&
        Objects.equals(this.lastDayDuration, timeOffRequest.lastDayDuration) &&
        Objects.equals(this.state, timeOffRequest.state) &&
        Objects.equals(this.type, timeOffRequest.type) &&
        Objects.equals(this.requesterComments, timeOffRequest.requesterComments) &&
        Objects.equals(this.rejectionReason, timeOffRequest.rejectionReason) &&
        Objects.equals(this.reason, timeOffRequest.reason) &&
        Objects.equals(this.periodInHours, timeOffRequest.periodInHours)&&
        Objects.equals(this.additionalProperties, timeOffRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffRequestId, engagement, startDate, endDate, firstDayDuration, lastDayDuration, state, type, requesterComments, rejectionReason, reason, periodInHours, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequest {\n");
    sb.append("    timeOffRequestId: ").append(toIndentedString(timeOffRequestId)).append("\n");
    sb.append("    engagement: ").append(toIndentedString(engagement)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    firstDayDuration: ").append(toIndentedString(firstDayDuration)).append("\n");
    sb.append("    lastDayDuration: ").append(toIndentedString(lastDayDuration)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requesterComments: ").append(toIndentedString(requesterComments)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    periodInHours: ").append(toIndentedString(periodInHours)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("timeOffRequestId");
    openapiFields.add("engagement");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("firstDayDuration");
    openapiFields.add("lastDayDuration");
    openapiFields.add("state");
    openapiFields.add("type");
    openapiFields.add("requesterComments");
    openapiFields.add("rejectionReason");
    openapiFields.add("reason");
    openapiFields.add("periodInHours");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeOffRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimeOffRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeOffRequest is not found in the empty JSON string", TimeOffRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("timeOffRequestId") != null && !jsonObj.get("timeOffRequestId").isJsonNull()) && !jsonObj.get("timeOffRequestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeOffRequestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeOffRequestId").toString()));
      }
      // validate the optional field `engagement`
      if (jsonObj.get("engagement") != null && !jsonObj.get("engagement").isJsonNull()) {
        TimeOffEngagementDetails.validateJsonObject(jsonObj.getAsJsonObject("engagement"));
      }
      if ((jsonObj.get("firstDayDuration") != null && !jsonObj.get("firstDayDuration").isJsonNull()) && !jsonObj.get("firstDayDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstDayDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstDayDuration").toString()));
      }
      if (!jsonObj.get("lastDayDuration").isJsonNull() && (jsonObj.get("lastDayDuration") != null && !jsonObj.get("lastDayDuration").isJsonNull()) && !jsonObj.get("lastDayDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastDayDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastDayDuration").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("requesterComments").isJsonNull() && (jsonObj.get("requesterComments") != null && !jsonObj.get("requesterComments").isJsonNull()) && !jsonObj.get("requesterComments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requesterComments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requesterComments").toString()));
      }
      if (!jsonObj.get("rejectionReason").isJsonNull() && (jsonObj.get("rejectionReason") != null && !jsonObj.get("rejectionReason").isJsonNull()) && !jsonObj.get("rejectionReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rejectionReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rejectionReason").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeOffRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeOffRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeOffRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeOffRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeOffRequest>() {
           @Override
           public void write(JsonWriter out, TimeOffRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeOffRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimeOffRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TimeOffRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeOffRequest
  * @throws IOException if the JSON string is invalid with respect to TimeOffRequest
  */
  public static TimeOffRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeOffRequest.class);
  }

 /**
  * Convert an instance of TimeOffRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

