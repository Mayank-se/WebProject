package Pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoOne {
@BeforeClass
public static void one_Test_Before() {
	System.out.println("before Test one");
}
@BeforeTest
public static void one_Tests_Before() {
	System.out.println("before Med_Test one");
}
@AfterTest
public static void one_Tests_After() {
	System.out.println("After Med_Test one");
}
@BeforeMethod
public static void one_Test_Method_Before() {
	System.out.println("before Method_Test one");
}
@AfterMethod
public static void one_Test_After_Before() {
	System.out.println("before After_Test one");
}
@Test
public static void one_Test() {
	System.out.println("one_Test");
}
@Test
public static void two_Test() {
	System.out.println("two_Test");
}
@AfterClass
public static void one_Test_After() {
	System.out.println("after Test one");
}
}
