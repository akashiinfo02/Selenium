package seleniumm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demounit1 {
	
	WebDriver driver;
	String url ="https://www.facebook.com/";
	
	
	
	

	@Before
	public void setUp() throws Exception {}
	System.setProperty(" WebDriver.chrome.driver",c:\Users\Public\Public\Desktop);
	driver =    new chromeDriver;
	driver.get(url);

	@After
	public void tearDown() throws Exception {}
	driver.close();

	@Test
	public void test(){
	
		//id
		driver.findElement(By.id("email")).sendkeys("donhere");
		
		//name
		driver.findElement(By.name("pass")).sendkeys("don@123");
		
	//passowrd
	driver.findElement(By.id(id="u_0_d_st")).sendkeys("Login").click();
	
	//logout
	driver.findElememnt(By.id("inlogout")).click();
		
		
		
		
	}

}
