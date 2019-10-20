package ren.improve.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bike implements ApplicationContextAware {
	private ApplicationContext applicationContext;

	public Bike() {
		System.out.println("Bike creating--------");
	}

	public void init() {
		System.out.println("Bike init------------");
	}

	public void destory() {
		System.out.println("Bike destory---------");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}

}
