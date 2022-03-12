package org.test.screenshot;

import java.io.IOException;
import java.util.Date;

import org.test.base.BaseClassJava;
import org.test.registrationpage.Registration;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot extends BaseClassJava {
	@BeforeClass
	private void beforeClass() {
		chromeLaunch();
		impWait(10);
	}

	@AfterClass
	private void afterClass() {
		driver.quit();
	}

	@BeforeMethod
	private void before() {
		Date d = new Date();
		System.out.println("Before Time...................." + d);
	}

	@AfterMethod
	private void afterMethod(ITestResult s) throws IOException {
		System.out.println("AFTER METHOD");
		int ts = s.getStatus();
		if (ts == 1) {
			String name = s.getName();
			Screenshot("Facebook" + name);

		}
	}

	@Test
	private void test1() throws InterruptedException {
		chromeLaunch();

		urlLaunch("https:www.facebook.com/");
		Registration r = new Registration();
		Click(r.getCreate());
		Thread.sleep(5000);
		sendkeys(r.getUser(), "Pragathi");
		sendkeys(r.getUser1(), "S");

	}
}