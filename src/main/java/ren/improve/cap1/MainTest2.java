package ren.improve.cap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ren.improve.cap1.config.MainConfig;

public class MainTest2 {
	public static void main(String args[]) {
		// ��beans.xml������ص�������
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

		// �������л�ȡbean(��������id Ĭ��idΪ����)
		Person person = (Person) context.getBean("person");
		System.out.println(person);

		String[] namesForBean = context.getBeanNamesForType(Person.class);
		for(String name:namesForBean){
			System.out.println(name);
		}
	}
}
