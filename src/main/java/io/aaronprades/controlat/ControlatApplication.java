package io.aaronprades.controlat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan(basePackages= {"io.aaronprades.controlat"})
@EnableAsync
public class ControlatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlatApplication.class, args);
	}
}
