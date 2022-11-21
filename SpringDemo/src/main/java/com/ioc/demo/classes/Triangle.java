package com.ioc.demo.classes;

public class Triangle {
	private int base;
	private int height;
	

	public void Draw() {
		System.out.println("Triangle Drawn");
	}
//<bean id="T" class="com.ioc.demo.classes.Triangle"></bean> 
	  
	public Triangle() {
		this.base = 10;
		this.height = 20;
	}

	public void Print() {
		System.out.println("Base " + base);
		System.out.println("Height " + height);
	}

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	public Triangle(int V) {
		super();
		this.base = V;
		this.height = V;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
}
