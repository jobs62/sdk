/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.0
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * OAuth2ConsentRequestOpenIDConnectContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-12T09:17:11.733875213Z[Etc/UTC]")
public class OAuth2ConsentRequestOpenIDConnectContext {
  public static final String SERIALIZED_NAME_ACR_VALUES = "acr_values";
  @SerializedName(SERIALIZED_NAME_ACR_VALUES)
  private List<String> acrValues = null;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_ID_TOKEN_HINT_CLAIMS = "id_token_hint_claims";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN_HINT_CLAIMS)
  private Map<String, Object> idTokenHintClaims = null;

  public static final String SERIALIZED_NAME_LOGIN_HINT = "login_hint";
  @SerializedName(SERIALIZED_NAME_LOGIN_HINT)
  private String loginHint;

  public static final String SERIALIZED_NAME_UI_LOCALES = "ui_locales";
  @SerializedName(SERIALIZED_NAME_UI_LOCALES)
  private List<String> uiLocales = null;

  public OAuth2ConsentRequestOpenIDConnectContext() {
  }

  public OAuth2ConsentRequestOpenIDConnectContext acrValues(List<String> acrValues) {
    
    this.acrValues = acrValues;
    return this;
  }

  public OAuth2ConsentRequestOpenIDConnectContext addAcrValuesItem(String acrValuesItem) {
    if (this.acrValues == null) {
      this.acrValues = new ArrayList<>();
    }
    this.acrValues.add(acrValuesItem);
    return this;
  }

   /**
   * ACRValues is the Authentication AuthorizationContext Class Reference requested in the OAuth 2.0 Authorization request. It is a parameter defined by OpenID Connect and expresses which level of authentication (e.g. 2FA) is required.  OpenID Connect defines it as follows: &gt; Requested Authentication AuthorizationContext Class Reference values. Space-separated string that specifies the acr values that the Authorization Server is being requested to use for processing this Authentication Request, with the values appearing in order of preference. The Authentication AuthorizationContext Class satisfied by the authentication performed is returned as the acr Claim Value, as specified in Section 2. The acr Claim is requested as a Voluntary Claim by this parameter.
   * @return acrValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ACRValues is the Authentication AuthorizationContext Class Reference requested in the OAuth 2.0 Authorization request. It is a parameter defined by OpenID Connect and expresses which level of authentication (e.g. 2FA) is required.  OpenID Connect defines it as follows: > Requested Authentication AuthorizationContext Class Reference values. Space-separated string that specifies the acr values that the Authorization Server is being requested to use for processing this Authentication Request, with the values appearing in order of preference. The Authentication AuthorizationContext Class satisfied by the authentication performed is returned as the acr Claim Value, as specified in Section 2. The acr Claim is requested as a Voluntary Claim by this parameter.")

  public List<String> getAcrValues() {
    return acrValues;
  }


  public void setAcrValues(List<String> acrValues) {
    this.acrValues = acrValues;
  }


  public OAuth2ConsentRequestOpenIDConnectContext display(String display) {
    
    this.display = display;
    return this;
  }

   /**
   * Display is a string value that specifies how the Authorization Server displays the authentication and consent user interface pages to the End-User. The defined values are: page: The Authorization Server SHOULD display the authentication and consent UI consistent with a full User Agent page view. If the display parameter is not specified, this is the default display mode. popup: The Authorization Server SHOULD display the authentication and consent UI consistent with a popup User Agent window. The popup User Agent window should be of an appropriate size for a login-focused dialog and should not obscure the entire window that it is popping up over. touch: The Authorization Server SHOULD display the authentication and consent UI consistent with a device that leverages a touch interface. wap: The Authorization Server SHOULD display the authentication and consent UI consistent with a \&quot;feature phone\&quot; type display.  The Authorization Server MAY also attempt to detect the capabilities of the User Agent and present an appropriate display.
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Display is a string value that specifies how the Authorization Server displays the authentication and consent user interface pages to the End-User. The defined values are: page: The Authorization Server SHOULD display the authentication and consent UI consistent with a full User Agent page view. If the display parameter is not specified, this is the default display mode. popup: The Authorization Server SHOULD display the authentication and consent UI consistent with a popup User Agent window. The popup User Agent window should be of an appropriate size for a login-focused dialog and should not obscure the entire window that it is popping up over. touch: The Authorization Server SHOULD display the authentication and consent UI consistent with a device that leverages a touch interface. wap: The Authorization Server SHOULD display the authentication and consent UI consistent with a \"feature phone\" type display.  The Authorization Server MAY also attempt to detect the capabilities of the User Agent and present an appropriate display.")

  public String getDisplay() {
    return display;
  }


  public void setDisplay(String display) {
    this.display = display;
  }


  public OAuth2ConsentRequestOpenIDConnectContext idTokenHintClaims(Map<String, Object> idTokenHintClaims) {
    
    this.idTokenHintClaims = idTokenHintClaims;
    return this;
  }

  public OAuth2ConsentRequestOpenIDConnectContext putIdTokenHintClaimsItem(String key, Object idTokenHintClaimsItem) {
    if (this.idTokenHintClaims == null) {
      this.idTokenHintClaims = new HashMap<>();
    }
    this.idTokenHintClaims.put(key, idTokenHintClaimsItem);
    return this;
  }

   /**
   * IDTokenHintClaims are the claims of the ID Token previously issued by the Authorization Server being passed as a hint about the End-User&#39;s current or past authenticated session with the Client.
   * @return idTokenHintClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IDTokenHintClaims are the claims of the ID Token previously issued by the Authorization Server being passed as a hint about the End-User's current or past authenticated session with the Client.")

  public Map<String, Object> getIdTokenHintClaims() {
    return idTokenHintClaims;
  }


  public void setIdTokenHintClaims(Map<String, Object> idTokenHintClaims) {
    this.idTokenHintClaims = idTokenHintClaims;
  }


  public OAuth2ConsentRequestOpenIDConnectContext loginHint(String loginHint) {
    
    this.loginHint = loginHint;
    return this;
  }

   /**
   * LoginHint hints about the login identifier the End-User might use to log in (if necessary). This hint can be used by an RP if it first asks the End-User for their e-mail address (or other identifier) and then wants to pass that value as a hint to the discovered authorization service. This value MAY also be a phone number in the format specified for the phone_number Claim. The use of this parameter is optional.
   * @return loginHint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LoginHint hints about the login identifier the End-User might use to log in (if necessary). This hint can be used by an RP if it first asks the End-User for their e-mail address (or other identifier) and then wants to pass that value as a hint to the discovered authorization service. This value MAY also be a phone number in the format specified for the phone_number Claim. The use of this parameter is optional.")

  public String getLoginHint() {
    return loginHint;
  }


  public void setLoginHint(String loginHint) {
    this.loginHint = loginHint;
  }


  public OAuth2ConsentRequestOpenIDConnectContext uiLocales(List<String> uiLocales) {
    
    this.uiLocales = uiLocales;
    return this;
  }

  public OAuth2ConsentRequestOpenIDConnectContext addUiLocalesItem(String uiLocalesItem) {
    if (this.uiLocales == null) {
      this.uiLocales = new ArrayList<>();
    }
    this.uiLocales.add(uiLocalesItem);
    return this;
  }

   /**
   * UILocales is the End-User&#39;id preferred languages and scripts for the user interface, represented as a space-separated list of BCP47 [RFC5646] language tag values, ordered by preference. For instance, the value \&quot;fr-CA fr en\&quot; represents a preference for French as spoken in Canada, then French (without a region designation), followed by English (without a region designation). An error SHOULD NOT result if some or all of the requested locales are not supported by the OpenID Provider.
   * @return uiLocales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UILocales is the End-User'id preferred languages and scripts for the user interface, represented as a space-separated list of BCP47 [RFC5646] language tag values, ordered by preference. For instance, the value \"fr-CA fr en\" represents a preference for French as spoken in Canada, then French (without a region designation), followed by English (without a region designation). An error SHOULD NOT result if some or all of the requested locales are not supported by the OpenID Provider.")

  public List<String> getUiLocales() {
    return uiLocales;
  }


  public void setUiLocales(List<String> uiLocales) {
    this.uiLocales = uiLocales;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2ConsentRequestOpenIDConnectContext oAuth2ConsentRequestOpenIDConnectContext = (OAuth2ConsentRequestOpenIDConnectContext) o;
    return Objects.equals(this.acrValues, oAuth2ConsentRequestOpenIDConnectContext.acrValues) &&
        Objects.equals(this.display, oAuth2ConsentRequestOpenIDConnectContext.display) &&
        Objects.equals(this.idTokenHintClaims, oAuth2ConsentRequestOpenIDConnectContext.idTokenHintClaims) &&
        Objects.equals(this.loginHint, oAuth2ConsentRequestOpenIDConnectContext.loginHint) &&
        Objects.equals(this.uiLocales, oAuth2ConsentRequestOpenIDConnectContext.uiLocales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acrValues, display, idTokenHintClaims, loginHint, uiLocales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ConsentRequestOpenIDConnectContext {\n");
    sb.append("    acrValues: ").append(toIndentedString(acrValues)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    idTokenHintClaims: ").append(toIndentedString(idTokenHintClaims)).append("\n");
    sb.append("    loginHint: ").append(toIndentedString(loginHint)).append("\n");
    sb.append("    uiLocales: ").append(toIndentedString(uiLocales)).append("\n");
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
    openapiFields.add("acr_values");
    openapiFields.add("display");
    openapiFields.add("id_token_hint_claims");
    openapiFields.add("login_hint");
    openapiFields.add("ui_locales");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OAuth2ConsentRequestOpenIDConnectContext
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OAuth2ConsentRequestOpenIDConnectContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuth2ConsentRequestOpenIDConnectContext is not found in the empty JSON string", OAuth2ConsentRequestOpenIDConnectContext.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OAuth2ConsentRequestOpenIDConnectContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OAuth2ConsentRequestOpenIDConnectContext` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("acr_values") != null && !jsonObj.get("acr_values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `acr_values` to be an array in the JSON string but got `%s`", jsonObj.get("acr_values").toString()));
      }
      if ((jsonObj.get("display") != null && !jsonObj.get("display").isJsonNull()) && !jsonObj.get("display").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display").toString()));
      }
      if ((jsonObj.get("login_hint") != null && !jsonObj.get("login_hint").isJsonNull()) && !jsonObj.get("login_hint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `login_hint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("login_hint").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ui_locales") != null && !jsonObj.get("ui_locales").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ui_locales` to be an array in the JSON string but got `%s`", jsonObj.get("ui_locales").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OAuth2ConsentRequestOpenIDConnectContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OAuth2ConsentRequestOpenIDConnectContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OAuth2ConsentRequestOpenIDConnectContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OAuth2ConsentRequestOpenIDConnectContext.class));

       return (TypeAdapter<T>) new TypeAdapter<OAuth2ConsentRequestOpenIDConnectContext>() {
           @Override
           public void write(JsonWriter out, OAuth2ConsentRequestOpenIDConnectContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OAuth2ConsentRequestOpenIDConnectContext read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OAuth2ConsentRequestOpenIDConnectContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OAuth2ConsentRequestOpenIDConnectContext
  * @throws IOException if the JSON string is invalid with respect to OAuth2ConsentRequestOpenIDConnectContext
  */
  public static OAuth2ConsentRequestOpenIDConnectContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OAuth2ConsentRequestOpenIDConnectContext.class);
  }

 /**
  * Convert an instance of OAuth2ConsentRequestOpenIDConnectContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

