import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ren.improve.cap8.config.Cap8MainConfig;

public class Cap8Test {

	@Test
	public void test() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap8MainConfig.class);
		System.out.println(applicationContext.getBean("bird"));
		
	}
}
