package com.ioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.demo.classes.Rectangle;

public class AutowireDemoByConstrutor {
public static void main(String[] args) {
    ApplicationContext factory=new ClassPathXmlApplicationContext("com/ioc/demo/AutowiredemoByContructor.xml");
    Rectangle R=(Rectangle)factory.getBean("R");
    System.out.println("Point A"+ R.getPointA().getX()+ " "+R.getPointA().getY());
    System.out.println("Point B"+ R.getPointB().getX()+ " "+R.getPointC().getY());
    System.out.println("Point C"+ R.getPointC().getX()+ " "+R.getPointB().getY());
    System.out.println("Point D"+ R.getPointD().getX()+ " "+R.getPointD().getY());
    


}

}
