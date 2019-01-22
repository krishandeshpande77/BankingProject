package com.java;

import java.util.*;

public class Demo 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		@SuppressWarnings("rawtypes")
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			int x=(int)itr.next();
			System.out.println(x);
		}
		
	}
}
