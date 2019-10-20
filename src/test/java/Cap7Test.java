import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ren.improve.cap7.config.Cap7MainConfig;

public class Cap7Test {
	@Test
	public void test01() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap7MainConfig.class);
		System.out.println("IOC容器创建完成");
		System.out.println(context.getBean("bike"));
		System.out.println(context.getBean("bike"));
		context.close();
	}
}
