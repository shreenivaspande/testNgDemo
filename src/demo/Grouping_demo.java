package demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping_demo 
{
	
	@AfterTest
	public void btest() {
		System.out.println("btest");
	}
	
	@Test
	public void seeet() {
		System.out.println("in the test");
	}
	
	@BeforeTest
	public void atest() {
		System.out.println("atest");
	}

}
