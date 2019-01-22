package com.java;

//import java.awt.List;
import java.util.*;

public class University 
{
	public static void main(String[] args) 
	{
		
	    College c=new College();
		List<Student>l=c.setData();
		Iterator<Student> itr=l.iterator();
		for(Student c1:l)
		{
			Object o=itr.next();
			//System.out.println(o);
			Student s=(Student)o;
			System.out.println(s.getRollno());
			System.out.println(s.getName());
			System.out.println(s.getAddress());
		}
	}
}
