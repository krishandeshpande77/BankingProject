package SetDemo;

import java.util.*;

public class SetDemo 
{
	public static void main(String[] args) 
	{
		/*Set<Integer> s=new HashSet();
		s.add(10);
		s.add(5);
		s.add(8);
		s.add(2);
		s.add(15);
		s.add(7);
		for(int x:s)
		{
			System.out.println(x);
		}*/
		//how to remove duplicate element from list
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(5);
		list.add(10);
		list.add(8);
		list.add(6);
		list.add(15);
		list.add(20);
		
		//Set<Integer> s=new HashSet<>(list);//Using HashSet we can remove duplicate data
		//Set<Integer> s=new LinkedHashSet<>(list);//by using LinkedHashSet we are get data by sequentially
		//Set s=new HashSet();
		//Collections.sort(list);//using collentions.sort()method we can get repeated+sorting data
		//Set s=new TreeSet(list);//using treeset we can get sorted data and remove repeated data
		//System.out.println(s);
	}
}
