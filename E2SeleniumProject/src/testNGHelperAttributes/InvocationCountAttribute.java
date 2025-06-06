package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountAttribute {
  
	
  @Test (invocationCount = 0) //This method will not be invoked/executed
  public void login()
  {
	Reporter.log("This is Login Method", false);
  }
  
  @Test (invocationCount = 1) // This method will be invoked/executed 1 time 
  public void register()
  {
	  Reporter.log("This is register method", true);
  }
  
  @Test (invocationCount = 2) // This method will be invoked/executed 2 times
  public void addToCart()
  {
	  Reporter.log("This is Add To Cart Method", true);
  }
}
