package com.qianfeng.dao.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.qianfeng.dao.daoInterface;

public class daoInterfaceImpl implements daoInterface {

	private static Map<Integer, String> m = new HashMap<>();
	static{
		m.put(1, "张三");
		m.put(2, "李四");
		m.put(3, "王五");
	}
	@Override
	public void select(int id) {
		Set<Entry<Integer,String>> set = m.entrySet();
		for(Map.Entry<Integer, String> me:set){
			if(id==me.getKey()){
				System.out.println(me.getValue());
			}	
		}
		
	}
	

}
