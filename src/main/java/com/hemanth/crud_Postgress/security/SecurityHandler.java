package com.hemanth.crud_Postgress.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

/*
@Configuration
public class SecurityHandler
{
    @Bean
    public InMemoryUserDetailsManager detailsManager()
    {
        UserDetails john= User.builder()
                .username("user1")
                .password("{noop}testroot")
                .roles("employee")
                .build();
        UserDetails ram=User.builder()
                .username("user2")
                .password("{noop}root")
                .roles("employee")
                .build();

        return new InMemoryUserDetailsManager(john,ram);

    }

}


 */