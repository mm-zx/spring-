package ren.improve.cap8.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ren.improve.cap8.bean.Bird;

@Configuration
@PropertySource("classpath:/test.properties")
public class Cap8MainConfig {
	@Bean("bird")
	public Bird bird() {
		return new Bird();
	}

}
