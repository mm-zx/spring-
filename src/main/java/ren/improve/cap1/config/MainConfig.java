package ren.improve.cap1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ren.improve.cap1.Person;

//������====�����ļ�
@Configuration
public class MainConfig {
	// ��������ע��һ��bean������Ϊ����ֵ������
	// @Bean("abcPerson")
	@Bean
	public Person person() {
		return new Person("caing", 23);
	}
}
