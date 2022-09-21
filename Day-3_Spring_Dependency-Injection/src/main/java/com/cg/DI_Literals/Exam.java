package com.cg.DI_Literals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		/*Student s=new Student();
		s.setStudentName("Devyani Kasar");
		s.display();*/
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Student s=c.getBean("s",Student.class);
		s.display();
		
		/*Student s1=c.getBean("s1",Student.class);
		s1.display(); */
	}

}
