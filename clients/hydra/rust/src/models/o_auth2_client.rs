/*
 * Ory Oathkeeper API
 *
 * Documentation for all of Ory Oathkeeper's APIs. 
 *
 * The version of the OpenAPI document: v1.11.4
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct OAuth2Client {
    #[serde(rename = "allowed_cors_origins", skip_serializing_if = "Option::is_none")]
    pub allowed_cors_origins: Option<Vec<String>>,
    #[serde(rename = "audience", skip_serializing_if = "Option::is_none")]
    pub audience: Option<Vec<String>>,
    /// Boolean value specifying whether the RP requires that a sid (session ID) Claim be included in the Logout Token to identify the RP session with the OP when the backchannel_logout_uri is used. If omitted, the default value is false.
    #[serde(rename = "backchannel_logout_session_required", skip_serializing_if = "Option::is_none")]
    pub backchannel_logout_session_required: Option<bool>,
    /// RP URL that will cause the RP to log itself out when sent a Logout Token by the OP.
    #[serde(rename = "backchannel_logout_uri", skip_serializing_if = "Option::is_none")]
    pub backchannel_logout_uri: Option<String>,
    /// ID  is the id for this client.
    #[serde(rename = "client_id", skip_serializing_if = "Option::is_none")]
    pub client_id: Option<String>,
    /// Name is the human-readable string name of the client to be presented to the end-user during authorization.
    #[serde(rename = "client_name", skip_serializing_if = "Option::is_none")]
    pub client_name: Option<String>,
    /// Secret is the client's secret. The secret will be included in the create request as cleartext, and then never again. The secret is stored using BCrypt so it is impossible to recover it. Tell your users that they need to write the secret down as it will not be made available again.
    #[serde(rename = "client_secret", skip_serializing_if = "Option::is_none")]
    pub client_secret: Option<String>,
    /// SecretExpiresAt is an integer holding the time at which the client secret will expire or 0 if it will not expire. The time is represented as the number of seconds from 1970-01-01T00:00:00Z as measured in UTC until the date/time of expiration.  This feature is currently not supported and it's value will always be set to 0.
    #[serde(rename = "client_secret_expires_at", skip_serializing_if = "Option::is_none")]
    pub client_secret_expires_at: Option<i64>,
    /// ClientURI is an URL string of a web page providing information about the client. If present, the server SHOULD display this URL to the end-user in a clickable fashion.
    #[serde(rename = "client_uri", skip_serializing_if = "Option::is_none")]
    pub client_uri: Option<String>,
    #[serde(rename = "contacts", skip_serializing_if = "Option::is_none")]
    pub contacts: Option<Vec<String>>,
    /// CreatedAt returns the timestamp of the client's creation.
    #[serde(rename = "created_at", skip_serializing_if = "Option::is_none")]
    pub created_at: Option<String>,
    /// Boolean value specifying whether the RP requires that iss (issuer) and sid (session ID) query parameters be included to identify the RP session with the OP when the frontchannel_logout_uri is used. If omitted, the default value is false.
    #[serde(rename = "frontchannel_logout_session_required", skip_serializing_if = "Option::is_none")]
    pub frontchannel_logout_session_required: Option<bool>,
    /// RP URL that will cause the RP to log itself out when rendered in an iframe by the OP. An iss (issuer) query parameter and a sid (session ID) query parameter MAY be included by the OP to enable the RP to validate the request and to determine which of the potentially multiple sessions is to be logged out; if either is included, both MUST be.
    #[serde(rename = "frontchannel_logout_uri", skip_serializing_if = "Option::is_none")]
    pub frontchannel_logout_uri: Option<String>,
    #[serde(rename = "grant_types", skip_serializing_if = "Option::is_none")]
    pub grant_types: Option<Vec<String>>,
    #[serde(rename = "jwks", skip_serializing_if = "Option::is_none")]
    pub jwks: Option<serde_json::Value>,
    /// URL for the Client's JSON Web Key Set [JWK] document. If the Client signs requests to the Server, it contains the signing key(s) the Server uses to validate signatures from the Client. The JWK Set MAY also contain the Client's encryption keys(s), which are used by the Server to encrypt responses to the Client. When both signing and encryption keys are made available, a use (Key Use) parameter value is REQUIRED for all keys in the referenced JWK Set to indicate each key's intended usage. Although some algorithms allow the same key to be used for both signatures and encryption, doing so is NOT RECOMMENDED, as it is less secure. The JWK x5c parameter MAY be used to provide X.509 representations of keys provided. When used, the bare key values MUST still be present and MUST match those in the certificate.
    #[serde(rename = "jwks_uri", skip_serializing_if = "Option::is_none")]
    pub jwks_uri: Option<String>,
    /// LogoURI is an URL string that references a logo for the client.
    #[serde(rename = "logo_uri", skip_serializing_if = "Option::is_none")]
    pub logo_uri: Option<String>,
    #[serde(rename = "metadata", skip_serializing_if = "Option::is_none")]
    pub metadata: Option<serde_json::Value>,
    /// Owner is a string identifying the owner of the OAuth 2.0 Client.
    #[serde(rename = "owner", skip_serializing_if = "Option::is_none")]
    pub owner: Option<String>,
    /// PolicyURI is a URL string that points to a human-readable privacy policy document that describes how the deployment organization collects, uses, retains, and discloses personal data.
    #[serde(rename = "policy_uri", skip_serializing_if = "Option::is_none")]
    pub policy_uri: Option<String>,
    #[serde(rename = "post_logout_redirect_uris", skip_serializing_if = "Option::is_none")]
    pub post_logout_redirect_uris: Option<Vec<String>>,
    #[serde(rename = "redirect_uris", skip_serializing_if = "Option::is_none")]
    pub redirect_uris: Option<Vec<String>>,
    /// RegistrationAccessToken can be used to update, get, or delete the OAuth2 Client.
    #[serde(rename = "registration_access_token", skip_serializing_if = "Option::is_none")]
    pub registration_access_token: Option<String>,
    /// RegistrationClientURI is the URL used to update, get, or delete the OAuth2 Client.
    #[serde(rename = "registration_client_uri", skip_serializing_if = "Option::is_none")]
    pub registration_client_uri: Option<String>,
    /// JWS [JWS] alg algorithm [JWA] that MUST be used for signing Request Objects sent to the OP. All Request Objects from this Client MUST be rejected, if not signed with this algorithm.
    #[serde(rename = "request_object_signing_alg", skip_serializing_if = "Option::is_none")]
    pub request_object_signing_alg: Option<String>,
    #[serde(rename = "request_uris", skip_serializing_if = "Option::is_none")]
    pub request_uris: Option<Vec<String>>,
    #[serde(rename = "response_types", skip_serializing_if = "Option::is_none")]
    pub response_types: Option<Vec<String>>,
    /// Scope is a string containing a space-separated list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749]) that the client can use when requesting access tokens.
    #[serde(rename = "scope", skip_serializing_if = "Option::is_none")]
    pub scope: Option<String>,
    /// URL using the https scheme to be used in calculating Pseudonymous Identifiers by the OP. The URL references a file with a single JSON array of redirect_uri values.
    #[serde(rename = "sector_identifier_uri", skip_serializing_if = "Option::is_none")]
    pub sector_identifier_uri: Option<String>,
    /// SubjectType requested for responses to this Client. The subject_types_supported Discovery parameter contains a list of the supported subject_type values for this server. Valid types include `pairwise` and `public`.
    #[serde(rename = "subject_type", skip_serializing_if = "Option::is_none")]
    pub subject_type: Option<String>,
    /// Requested Client Authentication method for the Token Endpoint. The options are client_secret_post, client_secret_basic, private_key_jwt, and none.
    #[serde(rename = "token_endpoint_auth_method", skip_serializing_if = "Option::is_none")]
    pub token_endpoint_auth_method: Option<String>,
    /// Requested Client Authentication signing algorithm for the Token Endpoint.
    #[serde(rename = "token_endpoint_auth_signing_alg", skip_serializing_if = "Option::is_none")]
    pub token_endpoint_auth_signing_alg: Option<String>,
    /// TermsOfServiceURI is a URL string that points to a human-readable terms of service document for the client that describes a contractual relationship between the end-user and the client that the end-user accepts when authorizing the client.
    #[serde(rename = "tos_uri", skip_serializing_if = "Option::is_none")]
    pub tos_uri: Option<String>,
    /// UpdatedAt returns the timestamp of the last update.
    #[serde(rename = "updated_at", skip_serializing_if = "Option::is_none")]
    pub updated_at: Option<String>,
    /// JWS alg algorithm [JWA] REQUIRED for signing UserInfo Responses. If this is specified, the response will be JWT [JWT] serialized, and signed using JWS. The default, if omitted, is for the UserInfo Response to return the Claims as a UTF-8 encoded JSON object using the application/json content-type.
    #[serde(rename = "userinfo_signed_response_alg", skip_serializing_if = "Option::is_none")]
    pub userinfo_signed_response_alg: Option<String>,
}

impl OAuth2Client {
    pub fn new() -> OAuth2Client {
        OAuth2Client {
            allowed_cors_origins: None,
            audience: None,
            backchannel_logout_session_required: None,
            backchannel_logout_uri: None,
            client_id: None,
            client_name: None,
            client_secret: None,
            client_secret_expires_at: None,
            client_uri: None,
            contacts: None,
            created_at: None,
            frontchannel_logout_session_required: None,
            frontchannel_logout_uri: None,
            grant_types: None,
            jwks: None,
            jwks_uri: None,
            logo_uri: None,
            metadata: None,
            owner: None,
            policy_uri: None,
            post_logout_redirect_uris: None,
            redirect_uris: None,
            registration_access_token: None,
            registration_client_uri: None,
            request_object_signing_alg: None,
            request_uris: None,
            response_types: None,
            scope: None,
            sector_identifier_uri: None,
            subject_type: None,
            token_endpoint_auth_method: None,
            token_endpoint_auth_signing_alg: None,
            tos_uri: None,
            updated_at: None,
            userinfo_signed_response_alg: None,
        }
    }
}


