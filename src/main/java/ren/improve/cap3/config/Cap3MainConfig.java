package ren.improve.cap3.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ren.improve.cap1.Person;

@Configuration
public class Cap3MainConfig {
	// ��������ע��һ��bean������Ϊ����ֵ������
	/*
	 * prototype:��ʵ����IOC����������ʱ��IOC��������������ȥ���÷����������󣬶���ÿ�λ�ȡ�Ż���÷�����������
	 * singleton:��ʵ��(Ĭ��):IOC����������ʱ�����÷����������󲢷ŵ�IOC�����У�֮��ÿ�λ�ȡ����ͬһ��bean
	 * request:��Ҫ���webӦ�ã��ݽ�һ�����󴴽�һ��ʵ��
	 */
	@Scope("prototype")
	@Bean
	public Person person() {
		return new Person("caing", 23);
	}
}