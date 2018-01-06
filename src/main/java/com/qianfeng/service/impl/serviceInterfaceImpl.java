package com.qianfeng.service.impl;

import com.qianfeng.dao.daoInterface;
import com.qianfeng.service.serviceInterface;



public class serviceInterfaceImpl implements serviceInterface {
	private daoInterface dao=null;
	
	
	public daoInterface getDao() {
		return dao;
	}
	public void setDao(daoInterface dao) {
		this.dao = dao;
	}
	
	public void init(){
		System.out.println("对象的初始化方法！");
	}
	
	@Override
	public void select(int id) {
		dao.select(id);
	}
	
	
	//这个方法在什么时候调用》？？？
	public void destroy(){
		System.out.println("对象的销毁方法");
	}
	
	

	

}
