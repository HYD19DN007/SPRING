package com.ioc.demo.classes;

public class Rectangle {
  private point pointA;
  private point pointB;
  private point pointC;
  private point pointD;

public point getPointA() {
	return pointA;
}
public void setPointA(point pointA) {
	this.pointA = pointA;
}
public point getPointB() {
	return pointB;
}
public void setPointB(point pointB) {
	this.pointB = pointB;
}
public point getPointC() {
	return pointC;
}
public void setPointC(point pointC) {
	this.pointC = pointC;
}
public point getPointD() {
	return pointD;
}
public void setPointD(point pointD) {
	this.pointD = pointD;
}
public Rectangle() {
	super();
}

public Rectangle(point A) {
	super();
	System.out.println("One Argument");
	this.pointA = A;
	this.pointB = A;
	this.pointC = A;
	this.pointD = A;
}

public Rectangle(point pointA, point pointB, point pointC, point pointD) {
	super();
	System.out.println("4 Arguments");
	this.pointA = pointA;
	this.pointB = pointB;
	this.pointC = pointC;
	this.pointD = pointD;
}
}
