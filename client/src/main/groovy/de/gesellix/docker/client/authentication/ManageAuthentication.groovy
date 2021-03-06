package de.gesellix.docker.client.authentication

import de.gesellix.docker.engine.EngineResponse

interface ManageAuthentication {

    Map<String, AuthConfig> getAllAuthConfigs()

    Map<String, AuthConfig> getAllAuthConfigs(File dockerCfgOrNull)

    AuthConfig readDefaultAuthConfig()

    AuthConfig readAuthConfig(String hostnameOrNull, File dockerCfgOrNull)

    String retrieveEncodedAuthTokenForImage(String image)

    String encodeAuthConfig(AuthConfig authConfig)

    String encodeAuthConfigs(Map<String, AuthConfig> authConfigs)

    EngineResponse auth(Map authDetails)
}
