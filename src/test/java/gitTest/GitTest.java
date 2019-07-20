package gitTest;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class GitTest {
@Test
	public void loginTest() throws IOException{
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.bing.com/");
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\user\\Desktop\\Vishnu Selenium Workspace\\gitHubTest\\Screenshot"));//file opject(src) to be moved to physical file for that we use fileutils, copyfile is to say what it should

	}
}
