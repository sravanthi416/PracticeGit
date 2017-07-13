package com.alacriti;

public class StringManipulation {
	public String name1,name2;
	public String toString(String name1,String name2)
	{
		return name1 + " " +name2;
		
	}
	public void length(String name1)
	{
		int len=name1.length();
		System.out.println("length is"+len);
	}
	public void concatinting(String name)
	{
		System.out.println("my nme is" +name);
	
	}
	public boolean equal(String name1,String name2)
	{
		if(name1.equals(name2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
