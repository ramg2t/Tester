package Pack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private static WebDriver driver = null;
  @Test
  public void f() throws IOException {
	  driver.findElement(By.id("photo")).click();
	  Runtime.getRuntime().exec("D:\\autoit\\sample1.exe");
  }
  @BeforeTest
  public void f1()
  {
	  driver = new FirefoxDriver();
	  
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    driver.get("http://www.toolsqa.com/automation-practice-form");

  }
}
