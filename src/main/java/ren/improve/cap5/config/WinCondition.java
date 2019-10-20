package ren.improve.cap5.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WinCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO ϵͳΪwindows ��ͨ��
		ConfigurableBeanFactory beanFactory = context.getBeanFactory();
		//��ȡ��ǰ�Ļ�������
		Environment environment = context.getEnvironment();
		String os_name = environment.getProperty("os.name");
		System.out.println(os_name);
		return os_name.contains("Windows");
	}

}
