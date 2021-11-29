package package1;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstUniqueChar {

	private char firstUniqueChar(String s) {
		char ch = 0;
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			if((!s.substring(i+1).contains(Character.toString(s.charAt(i)))&&(!list.contains(s.charAt(i)))))
			{
				ch = s.charAt(i);
				break;
			}
			else
			{
				list.add(s.charAt(i));
			}
		}
		return ch;
	}
	@Test
	public void testCase1()
	{
		Assert.assertEquals(firstUniqueChar("aDcadhc"), 'D');
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(firstUniqueChar("AabBcC"), 'A');
	}

}
