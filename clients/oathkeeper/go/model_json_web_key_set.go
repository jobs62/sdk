/*
ORY Oathkeeper

ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.

API version: v0.40.2
Contact: hi@ory.am
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// JsonWebKeySet struct for JsonWebKeySet
type JsonWebKeySet struct {
	// The value of the \"keys\" parameter is an array of JWK values.  By default, the order of the JWK values within the array does not imply an order of preference among them, although applications of JWK Sets can choose to assign a meaning to the order for their purposes, if desired.
	Keys []JsonWebKey `json:"keys,omitempty"`
}

// NewJsonWebKeySet instantiates a new JsonWebKeySet object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewJsonWebKeySet() *JsonWebKeySet {
	this := JsonWebKeySet{}
	return &this
}

// NewJsonWebKeySetWithDefaults instantiates a new JsonWebKeySet object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewJsonWebKeySetWithDefaults() *JsonWebKeySet {
	this := JsonWebKeySet{}
	return &this
}

// GetKeys returns the Keys field value if set, zero value otherwise.
func (o *JsonWebKeySet) GetKeys() []JsonWebKey {
	if o == nil || o.Keys == nil {
		var ret []JsonWebKey
		return ret
	}
	return o.Keys
}

// GetKeysOk returns a tuple with the Keys field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JsonWebKeySet) GetKeysOk() ([]JsonWebKey, bool) {
	if o == nil || o.Keys == nil {
		return nil, false
	}
	return o.Keys, true
}

// HasKeys returns a boolean if a field has been set.
func (o *JsonWebKeySet) HasKeys() bool {
	if o != nil && o.Keys != nil {
		return true
	}

	return false
}

// SetKeys gets a reference to the given []JsonWebKey and assigns it to the Keys field.
func (o *JsonWebKeySet) SetKeys(v []JsonWebKey) {
	o.Keys = v
}

func (o JsonWebKeySet) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Keys != nil {
		toSerialize["keys"] = o.Keys
	}
	return json.Marshal(toSerialize)
}

type NullableJsonWebKeySet struct {
	value *JsonWebKeySet
	isSet bool
}

func (v NullableJsonWebKeySet) Get() *JsonWebKeySet {
	return v.value
}

func (v *NullableJsonWebKeySet) Set(val *JsonWebKeySet) {
	v.value = val
	v.isSet = true
}

func (v NullableJsonWebKeySet) IsSet() bool {
	return v.isSet
}

func (v *NullableJsonWebKeySet) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableJsonWebKeySet(val *JsonWebKeySet) *NullableJsonWebKeySet {
	return &NullableJsonWebKeySet{value: val, isSet: true}
}

func (v NullableJsonWebKeySet) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableJsonWebKeySet) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


