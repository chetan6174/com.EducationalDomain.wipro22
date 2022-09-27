package com.EducationalDomain.Scripts;

import org.testng.annotations.Test;

import com.EducationalDomain.Wipro.PomPage.LoginPage;
import com.EducationalDomain.Wipro.genericLib.FileUtilies;

public class Testcase2 extends FileUtilies {
	
	@Test(dataProvider="readExceldata")
	public void tc2(String name,String mail,String sub,String msg) throws InterruptedException {
		test=reports.createTest("tc2");
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(5000);
		
	}
	

}
