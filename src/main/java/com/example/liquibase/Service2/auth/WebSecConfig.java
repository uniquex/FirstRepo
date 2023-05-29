package com.example.liquibase.Service2.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecConfig extends WebSecurityConfigurerAdapter {


    private CustomUserDetailsService customUserDetailsService;

    public WebSecConfig(CustomUserDetailsService customUserDetailsService) {
        this.customUserDetailsService = customUserDetailsService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.httpBasic();
        http.csrf().disable().authorizeRequests()./*antMatchers("/pax/**").hasAnyRole("admin","student")
                .and().formLogin();*/anyRequest().authenticated();

        //http.csrf().disable();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth)throws Exception{
        /*
        auth.inMemoryAuthentication().withUser("tural").password("{noop}tural123").roles("admin");
        auth.inMemoryAuthentication().withUser("nargiz").password("{noop}nargiz123").roles("student");*/
        auth.userDetailsService(customUserDetailsService);
    }

    @Bean
    public PasswordEncoder passwordEncoder (){
        return NoOpPasswordEncoder.getInstance();
    }
}
