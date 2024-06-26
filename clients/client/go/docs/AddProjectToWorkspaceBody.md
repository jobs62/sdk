# AddProjectToWorkspaceBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Environment** | **string** | The environment of the project in the workspace. Can be one of \&quot;prod\&quot; or \&quot;dev\&quot;. Note that the number of projects in the \&quot;prod\&quot; environment is limited depending on the subscription. prod Production stage Staging dev Development | 
**ProjectSubscription** | **string** | The action to take with the project subscription. Can be one of \&quot;migrate\&quot;, and \&quot;ignore\&quot;. \&quot;migrate\&quot; will migrate the project subscription to the workspace. \&quot;ignore\&quot; will ignore the project subscription. migrate ProjectSubscriptionActionMigrate  ProjectSubscriptionActionMigrate will migrate the project subscription to the  workspace. ignore ProjectSubscriptionActionIgnore  ProjectSubscriptionActionIgnore will ignore the project subscription. | 

## Methods

### NewAddProjectToWorkspaceBody

`func NewAddProjectToWorkspaceBody(environment string, projectSubscription string, ) *AddProjectToWorkspaceBody`

NewAddProjectToWorkspaceBody instantiates a new AddProjectToWorkspaceBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAddProjectToWorkspaceBodyWithDefaults

`func NewAddProjectToWorkspaceBodyWithDefaults() *AddProjectToWorkspaceBody`

NewAddProjectToWorkspaceBodyWithDefaults instantiates a new AddProjectToWorkspaceBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEnvironment

`func (o *AddProjectToWorkspaceBody) GetEnvironment() string`

GetEnvironment returns the Environment field if non-nil, zero value otherwise.

### GetEnvironmentOk

`func (o *AddProjectToWorkspaceBody) GetEnvironmentOk() (*string, bool)`

GetEnvironmentOk returns a tuple with the Environment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnvironment

`func (o *AddProjectToWorkspaceBody) SetEnvironment(v string)`

SetEnvironment sets Environment field to given value.


### GetProjectSubscription

`func (o *AddProjectToWorkspaceBody) GetProjectSubscription() string`

GetProjectSubscription returns the ProjectSubscription field if non-nil, zero value otherwise.

### GetProjectSubscriptionOk

`func (o *AddProjectToWorkspaceBody) GetProjectSubscriptionOk() (*string, bool)`

GetProjectSubscriptionOk returns a tuple with the ProjectSubscription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectSubscription

`func (o *AddProjectToWorkspaceBody) SetProjectSubscription(v string)`

SetProjectSubscription sets ProjectSubscription field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


