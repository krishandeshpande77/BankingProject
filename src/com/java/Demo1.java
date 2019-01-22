package com.java;
import java.util.*;

public class Demo1 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings({ "rawtypes", "unused" })
		List list=new ArrayList();
		list.add("xyz");
		list.add("pqr");
		list.add("mno");
		list.add("abc");
		list.add("bbb");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
		}
		
	}
}
