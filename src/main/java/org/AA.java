package org;

import org.mh.BB;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AA {

	public static void main(String[] args) {
		AbstractApplicationContext gxac = new GenericXmlApplicationContext("a.xml");
		BB bb = gxac.getBean("bb",BB.class);
		bb.doB();
		
	}
}
