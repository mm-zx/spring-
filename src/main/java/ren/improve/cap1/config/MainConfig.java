package ren.improve.cap1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ren.improve.cap1.Person;

//配置类====配置文件
@Configuration
public class MainConfig {
	// 给容器中注册一个bean，类型为返回值的类型
	// @Bean("abcPerson")
	@Bean
	public Person person() {
		return new Person("caing", 23);
	}
}
