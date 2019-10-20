package ren.improve.cap5.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WinCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO 系统为windows 则通过
		ConfigurableBeanFactory beanFactory = context.getBeanFactory();
		//获取当前的环境变量
		Environment environment = context.getEnvironment();
		String os_name = environment.getProperty("os.name");
		System.out.println(os_name);
		return os_name.contains("Windows");
	}

}
