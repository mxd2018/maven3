package com.qianfeng.service.impl;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;import com.qianfeng.dao.daoInterface;
import com.qianfeng.dao.impl.daoInterfaceImpl;

public class serviceInterfaceImplTest {
	@SuppressWarnings("resource")
	@Test
	public void Testselect(){
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		serviceInterfaceImpl sImpl = cxt.getBean("serviceInterfaceImpl", serviceInterfaceImpl.class);
		daoInterfaceImpl dImpl = cxt.getBean("daoInterfaceImpl", daoInterfaceImpl.class);
		sImpl.setDao(dImpl);
		
		sImpl.select(2);
	}
}
