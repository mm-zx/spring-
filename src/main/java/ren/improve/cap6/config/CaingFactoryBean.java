package ren.improve.cap6.config;

import org.springframework.beans.factory.FactoryBean;

import ren.improve.cap6.bean.Monkey;

public class CaingFactoryBean implements FactoryBean<Monkey> {

	@Override
	public Monkey getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Monkey();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Monkey.class;
	}

	@Override
	public boolean isSingleton() {
		// ÊÇ·ñµ¥Àý
		return false;
	}

}
