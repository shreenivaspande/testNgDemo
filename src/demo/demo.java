package demo;

import org.testng.annotations.Test;

public class demo {
	
	@Test( priority = 1, enabled =false )                                  // this is not run 
	public void testcase1() {
		System.out.println("i am the first tasecase");
	}
	@Test(priority =2, invocationCount = 4)                               // how time run this method 
    public void testcase2() {
	System.out.println("i am test case second");
}
	@Test(priority =-1, dependsOnMethods = {"testcase5"})                // depends on other method this method execute then this method execute
    void testcase3() {
    	System.out.println("i am test case therd");
    }
	@Test(enabled = false)
	void testcase4(){
		System.out.println("i am the tast case 4");
	}
	@Test
	void testcase5() {
		System.out.println("i am the test case 5");
	} 
}
