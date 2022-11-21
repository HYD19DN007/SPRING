package com.ioc.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ioc.demo.classes.Circle;
import com.ioc.demo.classes.Rectangle;
import com.ioc.demo.classes.Triangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/ioc/demo/spring.xml"));
        ApplicationContext factory=new ClassPathXmlApplicationContext("com/ioc/demo/spring.xml");
    	
//    	Triangle triangle=(Triangle) factory.getBean("T");
//        triangle.Print();
//        Triangle triangle1=(Triangle) factory.getBean("T1");
//        triangle1.Print();
//        Triangle triangle2=(Triangle) factory.getBean("T2");
//        triangle2.Print();
//        
//     	Triangle triangle3=(Triangle) factory.getBean("T");
//         System.out.println(triangle);
//         System.out.println(triangle3);
//        //Circle C=(Circle)factory.getBean("C");
//        //C.Draw();
// 
        Triangle traingle4=(Triangle)factory.getBean("TS1");
        traingle4.Print();
        Rectangle R=(Rectangle)factory.getBean("R");
        System.out.println("Point A"+ R.getPointA().getX()+ " "+R.getPointA().getY());
        System.out.println("Point B"+ R.getPointB().getX()+ " "+R.getPointC().getY());
        System.out.println("Point C"+ R.getPointC().getX()+ " "+R.getPointB().getY());
        System.out.println("Point D"+ R.getPointD().getX()+ " "+R.getPointD().getY());
        
        
    }
}
