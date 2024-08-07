package package1;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
public class LaunchApp {
	
public static void main(String[] args) throws Throwable 
	{     
	      
	      System.setProperty("Webdriver.driver.chrome", "chromedriver.exe");
	     
	      WebDriver driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.get("https://www.fitpeo.com/");
	      driver.navigate().to("https://fitpeo.com/revenue-calculator");
	      JavascriptExecutor js =  (JavascriptExecutor)driver;
	      js.executeScript("window.scrollBy(0,500)");
	      Actions ac = new Actions(driver);
	      
	    WebElement element =  driver.findElement(By.xpath("//span[@class='MuiSlider-rail css-3ndvyc']"));
	    ac.dragAndDropBy(element, -700, 0).perform();
	     ac.dragAndDropBy(element, 1, 0).perform();
	     ac.dragAndDropBy(element, -27, 0).perform();
	     driver.findElement(By.id(":R57alklff9da:")).clear();
	     Thread.sleep(2000);
	     driver.findElement(By.id(":R57alklff9da:")).sendKeys("560");
	      String Expected = "560";
	      String Actucal = driver.findElement(By.xpath("//input[@aria-valuenow='560']")).getAttribute("value");
	      System.out.println(Actucal);
	      if(Expected.equalsIgnoreCase(Actucal)){
	    	 System.out.println("value is matching"+"  "+Expected+"  "+Actucal); 
	      }
	      else {
	    	  System.out.println("value is not matching"+"  "+Expected+"  "+Actucal);  
	      }
	      driver.findElement(By.xpath("//div[@class='MuiBox-root css-rfiegf']//div[1]//label[1]//span[1]//input[1]")).click();
	      driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	      driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
	      driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
	      String Expectedvalue = " $110700";
	      String Actucalvalue = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 inter css-hocx5c'][normalize-space()='$75600'])[1]")).getText();
	      System.out.println(Actucalvalue);
	      if(Expectedvalue.equalsIgnoreCase(Actucalvalue)){
	    	 System.out.println("value is matching"+"  "+Expectedvalue+"  "+Actucalvalue); 
	      }
	      else {
	    	  System.out.println("value is not matching"+"  "+Expectedvalue+"  "+Actucalvalue);  
	      }
	      
	      
	      
	      
	      
	      
	}
	      
	}              