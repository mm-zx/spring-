package ren.improve.cap7.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jeep {
	public Jeep() {
		System.out.println("Jeep creating--------");
	}

	@PostConstruct
	public void init() {
		System.out.println("Jeep @PostConstruct------------");
	}
	@PreDestroy
	public void destory() {
		System.out.println("Jeep @PreDestroy---------");
	}

}
