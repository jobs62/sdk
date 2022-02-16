/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.98
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
import java.time.OffsetDateTime;
import java.util.UUID;
import sh.ory.model.IdentitySchema;

/**
 * ProjectRevisionIdentitySchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T10:32:38.731017650Z[Etc/UTC]")
public class ProjectRevisionIdentitySchema {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_IDENTITY_SCHEMA = "identity_schema";
  @SerializedName(SERIALIZED_NAME_IDENTITY_SCHEMA)
  private IdentitySchema identitySchema;

  public static final String SERIALIZED_NAME_IDENTITY_SCHEMA_ID = "identity_schema_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_SCHEMA_ID)
  private String identitySchemaId;

  public static final String SERIALIZED_NAME_IMPORT_ID = "import_id";
  @SerializedName(SERIALIZED_NAME_IMPORT_ID)
  private String importId;

  public static final String SERIALIZED_NAME_IMPORT_URL = "import_url";
  @SerializedName(SERIALIZED_NAME_IMPORT_URL)
  private String importUrl;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_PRESET = "preset";
  @SerializedName(SERIALIZED_NAME_PRESET)
  private String preset;

  public static final String SERIALIZED_NAME_PROJECT_REVISION_ID = "project_revision_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_REVISION_ID)
  private UUID projectRevisionId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ProjectRevisionIdentitySchema() { 
  }

  
  public ProjectRevisionIdentitySchema(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * The Project&#39;s Revision Creation Date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Project's Revision Creation Date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public ProjectRevisionIdentitySchema id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ProjectRevisionIdentitySchema identitySchema(IdentitySchema identitySchema) {
    
    this.identitySchema = identitySchema;
    return this;
  }

   /**
   * Get identitySchema
   * @return identitySchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentitySchema getIdentitySchema() {
    return identitySchema;
  }


  public void setIdentitySchema(IdentitySchema identitySchema) {
    this.identitySchema = identitySchema;
  }


  public ProjectRevisionIdentitySchema identitySchemaId(String identitySchemaId) {
    
    this.identitySchemaId = identitySchemaId;
    return this;
  }

   /**
   * Get identitySchemaId
   * @return identitySchemaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentitySchemaId() {
    return identitySchemaId;
  }


  public void setIdentitySchemaId(String identitySchemaId) {
    this.identitySchemaId = identitySchemaId;
  }


  public ProjectRevisionIdentitySchema importId(String importId) {
    
    this.importId = importId;
    return this;
  }

   /**
   * The imported (named) ID of the Identity Schema referenced in the Ory Kratos config.
   * @return importId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The imported (named) ID of the Identity Schema referenced in the Ory Kratos config.")

  public String getImportId() {
    return importId;
  }


  public void setImportId(String importId) {
    this.importId = importId;
  }


  public ProjectRevisionIdentitySchema importUrl(String importUrl) {
    
    this.importUrl = importUrl;
    return this;
  }

   /**
   * The ImportURL can be used to import an Identity Schema from a bse64 encoded string. In the future, this key also support HTTPS and other sources!  If you import an Ory Kratos configuration, this would be akin to the &#x60;identity.schemas.#.url&#x60; key.  The configuration will always return the import URL when you fetch it from the API.
   * @return importUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "base64://ey...", value = "The ImportURL can be used to import an Identity Schema from a bse64 encoded string. In the future, this key also support HTTPS and other sources!  If you import an Ory Kratos configuration, this would be akin to the `identity.schemas.#.url` key.  The configuration will always return the import URL when you fetch it from the API.")

  public String getImportUrl() {
    return importUrl;
  }


  public void setImportUrl(String importUrl) {
    this.importUrl = importUrl;
  }


  public ProjectRevisionIdentitySchema isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * If true sets the default schema for identities  Only one schema can ever be the default schema. If you try to add two schemas with default to true, the request will fail.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true sets the default schema for identities  Only one schema can ever be the default schema. If you try to add two schemas with default to true, the request will fail.")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public ProjectRevisionIdentitySchema preset(String preset) {
    
    this.preset = preset;
    return this;
  }

   /**
   * Use a preset instead of a custom identity schema.
   * @return preset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use a preset instead of a custom identity schema.")

  public String getPreset() {
    return preset;
  }


  public void setPreset(String preset) {
    this.preset = preset;
  }


  public ProjectRevisionIdentitySchema projectRevisionId(UUID projectRevisionId) {
    
    this.projectRevisionId = projectRevisionId;
    return this;
  }

   /**
   * Get projectRevisionId
   * @return projectRevisionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getProjectRevisionId() {
    return projectRevisionId;
  }


  public void setProjectRevisionId(UUID projectRevisionId) {
    this.projectRevisionId = projectRevisionId;
  }


   /**
   * Last Time Project&#39;s Revision was Updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last Time Project's Revision was Updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRevisionIdentitySchema projectRevisionIdentitySchema = (ProjectRevisionIdentitySchema) o;
    return Objects.equals(this.createdAt, projectRevisionIdentitySchema.createdAt) &&
        Objects.equals(this.id, projectRevisionIdentitySchema.id) &&
        Objects.equals(this.identitySchema, projectRevisionIdentitySchema.identitySchema) &&
        Objects.equals(this.identitySchemaId, projectRevisionIdentitySchema.identitySchemaId) &&
        Objects.equals(this.importId, projectRevisionIdentitySchema.importId) &&
        Objects.equals(this.importUrl, projectRevisionIdentitySchema.importUrl) &&
        Objects.equals(this.isDefault, projectRevisionIdentitySchema.isDefault) &&
        Objects.equals(this.preset, projectRevisionIdentitySchema.preset) &&
        Objects.equals(this.projectRevisionId, projectRevisionIdentitySchema.projectRevisionId) &&
        Objects.equals(this.updatedAt, projectRevisionIdentitySchema.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, identitySchema, identitySchemaId, importId, importUrl, isDefault, preset, projectRevisionId, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRevisionIdentitySchema {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identitySchema: ").append(toIndentedString(identitySchema)).append("\n");
    sb.append("    identitySchemaId: ").append(toIndentedString(identitySchemaId)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
    sb.append("    importUrl: ").append(toIndentedString(importUrl)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
    sb.append("    projectRevisionId: ").append(toIndentedString(projectRevisionId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

}

