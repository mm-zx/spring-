package ren.improve.cap7.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ren.improve.cap7.bean.Bike;
import ren.improve.cap7.bean.Jeep;

@Configuration
@ComponentScan("ren.improve.cap7")
public class Cap7MainConfig {

	@Scope("prototype")
	@Bean(initMethod = "init", destroyMethod = "destory")
	public Bike bike() {
		return new Bike();
	}

	@Bean
	public Jeep jeep() {
		return new Jeep();
	}

}
