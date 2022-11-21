package scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.demo.classes.Triangle;

public class AppMain {
public static void main(String[] args) {
	  ApplicationContext factory=new ClassPathXmlApplicationContext("scopes/SpringScope.xml");
  	 Triangle T= (Triangle)factory.getBean("T");
  	 System.out.println(T);
  	 Triangle T1= (Triangle)factory.getBean("T");
 	 System.out.println(T1);
 	 Triangle T2= (Triangle)factory.getBean("T");
 	 System.out.println(T2);
 	
 	 ApplicationContext factory1=new ClassPathXmlApplicationContext("scopes/SpringScope2.xml");
   	 Triangle T3= (Triangle)factory1.getBean("T");
   	 System.out.println(T3);
   	 Triangle T4= (Triangle)factory1.getBean("T1");
  	 System.out.println(T4);
  	 Triangle T5= (Triangle)factory1.getBean("T");
  	 System.out.println(T5);


}
}
