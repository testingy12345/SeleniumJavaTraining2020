package DataDriven;

import junit.framework.Test;

public class DDTExcel {
	WebDriver driver;
	
	@Test(dataProvider="testData")
	
	public void DemoProject(String username,String password)
	{
		System.setProperty("","");
		driver=new FireFoxDriver();
	}

}
