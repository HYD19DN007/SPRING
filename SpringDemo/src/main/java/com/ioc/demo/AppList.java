package com.ioc.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ioc.demo.classes.Circle;
import com.ioc.demo.classes.Rectangle;
import com.ioc.demo.classes.Square;
import com.ioc.demo.classes.Triangle;
import com.ioc.demo.classes.point;

/**
 * Hello world!
 *
 */
public class AppList 
{
    public static void main( String[] args )
    {
    	//BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/ioc/demo/spring.xml"));
        ApplicationContext factory=new ClassPathXmlApplicationContext("com/ioc/demo/SpringList.xml");
    	
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
        Square S=(Square)factory.getBean("S");
       
       for(point p:S.getList())
       {
    	   System.out.println(p.getX()+ " "+ p.getY());
       }
       for(Integer p:S.getNos())
       {
    	   System.out.println(p);
       }
        
        
    }
}
