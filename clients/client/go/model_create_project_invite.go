/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.18
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// CreateProjectInvite Create Project Invite Request Body
type CreateProjectInvite struct {
	InviteeEmail *string `json:"invitee_email,omitempty"`
}

// NewCreateProjectInvite instantiates a new CreateProjectInvite object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateProjectInvite() *CreateProjectInvite {
	this := CreateProjectInvite{}
	return &this
}

// NewCreateProjectInviteWithDefaults instantiates a new CreateProjectInvite object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateProjectInviteWithDefaults() *CreateProjectInvite {
	this := CreateProjectInvite{}
	return &this
}

// GetInviteeEmail returns the InviteeEmail field value if set, zero value otherwise.
func (o *CreateProjectInvite) GetInviteeEmail() string {
	if o == nil || o.InviteeEmail == nil {
		var ret string
		return ret
	}
	return *o.InviteeEmail
}

// GetInviteeEmailOk returns a tuple with the InviteeEmail field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateProjectInvite) GetInviteeEmailOk() (*string, bool) {
	if o == nil || o.InviteeEmail == nil {
		return nil, false
	}
	return o.InviteeEmail, true
}

// HasInviteeEmail returns a boolean if a field has been set.
func (o *CreateProjectInvite) HasInviteeEmail() bool {
	if o != nil && o.InviteeEmail != nil {
		return true
	}

	return false
}

// SetInviteeEmail gets a reference to the given string and assigns it to the InviteeEmail field.
func (o *CreateProjectInvite) SetInviteeEmail(v string) {
	o.InviteeEmail = &v
}

func (o CreateProjectInvite) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.InviteeEmail != nil {
		toSerialize["invitee_email"] = o.InviteeEmail
	}
	return json.Marshal(toSerialize)
}

type NullableCreateProjectInvite struct {
	value *CreateProjectInvite
	isSet bool
}

func (v NullableCreateProjectInvite) Get() *CreateProjectInvite {
	return v.value
}

func (v *NullableCreateProjectInvite) Set(val *CreateProjectInvite) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateProjectInvite) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateProjectInvite) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateProjectInvite(val *CreateProjectInvite) *NullableCreateProjectInvite {
	return &NullableCreateProjectInvite{value: val, isSet: true}
}

func (v NullableCreateProjectInvite) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateProjectInvite) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


