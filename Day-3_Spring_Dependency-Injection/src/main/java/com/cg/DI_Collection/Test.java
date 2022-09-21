package com.cg.DI_Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	    JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
	    
	    jc.getAddressList();
	    jc.getAddressSet();
	    jc.getAddressMap();
	    jc.getAddressProp();
	}

}
