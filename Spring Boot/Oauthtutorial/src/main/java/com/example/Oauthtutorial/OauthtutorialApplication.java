package com.example.Oauthtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController

public class OauthtutorialApplication extends WebSecurityConfigurerAdapter {
	 @GetMapping("/user")
	    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
	        return Collections.singletonMap("name", principal.getAttribute("name"));
	    }
	 
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	    	// @formatter:off
	        http
	            .authorizeRequests(a -> a
	                .antMatchers("/", "/error", "/webjars/**").permitAll()
	                .anyRequest().authenticated()
	            )
	            .exceptionHandling(e -> e
	                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED)) .logout(l -> l
	                        .logoutSuccessUrl("/").permitAll().csrf(c -> c
	                                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
	                                )

	            )
	            .oauth2Login();
	        // @formatter:on
	    }

	}

	public static void main(String[] args) {
		SpringApplication.run(OauthtutorialApplication.class, args);
	}

}
