package com.cg.SpringAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext c =new ClassPathXmlApplicationContext("beans.xml");
        Human human=c.getBean("human",Human.class);
		human.pumping();
	}

}
