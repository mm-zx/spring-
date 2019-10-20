import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ren.improve.cap6.config.Cap6MainConfig;

public class Cap6Test {
	@Test
	public void test01() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap6MainConfig.class);
		System.out.println("IOC 容器创建完成");
		Object bean1 = context.getBean("ren.improve.cap6.config.CaingFactoryBean");
		Object bean2 = context.getBean("ren.improve.cap6.config.CaingFactoryBean");
		System.out.println(bean1.getClass());
		System.out.println(bean1 == bean2);
		Object bean3 = context.getBean("&ren.improve.cap6.config.CaingFactoryBean");
		System.out.println(bean3.getClass());
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
	}

}
