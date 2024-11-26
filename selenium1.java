package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selenium1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		String act_title = driver.getTitle();
		if(act_title.equals("demo"))
		{
			System.out.println("*test case pass*");
		}

		else
		{
			System.out.println("*test case fail*");	
		}
		driver.findElement(By.linkText("demo")).click();
		
		driver.findElement(By.linkText("Features")).click();
		driver.findElement(By.linkText("Customer")).click();
		driver.close();
		driver.quit();
    
		
		
		
		// TODO Auto-generated method stub

	}

	private static void ELSE() {
		// TODO Auto-generated method stub
		
	}

}
