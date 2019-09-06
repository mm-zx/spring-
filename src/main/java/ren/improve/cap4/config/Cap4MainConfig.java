package ren.improve.cap4.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import ren.improve.cap1.Person;

@Configuration
public class Cap4MainConfig {
	// ��������ע��һ��bean������Ϊ����ֵ������
	/*
	 * Ĭ��������������ʱ�򴴽�����
	 * �����أ���Ҫ��Ե�ʵ��bean����������ʱ�򲻴������󣬽�����һ��ʹ�ã���ȡ��bean��ʱ��ű���ʼ��
	 */
	@Lazy
	@Bean
	public Person person() {
		System.out.println("�����������person����������������");
		return new Person("caing", 23);
	}
}