# StorageApi

All URIs are relative to *https://gw.api.cloud.sphereon.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackend**](StorageApi.md#createBackend) | **POST** /bucket-storage/0.6.0/backends | Create a new backend
[**createContainer**](StorageApi.md#createContainer) | **POST** /bucket-storage/0.6.0/containers | Create a new container
[**createObject**](StorageApi.md#createObject) | **POST** /bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath} | Create a new object within a container
[**deleteBackend**](StorageApi.md#deleteBackend) | **DELETE** /bucket-storage/0.6.0/backends/{backendId} | Delete a backend
[**deleteContainer**](StorageApi.md#deleteContainer) | **DELETE** /bucket-storage/0.6.0/containers/{containerId} | Delete an existing container
[**deleteObject**](StorageApi.md#deleteObject) | **DELETE** /bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath} | Delete an existing object from a container.
[**getObject**](StorageApi.md#getObject) | **GET** /bucket-storage/0.6.0/containers/{containerId}/objects/{objectPath} | Get an existing object from a container
[**updateBackend**](StorageApi.md#updateBackend) | **POST** /bucket-storage/0.6.0/backends/{backendId} | Update a backend
[**updateContainer**](StorageApi.md#updateContainer) | **POST** /bucket-storage/0.6.0/containers/{containerId} | Update a container


<a name="createBackend"></a>
# **createBackend**
> BackendResponse createBackend(backendRequest)

Create a new backend

Create a new backend

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
BackendRequest backendRequest = new BackendRequest(); // BackendRequest | backendRequest
try {
    BackendResponse result = apiInstance.createBackend(backendRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendRequest** | [**BackendRequest**](BackendRequest.md)| backendRequest |

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createContainer"></a>
# **createContainer**
> ContainerResponse createContainer(containerRequest)

Create a new container

Create a new container

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
ContainerRequest containerRequest = new ContainerRequest(); // ContainerRequest | containerRequest
try {
    ContainerResponse result = apiInstance.createContainer(containerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerRequest** | [**ContainerRequest**](ContainerRequest.md)| containerRequest |

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="createObject"></a>
# **createObject**
> createObject(containerId, objectPath, stream)

Create a new object within a container

Create a new object within a container. If the container did not exist yet, it will be created on the fly with a default policy, hence no 404 http status will be returned

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
String objectPath = "objectPath_example"; // String | objectPath
File stream = new File("/path/to/file.txt"); // File | stream
try {
    apiInstance.createObject(containerId, objectPath, stream);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **objectPath** | **String**| objectPath |
 **stream** | **File**| stream |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: *_/_*

<a name="deleteBackend"></a>
# **deleteBackend**
> BackendResponse deleteBackend(backendId)

Delete a backend

Delete a backend

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String backendId = "backendId_example"; // String | backendId
try {
    BackendResponse result = apiInstance.deleteBackend(backendId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId |

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteContainer"></a>
# **deleteContainer**
> ContainerResponse deleteContainer(containerId, delete)

Delete an existing container

Delete an existing container including the stored objects if indicated.

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
String delete = "delete_example"; // String | delete
try {
    ContainerResponse result = apiInstance.deleteContainer(containerId, delete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **delete** | **String**| delete | [optional] [enum: RECURSIVE, EMPTY_ONLY]

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="deleteObject"></a>
# **deleteObject**
> deleteObject(containerId, objectPath)

Delete an existing object from a container.

Delete an existing object from a container. There is no request nor response body for a delete request.

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
String objectPath = "objectPath_example"; // String | objectPath
try {
    apiInstance.deleteObject(containerId, objectPath);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **objectPath** | **String**| objectPath |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="getObject"></a>
# **getObject**
> getObject(containerId, objectPath)

Get an existing object from a container

Get an existing object from a container

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
String objectPath = "objectPath_example"; // String | objectPath
try {
    apiInstance.getObject(containerId, objectPath);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **objectPath** | **String**| objectPath |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json;charset=UTF-8

<a name="updateBackend"></a>
# **updateBackend**
> BackendResponse updateBackend(backendId, backendRequest)

Update a backend

Update a backend

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String backendId = "backendId_example"; // String | backendId
BackendRequest backendRequest = new BackendRequest(); // BackendRequest | backendRequest
try {
    BackendResponse result = apiInstance.updateBackend(backendId, backendRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#updateBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backendId** | **String**| backendId |
 **backendRequest** | [**BackendRequest**](BackendRequest.md)| backendRequest |

### Return type

[**BackendResponse**](BackendResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="updateContainer"></a>
# **updateContainer**
> ContainerResponse updateContainer(containerId, containerRequest)

Update a container

Update an existing container with new container settings

### Example
```java
// Import classes:
//import com.sphereon.sdk.storage.handler.ApiClient;
//import com.sphereon.sdk.storage.handler.ApiException;
//import com.sphereon.sdk.storage.handler.Configuration;
//import com.sphereon.sdk.storage.handler.auth.*;
//import com.sphereon.sdk.storage.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String containerId = "containerId_example"; // String | containerId
ContainerRequest containerRequest = new ContainerRequest(); // ContainerRequest | containerRequest
try {
    ContainerResponse result = apiInstance.updateContainer(containerId, containerRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#updateContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerId** | **String**| containerId |
 **containerRequest** | [**ContainerRequest**](ContainerRequest.md)| containerRequest |

### Return type

[**ContainerResponse**](ContainerResponse.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

