package testNG;

import org.testng.annotations.Test;

public class dependanciesManagement {

	@Test
	public void highschool() {
		System.out.println("Student passed high school");
	}
	@Test(dependsOnMethods = "highschool")
	public void higherSecondaryschool() {
		System.out.println("Student passed higher seconday school");
	}
	@Test(dependsOnMethods = "higherSecondaryschool")

	public void engineering() {
		System.out.println("Student is in college");
	}
}
