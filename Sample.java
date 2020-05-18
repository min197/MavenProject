package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sample {
	@BeforeSuite
	public void test1() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeClass
	public void test2() {
		System.out.println("@BeforeClass");
	}

	@Test
	public void test3() {
		System.out.println("@Test");
	}

	@BeforeMethod
	public void test4() {
		System.out.println("@BeforeMethod");

	}


}
