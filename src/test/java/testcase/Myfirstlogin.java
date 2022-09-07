package testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myfirstlogin {

	public static void main(String[] args) throws InterruptedException {
   
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://fmstage-admin.indiefolio.com/");
		 driver.findElement(By.name("loginEmail")).sendKeys("roopa.yadav@team.cliffex.com");
         driver.findElement(By.name("loginPass")).sendKeys("12345678");
         driver.findElement(By.className("btn-block")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[@class= 'nav-link' and text()='Clients']")).click();
          Thread.sleep(2000);
          driver.findElement(By.name("statusEmail")).sendKeys("Achieve@gmail.com");
          Thread.sleep(2000);
           driver.findElement(By.className("btn-primary")).click();
         Thread.sleep(5000);
          driver.findElement(By.name("signupFirstName")).sendKeys("Tfsgdddesaggkfdtyingrop");
           Thread.sleep(5000);    
           driver.findElement(By.name("signupLastName")).sendKeys("QQdfgqdqydagqqq");
          Thread.sleep(5000); 
           driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div/div/form/div[1]/div[4]/div/div/input")).sendKeys("9517292963");
           Thread.sleep(5000);  
            driver.findElement(By.name("signupPass")).sendKeys("Te123456");
          Thread.sleep(5000);
             driver.findElement(By.className("btn-block")).click();
            
         
	}

}
