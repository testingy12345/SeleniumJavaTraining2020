package testcase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestCase1 {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extend;
	public ExtentTest test;
	
     @BeforeTest()
     public void setReport() {
    	 htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
    	 htmlReporter.config().setEncoding("utf-8");
     }
}
