import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ren.improve.cap1.Person;
import ren.improve.cap3.config.Cap3MainConfig;

public class Cap3Test {
	@Test
	public void test01() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
		Person person1 = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person");
		System.out.println(person1 == person2);
	}
}
