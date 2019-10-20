package ren.improve.cap6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import ren.improve.cap1.Person;
import ren.improve.cap6.bean.Dog;

@Configuration
@Import(value = { Dog.class, CaingImportSelector.class, CaingImportBeanDefinitionRegistrar.class ,CaingFactoryBean.class})
public class Cap6MainConfig {
	@Bean("person")
	public Person person() {
		return new Person("person", 20);
	}
}
