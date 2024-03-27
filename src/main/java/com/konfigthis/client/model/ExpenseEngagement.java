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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * ExpenseEngagement
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExpenseEngagement {
  public static final String SERIALIZED_NAME_ENGAGEMENT_ID = "engagementId";
  @SerializedName(SERIALIZED_NAME_ENGAGEMENT_ID)
  private String engagementId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENGAGEMENT_TYPE = "engagementType";
  @SerializedName(SERIALIZED_NAME_ENGAGEMENT_TYPE)
  private String engagementType;

  public ExpenseEngagement() {
  }

  public ExpenseEngagement engagementId(String engagementId) {
    
    
    
    
    this.engagementId = engagementId;
    return this;
  }

   /**
   * Get engagementId
   * @return engagementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEngagementId() {
    return engagementId;
  }


  public void setEngagementId(String engagementId) {
    
    
    
    this.engagementId = engagementId;
  }


  public ExpenseEngagement name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ExpenseEngagement engagementType(String engagementType) {
    
    
    
    
    this.engagementType = engagementType;
    return this;
  }

   /**
   * Get engagementType
   * @return engagementType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEngagementType() {
    return engagementType;
  }


  public void setEngagementType(String engagementType) {
    
    
    
    this.engagementType = engagementType;
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
   * @return the ExpenseEngagement instance itself
   */
  public ExpenseEngagement putAdditionalProperty(String key, Object value) {
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
    ExpenseEngagement expenseEngagement = (ExpenseEngagement) o;
    return Objects.equals(this.engagementId, expenseEngagement.engagementId) &&
        Objects.equals(this.name, expenseEngagement.name) &&
        Objects.equals(this.engagementType, expenseEngagement.engagementType)&&
        Objects.equals(this.additionalProperties, expenseEngagement.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(engagementId, name, engagementType, additionalProperties);
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
    sb.append("class ExpenseEngagement {\n");
    sb.append("    engagementId: ").append(toIndentedString(engagementId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
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
    openapiFields.add("engagementId");
    openapiFields.add("name");
    openapiFields.add("engagementType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpenseEngagement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExpenseEngagement.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpenseEngagement is not found in the empty JSON string", ExpenseEngagement.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("engagementId") != null && !jsonObj.get("engagementId").isJsonNull()) && !jsonObj.get("engagementId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engagementId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engagementId").toString()));
      }
      if (!jsonObj.get("name").isJsonNull() && (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("engagementType") != null && !jsonObj.get("engagementType").isJsonNull()) && !jsonObj.get("engagementType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engagementType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engagementType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpenseEngagement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpenseEngagement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpenseEngagement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpenseEngagement.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpenseEngagement>() {
           @Override
           public void write(JsonWriter out, ExpenseEngagement value) throws IOException {
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
           public ExpenseEngagement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExpenseEngagement instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExpenseEngagement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpenseEngagement
  * @throws IOException if the JSON string is invalid with respect to ExpenseEngagement
  */
  public static ExpenseEngagement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpenseEngagement.class);
  }

 /**
  * Convert an instance of ExpenseEngagement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

