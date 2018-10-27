/* 
 * Created on Oct 27, 2018 by mkgowri
 *
 * Copyright (c) 2018 NPN Training. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of NPN
 * Training ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with NPN Training.
 *
 */
package jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

	WebDriver driver;
	@Test
	public void firstTestCase() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/mkgowri/Desktop/today/htmls/waits/implicitwaits/example1/Wait_Demo1.html");

		WebElement num1 = driver.findElement(By.id("buggy1"));

		num1.sendKeys("abc");

		WebElement num2 = driver.findElement(By.id("buggy2"));

		num2.sendKeys("abc");

		WebElement num3 = driver.findElement(By.id("buggy3"));

		num3.sendKeys("abc");
		

		
	}
	
	
	
	
}
