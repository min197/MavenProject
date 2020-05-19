package testNG;

import org.testng.annotations.Test;
import java.lang.Math;

public class E3 {
	public int a = 3, x = 4, y = 5;
	@Test
	public void test1() {
		System.out.println("@Test Abs " + Math.abs(a));
	}
	
	@Test
	public void test2() {
		System.out.println("@Test addExact " + Math.addExact(x, y));
	}

	@Test
	public void test3() {
		System.out.println("@Test floorDiv " + Math.floorDiv(x, y));
	}
}
