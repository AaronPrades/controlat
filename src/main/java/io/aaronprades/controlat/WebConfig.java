package io.aaronprades.controlat;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");

//		registry.addViewController("/session-expired").setViewName("error/session-expired");

//		registry.addViewController("/login").setViewName("login");
//		registry.addViewController("/aviso-mantenimiento").setViewName("aviso-mantenimiento");
	}
}
