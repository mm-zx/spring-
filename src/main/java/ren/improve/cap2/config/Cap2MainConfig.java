package ren.improve.cap2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import ren.improve.cap1.Person;
import ren.improve.cap2.controller.OrderController;

@Configuration
@ComponentScan(value = "ren.improve.cap2", includeFilters = {
		@Filter(type = FilterType.CUSTOM, classes = { CaingTypeFilter.class }) }, useDefaultFilters = false)
public class Cap2MainConfig {
	// 给容器中注册一个bean，类型为返回值的类型
	@Bean
	public Person person() {
		return new Person("caing", 23);
	}
}