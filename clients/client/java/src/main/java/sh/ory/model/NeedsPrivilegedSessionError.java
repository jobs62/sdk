/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.18
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

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
import java.util.HashMap;
import java.util.Map;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * NeedsPrivilegedSessionError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T09:15:47.625077020Z[Etc/UTC]")
public class NeedsPrivilegedSessionError {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code;

  public static final String SERIALIZED_NAME_DEBUG = "debug";
  @SerializedName(SERIALIZED_NAME_DEBUG)
  private String debug;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private Map<String, Object> details = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_REDIRECT_BROWSER_TO = "redirect_browser_to";
  @SerializedName(SERIALIZED_NAME_REDIRECT_BROWSER_TO)
  private String redirectBrowserTo;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public NeedsPrivilegedSessionError() {
  }

  public NeedsPrivilegedSessionError code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * The status code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "404", value = "The status code")

  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  public NeedsPrivilegedSessionError debug(String debug) {
    
    this.debug = debug;
    return this;
  }

   /**
   * Debug information  This field is often not exposed to protect against leaking sensitive information.
   * @return debug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SQL field \"foo\" is not a bool.", value = "Debug information  This field is often not exposed to protect against leaking sensitive information.")

  public String getDebug() {
    return debug;
  }


  public void setDebug(String debug) {
    this.debug = debug;
  }


  public NeedsPrivilegedSessionError details(Map<String, Object> details) {
    
    this.details = details;
    return this;
  }

  public NeedsPrivilegedSessionError putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Further error details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Further error details")

  public Map<String, Object> getDetails() {
    return details;
  }


  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }


  public NeedsPrivilegedSessionError id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The error ID  Useful when trying to identify various errors in application logic.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error ID  Useful when trying to identify various errors in application logic.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public NeedsPrivilegedSessionError message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Error message  The error&#39;s message.
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "The resource could not be found", required = true, value = "Error message  The error's message.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public NeedsPrivilegedSessionError reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * A human-readable reason for the error
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "User with ID 1234 does not exist.", value = "A human-readable reason for the error")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public NeedsPrivilegedSessionError redirectBrowserTo(String redirectBrowserTo) {
    
    this.redirectBrowserTo = redirectBrowserTo;
    return this;
  }

   /**
   * Points to where to redirect the user to next.
   * @return redirectBrowserTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Points to where to redirect the user to next.")

  public String getRedirectBrowserTo() {
    return redirectBrowserTo;
  }


  public void setRedirectBrowserTo(String redirectBrowserTo) {
    this.redirectBrowserTo = redirectBrowserTo;
  }


  public NeedsPrivilegedSessionError request(String request) {
    
    this.request = request;
    return this;
  }

   /**
   * The request ID  The request ID is often exposed internally in order to trace errors across service architectures. This is often a UUID.
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d7ef54b1-ec15-46e6-bccb-524b82c035e6", value = "The request ID  The request ID is often exposed internally in order to trace errors across service architectures. This is often a UUID.")

  public String getRequest() {
    return request;
  }


  public void setRequest(String request) {
    this.request = request;
  }


  public NeedsPrivilegedSessionError status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status description
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Not Found", value = "The status description")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NeedsPrivilegedSessionError needsPrivilegedSessionError = (NeedsPrivilegedSessionError) o;
    return Objects.equals(this.code, needsPrivilegedSessionError.code) &&
        Objects.equals(this.debug, needsPrivilegedSessionError.debug) &&
        Objects.equals(this.details, needsPrivilegedSessionError.details) &&
        Objects.equals(this.id, needsPrivilegedSessionError.id) &&
        Objects.equals(this.message, needsPrivilegedSessionError.message) &&
        Objects.equals(this.reason, needsPrivilegedSessionError.reason) &&
        Objects.equals(this.redirectBrowserTo, needsPrivilegedSessionError.redirectBrowserTo) &&
        Objects.equals(this.request, needsPrivilegedSessionError.request) &&
        Objects.equals(this.status, needsPrivilegedSessionError.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, debug, details, id, message, reason, redirectBrowserTo, request, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NeedsPrivilegedSessionError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    redirectBrowserTo: ").append(toIndentedString(redirectBrowserTo)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("debug");
    openapiFields.add("details");
    openapiFields.add("id");
    openapiFields.add("message");
    openapiFields.add("reason");
    openapiFields.add("redirect_browser_to");
    openapiFields.add("request");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("redirect_browser_to");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NeedsPrivilegedSessionError
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NeedsPrivilegedSessionError.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NeedsPrivilegedSessionError is not found in the empty JSON string", NeedsPrivilegedSessionError.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NeedsPrivilegedSessionError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NeedsPrivilegedSessionError` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NeedsPrivilegedSessionError.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("debug") != null && !jsonObj.get("debug").isJsonNull()) && !jsonObj.get("debug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `debug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("debug").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (!jsonObj.get("redirect_browser_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_browser_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirect_browser_to").toString()));
      }
      if ((jsonObj.get("request") != null && !jsonObj.get("request").isJsonNull()) && !jsonObj.get("request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NeedsPrivilegedSessionError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NeedsPrivilegedSessionError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NeedsPrivilegedSessionError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NeedsPrivilegedSessionError.class));

       return (TypeAdapter<T>) new TypeAdapter<NeedsPrivilegedSessionError>() {
           @Override
           public void write(JsonWriter out, NeedsPrivilegedSessionError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NeedsPrivilegedSessionError read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NeedsPrivilegedSessionError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NeedsPrivilegedSessionError
  * @throws IOException if the JSON string is invalid with respect to NeedsPrivilegedSessionError
  */
  public static NeedsPrivilegedSessionError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NeedsPrivilegedSessionError.class);
  }

 /**
  * Convert an instance of NeedsPrivilegedSessionError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

