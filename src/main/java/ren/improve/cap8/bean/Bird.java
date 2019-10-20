package ren.improve.cap8.bean;

import org.springframework.beans.factory.annotation.Value;

public class Bird {
	@Value("caing")
	private String name;
	@Value("#{22-4}")
	private int age;
	private String color;
	@Value("${bird.size}")
	private int size;

	public Bird() {
		super();
	}
	

	public Bird(String name, int age, String color, int size) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.size = size;
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:" + name + "; age:" + age + "; color:" + color + "; size:" + size;
	}

}
