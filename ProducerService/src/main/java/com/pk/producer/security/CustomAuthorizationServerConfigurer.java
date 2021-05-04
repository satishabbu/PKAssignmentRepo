package com.pk.producer.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableAuthorizationServer
public class CustomAuthorizationServerConfigurer extends AuthorizationServerConfigurerAdapter {

  @Value("${security.jwt.client-id}")
  private String clientId;

  @Value("${security.jwt.client-secret}")
  private String clientSecret;

  @Value("${security.jwt.grant-type}")
  private String grantType;

  @Value("${security.jwt.resource-ids}")
  private String resourceIds;

  @Value("${security.signing-key}")
  private String signingKey;

  static final String AUTHORIZATION_CODE = "authorization_code";
  static final String REFRESH_TOKEN = "refresh_token";
  static final String IMPLICIT = "implicit";
  static final String SCOPE_READ = "read";
  static final String SCOPE_WRITE = "write";
  static final String TRUST = "trust";
  private static final int ACCESS_TOKEN_VALIDITY_SECONDS = 15 * 60 * 60 * 60;

  @Autowired
  private TokenStore tokenStore;

  @Autowired
  private JwtAccessTokenConverter accessTokenConverter;

  @Autowired
  private AuthenticationManager authenticationManager;

  @Override
  public void configure(ClientDetailsServiceConfigurer configurer) throws Exception {
    configurer.inMemory().withClient(clientId).secret(clientSecret)
        .authorizedGrantTypes(grantType, AUTHORIZATION_CODE, IMPLICIT, REFRESH_TOKEN)
        .scopes(SCOPE_READ, SCOPE_WRITE, TRUST)
        .accessTokenValiditySeconds(ACCESS_TOKEN_VALIDITY_SECONDS);
  }

  @Override
  public void configure(AuthorizationServerEndpointsConfigurer configurer) throws Exception {
    configurer.tokenStore(tokenStore).accessTokenConverter(accessTokenConverter)
        .authenticationManager(authenticationManager);
  }

  @Bean
  public JwtAccessTokenConverter accessTokenConverter() {
    JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
    tokenConverter.setSigningKey(signingKey);
    return tokenConverter;
  }

  @Bean
  public TokenStore tokenStore() {
    return new JwtTokenStore(accessTokenConverter());
  }

}
