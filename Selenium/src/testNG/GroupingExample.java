package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Apple1 Testing");
	}
	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Apple2 Testing");
	}
	@Test(groups = {"lenovo"})
	public void lenovo1() {
		System.out.println("lenovo1 Testing");
	}
	@Test(groups = {"lenovo"})
	public void lenovo2() {
		System.out.println("lenovo2 Testing");
	}
	@Test(groups = {"Moto"})
	public void moto1() {
		System.out.println("moto1 Testing");
	}
	@Test(groups = {"Moto"})
	public void moto2() {
		System.out.println("moto2 Testing");
	}
	@Test(groups = {"Vivo"})
	public void vivo1() {
		System.out.println("vivo1 Testing");
	}
	@Test(groups = {"Vivo"})
	public void vivo2() {
		System.out.println("vivo2 Testing");
	}

}
