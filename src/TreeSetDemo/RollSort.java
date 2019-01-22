package TreeSetDemo;

import java.util.Comparator;

public class RollSort implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		StudentInfo s=(StudentInfo)o1;
		StudentInfo s1=(StudentInfo)o2;
		return s.getRollno()-s1.getRollno();
	}
}
