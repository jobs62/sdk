/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v0.2.0-alpha.34
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"time"
)

// FlushInactiveOAuth2TokensRequest struct for FlushInactiveOAuth2TokensRequest
type FlushInactiveOAuth2TokensRequest struct {
	// NotAfter sets after which point tokens should not be flushed. This is useful when you want to keep a history of recently issued tokens for auditing.
	NotAfter *time.Time `json:"notAfter,omitempty"`
}

// NewFlushInactiveOAuth2TokensRequest instantiates a new FlushInactiveOAuth2TokensRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFlushInactiveOAuth2TokensRequest() *FlushInactiveOAuth2TokensRequest {
	this := FlushInactiveOAuth2TokensRequest{}
	return &this
}

// NewFlushInactiveOAuth2TokensRequestWithDefaults instantiates a new FlushInactiveOAuth2TokensRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFlushInactiveOAuth2TokensRequestWithDefaults() *FlushInactiveOAuth2TokensRequest {
	this := FlushInactiveOAuth2TokensRequest{}
	return &this
}

// GetNotAfter returns the NotAfter field value if set, zero value otherwise.
func (o *FlushInactiveOAuth2TokensRequest) GetNotAfter() time.Time {
	if o == nil || o.NotAfter == nil {
		var ret time.Time
		return ret
	}
	return *o.NotAfter
}

// GetNotAfterOk returns a tuple with the NotAfter field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FlushInactiveOAuth2TokensRequest) GetNotAfterOk() (*time.Time, bool) {
	if o == nil || o.NotAfter == nil {
		return nil, false
	}
	return o.NotAfter, true
}

// HasNotAfter returns a boolean if a field has been set.
func (o *FlushInactiveOAuth2TokensRequest) HasNotAfter() bool {
	if o != nil && o.NotAfter != nil {
		return true
	}

	return false
}

// SetNotAfter gets a reference to the given time.Time and assigns it to the NotAfter field.
func (o *FlushInactiveOAuth2TokensRequest) SetNotAfter(v time.Time) {
	o.NotAfter = &v
}

func (o FlushInactiveOAuth2TokensRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.NotAfter != nil {
		toSerialize["notAfter"] = o.NotAfter
	}
	return json.Marshal(toSerialize)
}

type NullableFlushInactiveOAuth2TokensRequest struct {
	value *FlushInactiveOAuth2TokensRequest
	isSet bool
}

func (v NullableFlushInactiveOAuth2TokensRequest) Get() *FlushInactiveOAuth2TokensRequest {
	return v.value
}

func (v *NullableFlushInactiveOAuth2TokensRequest) Set(val *FlushInactiveOAuth2TokensRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableFlushInactiveOAuth2TokensRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableFlushInactiveOAuth2TokensRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFlushInactiveOAuth2TokensRequest(val *FlushInactiveOAuth2TokensRequest) *NullableFlushInactiveOAuth2TokensRequest {
	return &NullableFlushInactiveOAuth2TokensRequest{value: val, isSet: true}
}

func (v NullableFlushInactiveOAuth2TokensRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFlushInactiveOAuth2TokensRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

