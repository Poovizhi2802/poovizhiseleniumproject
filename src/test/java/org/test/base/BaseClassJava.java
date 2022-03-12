package org.test.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassJava {
	public static WebDriver driver;
	
	   
	   public static WebDriver chromeLaunch() {
		   WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		return driver;
		   
	   }
	   
		
	public static WebDriver edgeLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new EdgeDriver();
		return driver;
			
	}
	public static void browserLaunched(String browsername) {
		if(browsername.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		}else if (browsername.equalsIgnoreCase("edge")) {
		 WebDriverManager.chromedriver().setup();
		 driver = new EdgeDriver();
		}
		
	}
	//------------------url------------
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void impWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static void sendkeys(WebElement e,String data) {
		e.sendKeys(data);

	}
	
	//---------------------click------------------------
	public static void Click(WebElement e) {
		e.click();
	}
	//--------------------getCurrenturl---------------
	public static String getcurrenturl() {
		String cur = driver.getCurrentUrl();
		return cur;
		
			}
		
		
	//-------------------------getAttribute----------------
	public static String getAttribute(WebElement e) {
		String att =e.getAttribute("value");
		return att;	
	}
	//------------------------gettittle---------------------------
	public static String getTittle() {
		String tittle =driver.getTitle();
		return tittle;		
	}
	//---------------------------Actions---------------------------
	//-----------------move to Element-----------------------------
	public static void movetoElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
	//----------------------dragandDrop---------------
	public static void dragAndDrop(WebElement from,WebElement to) {
		Actions a=new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}
	//--------------------contextclick-------------------
	public static void contextClick(WebElement e) {
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
	}
	//---------------------doubleclick-------------
	public static void doubleClick(WebElement e) {
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
	}
	//--------------------clickandhold---------------------
	public static void actionclickAndHold(WebElement from,WebElement to) {
		Actions a=new Actions(driver);
		a.clickAndHold(from).release(to).perform();
	}
	//---------------------clear------------------
	public static void clear(WebElement e) {
		e.clear();
	}
	//-------------------------ActionClick----------------
	public static void actionClick(WebElement e) {
		Actions a=new Actions(driver);
		a.click(e).perform();
	}
	//--------------------------click-------------------
	public static void clickact() {
		Actions a = new Actions(driver);
		a.click().perform();
	}
	//-----------------------select-------------------------
	public static void selectByIndex(WebElement e,int index) {
		Select s= new Select(e);
		s.selectByIndex(index);
	}
	
	//-------------frame------------
	public static void Switctoframes(int index) {
		driver.switchTo().frame(index);
	}
	
	//simple
	public static void simple() {
		Alert alert = driver.switchTo().alert();
	}
	//--------------------switchcase---------------------
	public static void browserLaunch(String browsername) {
		switch(browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			default:
				System.out.println("Invalid Browser");
		}
	}
	
	
	//screenshot
	public static void Screenshot(String Location) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("Location");
		FileUtils.copyFile(from, to);
		
	}
	//--------------------------javascript-------------------
	//-------------------txtusername----------------
	public static void txtusername() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtuser = driver.findElement(By.name("name"));
		js.executeScript("arguments.setAttribute()",txtuser);
	}
	//----------------------txtpass--------------
	public static void txtpass() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtpass = driver.findElement(By.id("pass"));
		js.executeScript("arguments.setAttribute()",txtpass);
	}

	//--------------------------click---------------------
	public static void btnclick(WebElement btnlogin) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments.click()",btnlogin);
		
	}
	//-----------------getAttribute-------------
	public static String GetAttribute(WebElement txtuser) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object s=js.executeScript("return arguments.getAttribute('value'),txtuser");
		String d=s.toString();
		return d;
		
	}
	//----------------------scrolDown-----------------
	public static void scrollDown(WebElement d) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments.scrollIndoView(true)",d);
	
	}
	//-------------------scrolup---------------------
	public static void scrollup(WebElement d) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments.scrollIndoView(false)",d);
	}
	
	//----------------------quit-------------------
	public static void quit() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.quit();
	

	}

		
		 }

	


