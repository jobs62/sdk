/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.109
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SuccessfulProjectConfigUpdate {
    #[serde(rename = "project", skip_serializing_if = "Option::is_none")]
    pub project: Option<Box<crate::models::Project>>,
    /// Import Warnings  Not all configuration items can be imported to Ory Cloud. For example, setting the port does not make sense because Ory Cloud provides the runtime and networking.  This field contains warnings where configuration keys were found but can not be imported. These keys will be ignored by Ory Cloud. This field will help you understand why certain configuration keys might not be respected!
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<crate::models::Warning>>,
}

impl SuccessfulProjectConfigUpdate {
    pub fn new() -> SuccessfulProjectConfigUpdate {
        SuccessfulProjectConfigUpdate {
            project: None,
            warnings: None,
        }
    }
}


