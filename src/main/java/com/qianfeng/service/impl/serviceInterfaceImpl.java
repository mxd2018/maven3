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
		System.out.println("����ĳ�ʼ��������");
	}
	
	@Override
	public void select(int id) {
		dao.select(id);
	}
	
	
	//���������ʲôʱ����á�������
	public void destroy(){
		System.out.println("��������ٷ���");
	}
	
	

	

}
