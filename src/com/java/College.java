package com.java;


import java.util.*;

public class College 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	List<Student> list=new ArrayList();
	public List setData()
	{
		//List list=new ArrayList();
		Student s=new Student();
		s.setRollno(1);
		s.setName("Gaju");
		s.setAddress("pune");
		
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("Krishna");
		s1.setAddress("pune");
		//return s1;
		Student s2=new Student();
		s2.setRollno(3);
		s2.setName("Rohit");
		s2.setAddress("pune");
		 
		
		list.add(s);
		list.add(s1);
		list.add(s2);
		return list;
	}
}
