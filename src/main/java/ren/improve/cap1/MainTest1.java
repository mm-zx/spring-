package ren.improve.cap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest1 {
	public static void main(String args[]) {
		// ��beans.xml������ص�������
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// �������л�ȡbean
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}

}
