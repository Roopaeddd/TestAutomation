package testcase;



import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;


public class MyfirstTestFw extends BaseTest {
	@Test
	public static void LoginTest() throws InterruptedException
	{
		System.out.println("successful");
		driver.get("https://fmstage-admin.indiefolio.com/");
		Thread.sleep(2000);
		 driver.findElement(By.name(loc.getProperty("login_name"))).sendKeys("roopa.yadav@team.cliffex.com");
		 Thread.sleep(2000);
        driver.findElement(By.name(loc.getProperty("password_fielde"))).sendKeys("12345678");
        Thread.sleep(2000);
        driver.findElement(By.className(loc.getProperty("sbtn-block"))).click(); 
        Thread.sleep(2000);
        driver.findElement(By.xpath(loc.getProperty("client_xpath"))).click();
        Thread.sleep(4000);
        
	}
	@DataProvider(name ="testdata")
	public Object [][] tData()
	{
		return new Object [][] {
			{}
		
		
		};
}
	
}