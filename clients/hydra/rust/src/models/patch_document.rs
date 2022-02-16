/*
 * Ory Oathkeeper API
 *
 * Documentation for all of Ory Oathkeeper's APIs. 
 *
 * The version of the OpenAPI document: v1.11.4
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// PatchDocument : A JSONPatch document as defined by RFC 6902



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct PatchDocument {
    /// A JSON-pointer
    #[serde(rename = "from", skip_serializing_if = "Option::is_none")]
    pub from: Option<String>,
    /// The operation to be performed
    #[serde(rename = "op")]
    pub op: String,
    /// A JSON-pointer
    #[serde(rename = "path")]
    pub path: String,
    /// The value to be used within the operations
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<serde_json::Value>,
}

impl PatchDocument {
    /// A JSONPatch document as defined by RFC 6902
    pub fn new(op: String, path: String) -> PatchDocument {
        PatchDocument {
            from: None,
            op,
            path,
            value: None,
        }
    }
}


