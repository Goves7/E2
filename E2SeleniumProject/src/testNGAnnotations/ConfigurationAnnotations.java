package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ConfigurationAnnotations {
  @Test
  public void testMethod1() 
  {
	  Reporter.log("This Is Test Method 1", true);
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("This Is Before Method", true); 
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("This Is After Method", true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("This Is Before Class", true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("This Is After Class", true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("This Is Before Test", true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("This Is After Test", true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("This Is Before Suite", true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("This Is After Suite", true);
  }
  
  @Test
  public void testMethod3()
  {
	  Reporter.log("This Is Test Method 3", true);
  }

  @Test
  public void testMethod2()
  {
	  Reporter.log("This Is Test Method 2", true);
  }

}
