package ren.improve.cap6.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import ren.improve.cap6.bean.Pig;

public class CaingImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		boolean hasCat = registry.containsBeanDefinition("ren.improve.cap6.bean.Cat");
		boolean hasDog = registry.containsBeanDefinition("ren.improve.cap6.bean.Dog");
		if(hasCat&& hasDog) {
			//注册一个bean进入容器  需通过RootBeanDefinition 转换格式
			BeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
			registry.registerBeanDefinition("pig", beanDefinition);
		}

	}

}
