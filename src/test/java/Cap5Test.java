import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ren.improve.cap5.config.Cap5MainConfig;

public class Cap5Test {
	@Test
	public void test01() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap5MainConfig.class);
		System.out.println("IOC�����������");
		//ִ�л�ȡ�Ŵ���bean��ʼ��
		context.getBean("person");
	}
}
