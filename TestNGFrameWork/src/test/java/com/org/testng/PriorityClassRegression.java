package com.org.testng;

import org.testng.annotations.Test;

public class PriorityClassRegression {
	@Test(groups= {"Regresssion"})
	public void t1() {
		System.out.println("Test 1");
	}
	@Test
	public void t2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"Regresssion"})
	public void t3() {
		System.out.println("Test 3");
	}
	@Test
	public void t4()
	{
		System.out.println("test4");
	}
	@Test(groups= {"Regresssion"})
	public void t5() {
		System.out.println("Test 5");
	}
	@Test
	public void t6()
	{
		System.out.println("test6");
	}
	
	
	
	


}
