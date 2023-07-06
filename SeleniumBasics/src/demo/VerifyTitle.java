package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	
	public static void main(String[] args) {
	// 1) open the Browser
	ChromeDriver driver = new ChromeDriver(); //class object = new class()
	
	// 2) navigate to application
	//object.method()
	driver.get("https://facebook.com");
	
	// 3) Verify the visitor on the page sees the title - 'Facebook - Log in or sign up'
	String expectedTitle = "Facebook – log in or sign up";
	String actualTitle = driver.getTitle();
	
	System.out.println(expectedTitle);
	System.out.println(actualTitle);
	
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("Test Case Passed");
		
	}
	
	else {
		System.out.println("Test Case Failed");
	}
	
	// 4) Close the browser
	driver.quit();
	}
}


