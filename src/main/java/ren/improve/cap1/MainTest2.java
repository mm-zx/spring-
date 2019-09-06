package ren.improve.cap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ren.improve.cap1.config.MainConfig;

public class MainTest2 {
	public static void main(String args[]) {
		// 把beans.xml的类加载到容器中
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

		// 从容器中获取bean(若不设置id 默认id为类名)
		Person person = (Person) context.getBean("person");
		System.out.println(person);

		String[] namesForBean = context.getBeanNamesForType(Person.class);
		for(String name:namesForBean){
			System.out.println(name);
		}
	}
}
