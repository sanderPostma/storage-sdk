/**
 * Storage
 * Sphereon Storage APIs provide an abstraction layer for storage of containers (folders) and objects (files), using a filesystem backend or AWS-s3, Azure blobstorage or Google cloud storage backend.
 *
 * OpenAPI spec version: 0.6.0
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.storage.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * BackendRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-20T15:53:06.291+02:00")
public class BackendRequest   {
  /**
   * Gets or Sets authenticationProvider
   */
  public enum AuthenticationProviderEnum {
    @SerializedName("API_SUPPLIER")
    API_SUPPLIER("API_SUPPLIER"),
    
    @SerializedName("END_USER")
    END_USER("END_USER");

    private String value;

    AuthenticationProviderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("authenticationProvider")
  private AuthenticationProviderEnum authenticationProvider = null;

  @SerializedName("secretKey")
  private String secretKey = null;

  /**
   * Gets or Sets backendType
   */
  public enum BackendTypeEnum {
    @SerializedName("FILESYSTEM")
    FILESYSTEM("FILESYSTEM"),
    
    @SerializedName("AMAZON_S3")
    AMAZON_S3("AMAZON_S3"),
    
    @SerializedName("MS_AZURE_BLOB_STORAGE")
    MS_AZURE_BLOB_STORAGE("MS_AZURE_BLOB_STORAGE"),
    
    @SerializedName("GOOGLE_CLOUD_STORAGE")
    GOOGLE_CLOUD_STORAGE("GOOGLE_CLOUD_STORAGE");

    private String value;

    BackendTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("backendType")
  private BackendTypeEnum backendType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("accesskeyId")
  private String accesskeyId = null;

  public BackendRequest authenticationProvider(AuthenticationProviderEnum authenticationProvider) {
    this.authenticationProvider = authenticationProvider;
    return this;
  }

   /**
   * Get authenticationProvider
   * @return authenticationProvider
  **/
  @ApiModelProperty(example = "null", value = "")
  public AuthenticationProviderEnum getAuthenticationProvider() {
    return authenticationProvider;
  }

  public void setAuthenticationProvider(AuthenticationProviderEnum authenticationProvider) {
    this.authenticationProvider = authenticationProvider;
  }

  public BackendRequest secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public BackendRequest backendType(BackendTypeEnum backendType) {
    this.backendType = backendType;
    return this;
  }

   /**
   * Get backendType
   * @return backendType
  **/
  @ApiModelProperty(example = "null", value = "")
  public BackendTypeEnum getBackendType() {
    return backendType;
  }

  public void setBackendType(BackendTypeEnum backendType) {
    this.backendType = backendType;
  }

  public BackendRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BackendRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BackendRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public BackendRequest accesskeyId(String accesskeyId) {
    this.accesskeyId = accesskeyId;
    return this;
  }

   /**
   * Get accesskeyId
   * @return accesskeyId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAccesskeyId() {
    return accesskeyId;
  }

  public void setAccesskeyId(String accesskeyId) {
    this.accesskeyId = accesskeyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackendRequest backendRequest = (BackendRequest) o;
    return Objects.equals(this.authenticationProvider, backendRequest.authenticationProvider) &&
        Objects.equals(this.secretKey, backendRequest.secretKey) &&
        Objects.equals(this.backendType, backendRequest.backendType) &&
        Objects.equals(this.name, backendRequest.name) &&
        Objects.equals(this.description, backendRequest.description) &&
        Objects.equals(this.parentId, backendRequest.parentId) &&
        Objects.equals(this.accesskeyId, backendRequest.accesskeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationProvider, secretKey, backendType, name, description, parentId, accesskeyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackendRequest {\n");
    
    sb.append("    authenticationProvider: ").append(toIndentedString(authenticationProvider)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    backendType: ").append(toIndentedString(backendType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    accesskeyId: ").append(toIndentedString(accesskeyId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
