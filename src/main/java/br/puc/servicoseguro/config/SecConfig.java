package br.puc.servicoseguro.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecConfig extends WebSecurityConfigurerAdapter {


    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf()
                .disable()
                .authorizeRequests()

                .antMatchers("/").permitAll()
                .antMatchers("/h2-console/**").permitAll()

                .antMatchers(HttpMethod.POST, "/api/login").permitAll()
                .antMatchers(HttpMethod.GET, "/api/group").permitAll()

                .antMatchers(HttpMethod.POST, "/api/usuarios").permitAll()
                .antMatchers(HttpMethod.GET, "/api/usuarios").authenticated()
                .antMatchers(HttpMethod.PUT, "/api/usuarios").authenticated()
                .antMatchers(HttpMethod.DELETE, "/api/usuarios").authenticated()

                .antMatchers(HttpMethod.POST, "/api/produtos").permitAll()
                .antMatchers(HttpMethod.GET, "/api/produtos").permitAll()
                .antMatchers(HttpMethod.PUT, "/api/produtos").authenticated()
                .antMatchers(HttpMethod.DELETE, "/api/produtos").authenticated()
                //.antMatchers("/api/*").authenticated()
                .and()
                .csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().headers().frameOptions().sameOrigin().and()

                // filtra requisições de login
                .addFilterBefore(new JWTLoginFilter("/api/login", authenticationManager()),
                        UsernamePasswordAuthenticationFilter.class)

                // filtra outras requisições para verificar a presença do JWT no header
                .addFilterBefore(new JWTAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("servico")
                .password("{noop}servico")
                .roles("ADMIN");
    }
}