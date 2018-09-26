package com.cf.cloud.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Created by jjmendoza on 14/7/2017.
 */
@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin().permitAll().defaultSuccessUrl("/index")
                .and()
                .logout().logoutSuccessUrl("http://www.baidu.com")
                .and()
//                .requestMatchers()
//                .antMatchers("/", "/login", "/oauth/authorize", "/oauth/confirm_access", "/exit")
//                .and()
                .authorizeRequests()
                .antMatchers("/webjars/**","/logout","/login").permitAll()
                .anyRequest().authenticated()
                .and().csrf().disable()
        ;
    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin").password("admin").authorities("admin").build());
        manager.createUser(User.withUsername("user").password("user").authorities("USER").build());
        return manager;
    }
}
