import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ren.improve.cap4.config.Cap4MainConfig;

public class Cap4Test {
	@Test
	public void test01() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap4MainConfig.class);
		System.out.println("IOC容器创建完成");
		//执行获取才创建bean初始化
		context.getBean("person");
	}
}
