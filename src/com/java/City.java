package com.java;
import java.util.*;
public class City 
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		@SuppressWarnings("rawtypes")
		List mh=new ArrayList();
		mh.add("Aurangabad");
		mh.add("Pune");
		mh.add("Nagar");
		
		@SuppressWarnings("rawtypes")
		List jh=new ArrayList();
		jh.add("ABC");
		jh.add("UUU");
		
		@SuppressWarnings("rawtypes")
		List india=new ArrayList();
		india.add(mh);
		india.add(jh);
		
		@SuppressWarnings("rawtypes")
		Iterator itr=india.iterator();
		while(itr.hasNext())
		{
			@SuppressWarnings("rawtypes")
			List list=(List)itr.next();
			@SuppressWarnings("rawtypes")
			Iterator itr1=list.iterator();
			while(itr1.hasNext())
			{
				String s=(String)itr1.next();
				System.out.println(s);
			}
		}
	}
	
}
