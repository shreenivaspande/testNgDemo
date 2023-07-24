package demo;

import org.testng.annotations.Test;

public class loginpage {

	@Test(groups = {"loginpage"})
	public void testcase1() {
	 System.out.println("i am the first testcase");
	}
	@Test (groups = {"loginpage"})
	void testcase2() {
		 System.out.println("i am the second testcase");
	}
	@Test (groups = {"loginpage"},dependsOnGroups = {"loginpage"})               //depends on other group 
	void testcase3() {
		 System.out.println("i am the thrid testcase");
	}
	@Test (groups = {"registrationpage"})
	void testcase4() {
		 System.out.println("i am the fourt testcase");
	}
	@Test (groups = {"registrationpage"})
	void testcase5() {
		 System.out.println("i am the fifth testcase");
	}
	@Test (groups = {"registrationpage"})
	void testcase6() {
		 System.out.println("i am the fifth testcase");
	}
}
