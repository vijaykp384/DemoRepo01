package testc;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnot 
{
	@Test
	public void funa()
	{
		System.out.println("testing of testng 1st test annotation");
	}
	@Test
	public void fun()
	{
		System.out.println("testing of 2nd test testng annotation");
	}
	@BeforeTest
	public void Te1()
	{
		System.out.println("testing of testng beforeannotation");
	}
}
