/*
ORY Oathkeeper

ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.

API version: v0.40.2
Contact: hi@ory.am
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
)


type ApiApi interface {

	/*
	Decisions Access Control Decision API

	> This endpoint works with all HTTP Methods (GET, POST, PUT, ...) and matches every path prefixed with /decisions.

This endpoint mirrors the proxy capability of ORY Oathkeeper's proxy functionality but instead of forwarding the
request to the upstream server, returns 200 (request should be allowed), 401 (unauthorized), or 403 (forbidden)
status codes. This endpoint can be used to integrate with other API Proxies like Ambassador, Kong, Envoy, and many more.

	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return ApiApiDecisionsRequest
	*/
	Decisions(ctx context.Context) ApiApiDecisionsRequest

	// DecisionsExecute executes the request
	DecisionsExecute(r ApiApiDecisionsRequest) (*http.Response, error)

	/*
	GetRule Retrieve a Rule

	Use this method to retrieve a rule from the storage. If it does not exist you will receive a 404 error.

	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@param id
	@return ApiApiGetRuleRequest
	*/
	GetRule(ctx context.Context, id string) ApiApiGetRuleRequest

	// GetRuleExecute executes the request
	//  @return Rule
	GetRuleExecute(r ApiApiGetRuleRequest) (*Rule, *http.Response, error)

	/*
	GetWellKnownJSONWebKeys Lists Cryptographic Keys

	This endpoint returns cryptographic keys that are required to, for example, verify signatures of ID Tokens.

	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return ApiApiGetWellKnownJSONWebKeysRequest
	*/
	GetWellKnownJSONWebKeys(ctx context.Context) ApiApiGetWellKnownJSONWebKeysRequest

	// GetWellKnownJSONWebKeysExecute executes the request
	//  @return JsonWebKeySet
	GetWellKnownJSONWebKeysExecute(r ApiApiGetWellKnownJSONWebKeysRequest) (*JsonWebKeySet, *http.Response, error)

	/*
	ListRules List All Rules

	This method returns an array of all rules that are stored in the backend. This is useful if you want to get a full
view of what rules you have currently in place.

	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return ApiApiListRulesRequest
	*/
	ListRules(ctx context.Context) ApiApiListRulesRequest

	// ListRulesExecute executes the request
	//  @return []Rule
	ListRulesExecute(r ApiApiListRulesRequest) ([]Rule, *http.Response, error)
}

// ApiApiService ApiApi service
type ApiApiService service

type ApiApiDecisionsRequest struct {
	ctx context.Context
	ApiService ApiApi
}

func (r ApiApiDecisionsRequest) Execute() (*http.Response, error) {
	return r.ApiService.DecisionsExecute(r)
}

/*
Decisions Access Control Decision API

> This endpoint works with all HTTP Methods (GET, POST, PUT, ...) and matches every path prefixed with /decisions.

This endpoint mirrors the proxy capability of ORY Oathkeeper's proxy functionality but instead of forwarding the
request to the upstream server, returns 200 (request should be allowed), 401 (unauthorized), or 403 (forbidden)
status codes. This endpoint can be used to integrate with other API Proxies like Ambassador, Kong, Envoy, and many more.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiApiDecisionsRequest
*/
func (a *ApiApiService) Decisions(ctx context.Context) ApiApiDecisionsRequest {
	return ApiApiDecisionsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
func (a *ApiApiService) DecisionsExecute(r ApiApiDecisionsRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ApiApiService.Decisions")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/decisions"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 401 {
			var v GenericError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 403 {
			var v GenericError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v GenericError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v GenericError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarHTTPResponse, newErr
			}
			newErr.model = v
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

type ApiApiGetRuleRequest struct {
	ctx context.Context
	ApiService ApiApi
	id string
}

func (r ApiApiGetRuleRequest) Execute() (*Rule, *http.Response, error) {
	return r.ApiService.GetRuleExecute(r)
}

/*
GetRule Retrieve a Rule

Use this method to retrieve a rule from the storage. If it does not exist you will receive a 404 error.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param id
 @return ApiApiGetRuleRequest
*/
func (a *ApiApiService) GetRule(ctx context.Context, id string) ApiApiGetRuleRequest {
	return ApiApiGetRuleRequest{
		ApiService: a,
		ctx: ctx,
		id: id,
	}
}

// Execute executes the request
//  @return Rule
func (a *ApiApiService) GetRuleExecute(r ApiApiGetRuleRequest) (*Rule, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *Rule
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ApiApiService.GetRule")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/rules/{id}"
	localVarPath = strings.Replace(localVarPath, "{"+"id"+"}", url.PathEscape(parameterToString(r.id, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 404 {
			var v GenericError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v GenericError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiApiGetWellKnownJSONWebKeysRequest struct {
	ctx context.Context
	ApiService ApiApi
}

func (r ApiApiGetWellKnownJSONWebKeysRequest) Execute() (*JsonWebKeySet, *http.Response, error) {
	return r.ApiService.GetWellKnownJSONWebKeysExecute(r)
}

/*
GetWellKnownJSONWebKeys Lists Cryptographic Keys

This endpoint returns cryptographic keys that are required to, for example, verify signatures of ID Tokens.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiApiGetWellKnownJSONWebKeysRequest
*/
func (a *ApiApiService) GetWellKnownJSONWebKeys(ctx context.Context) ApiApiGetWellKnownJSONWebKeysRequest {
	return ApiApiGetWellKnownJSONWebKeysRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return JsonWebKeySet
func (a *ApiApiService) GetWellKnownJSONWebKeysExecute(r ApiApiGetWellKnownJSONWebKeysRequest) (*JsonWebKeySet, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *JsonWebKeySet
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ApiApiService.GetWellKnownJSONWebKeys")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/.well-known/jwks.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v GenericError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiApiListRulesRequest struct {
	ctx context.Context
	ApiService ApiApi
	limit *int64
	offset *int64
}

// The maximum amount of rules returned.
func (r ApiApiListRulesRequest) Limit(limit int64) ApiApiListRulesRequest {
	r.limit = &limit
	return r
}

// The offset from where to start looking.
func (r ApiApiListRulesRequest) Offset(offset int64) ApiApiListRulesRequest {
	r.offset = &offset
	return r
}

func (r ApiApiListRulesRequest) Execute() ([]Rule, *http.Response, error) {
	return r.ApiService.ListRulesExecute(r)
}

/*
ListRules List All Rules

This method returns an array of all rules that are stored in the backend. This is useful if you want to get a full
view of what rules you have currently in place.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiApiListRulesRequest
*/
func (a *ApiApiService) ListRules(ctx context.Context) ApiApiListRulesRequest {
	return ApiApiListRulesRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return []Rule
func (a *ApiApiService) ListRulesExecute(r ApiApiListRulesRequest) ([]Rule, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  []Rule
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ApiApiService.ListRules")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/rules"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.limit != nil {
		localVarQueryParams.Add("limit", parameterToString(*r.limit, ""))
	}
	if r.offset != nil {
		localVarQueryParams.Add("offset", parameterToString(*r.offset, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 500 {
			var v GenericError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
