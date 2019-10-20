package ren.improve.cap5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import ren.improve.cap1.Person;

@Configuration
public class Cap5MainConfig {
	@Bean("person")
	public Person person() {
		System.out.println("给容器添加Person........");
		return new Person("person",20);
	}
	@Conditional(WinCondition.class)
	@Bean("lison")
	public Person lison() {
		System.out.println("给容器添加Lison........");
		return new Person("lison",23);
	}
	@Bean("caing")
	public Person caing() {
		System.out.println("给容器添加Caing........");
		return new Person("caing",24);
	}

}
