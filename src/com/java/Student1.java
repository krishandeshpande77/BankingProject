package com.java;
import java.util.*;
public class Student1 
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		List b97=new ArrayList();
		List b98=new ArrayList();
		List cjc=new ArrayList();
		 b97.add("Pawan");
		 b97.add("Mukesh");
		 b97.add("Nikhil");
		 b97.add("Umesh");
		 b97.add("Divya");
		 b98.add("Sneha");
		 b98.add("Rahul");
		 b98.add("Sheetal");
		 b98.add("Mangesh");
		 cjc.add(b97);
		 cjc.add(b98);
		 
		 @SuppressWarnings("rawtypes")
		Iterator itr=cjc.iterator();
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
