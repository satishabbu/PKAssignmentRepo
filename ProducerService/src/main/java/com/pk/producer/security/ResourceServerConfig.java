package com.pk.producer.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.AuthenticationEntryPoint;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

  @Value("${security.jwt.resource-ids}")
  private String resourceIds;

  @Override
  public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
    resources.authenticationEntryPoint(customAuthEntryPoint()).resourceId(resourceIds)
        .stateless(false);
  }

  @Bean
  public AuthenticationEntryPoint customAuthEntryPoint() {
    return new CustomAuthenticationEntryPoint();
  }

  @Override
  public void configure(HttpSecurity http) throws Exception {
    http.csrf().disable().anonymous().disable().authorizeRequests().antMatchers("/oauth/token")
        .permitAll();
  }

}
