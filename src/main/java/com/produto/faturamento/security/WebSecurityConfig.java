package com.produto.faturamento.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService; 
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	
	@Override
	protected void configure(HttpSecurity http)throws Exception {
		http.cors().and()
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/*").permitAll();
//		.antMatchers("/login").permitAll()
//		.antMatchers("/alunos").permitAll()//hasAnyRole("MANAGER")
//		//.antMatchers(HttpMethod.GET,"/alunos").permitAll()//hasAnyRole("USER","MANAGER")
//		.antMatchers("/adm-crud").permitAll()
//		.anyRequest().authenticated().and().httpBasic();
//		
	}
	
	
}
