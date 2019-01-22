package com.java;
import java.util.*;
public class Demo2 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings({ "rawtypes", "unused" })
		List list=new ArrayList();
		list.add("xyz");
		list.add(10);
		list.add("pqr");
		list.add(20);
		list.add("mno");
		list.add(30);
		list.add("abc");
		list.add(40);
		list.add("bbb");
		list.add(50);
		Iterator itr=list.iterator();
		/*while(itr.hasNext())
		{
			Object o=itr.next();
			if(o instanceof String)
			{
				String s=(String)o;
				System.out.println(s);
			}
			else if(o instanceof Integer)
			{
				int a=(int)o;
				System.out.println(a);
			}*/
		

		    int a=(int)list.get(3);
		    System.out.println(a);
	}
}

