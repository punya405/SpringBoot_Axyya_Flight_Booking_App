package com.learn.srpingboot.SPRING_AXYYA.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
            throws Exception
    {
        auth.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER");
        auth.inMemoryAuthentication().withUser("ram").password("{noop}ram").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("sam").password("{noop}sam").roles("SUPER_ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/auth/**")
                .access("hasRole('ROLE_ADMIN')")
                .and()
                .httpBasic();
    }

}
