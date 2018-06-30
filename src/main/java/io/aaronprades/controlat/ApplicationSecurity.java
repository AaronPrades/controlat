//package io.aaronprades.controlat;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.switchuser.SwitchUserFilter;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
//public class ApplicationSecurity extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.formLogin()
//			.loginPage("/login").permitAll()
//			.failureUrl("/login?error")
//			
//			.and()
//			
//			.logout().permitAll()
//			
//			.and()
//			
//			.authorizeRequests()
//				.antMatchers("/html/**").permitAll()
//				.antMatchers("/css/**").permitAll()
//				.antMatchers("/js/**").permitAll()
//				.antMatchers("/fonts/**").permitAll()
//				.antMatchers("/img/**").permitAll()
//				.antMatchers("/error/**").permitAll()
//				
//			.anyRequest().fullyAuthenticated()
//			
//			.and()
//			
//			.csrf();
//	}
//	
//	@Configuration
//	protected static class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {
//		static final int SHA_PASSWORD_ENCODER_STRENGTH = 256;
//		
//		@Autowired
//		private UserDetailsService userDetailsService;
//		
//		@Override
//		public void init(AuthenticationManagerBuilder auth) throws Exception {
//			auth.userDetailsService(userDetailsService)
//				.passwordEncoder(new  MessageDigestPasswordEncoder("SHA-" + SHA_PASSWORD_ENCODER_STRENGTH));
//		}
//	}
//	
//	@Bean
//	public SwitchUserFilter switchUserFilter() {
//		SwitchUserFilter switchUserFilter = new SwitchUserFilter();
//		
//		switchUserFilter.setUserDetailsService(userDetailsService());
//		switchUserFilter.setSwitchUserUrl("/impersonate/login");
//		switchUserFilter.setExitUserUrl("/impersonate/logout");
//		switchUserFilter.setTargetUrl("/");
//		
//		return switchUserFilter;
//	}
//}
