package com.EducationalDomain.Scripts;

import org.testng.annotations.Test;

import com.EducationalDomain.Wipro.PomPage.AddtocartPage;
import com.EducationalDomain.Wipro.PomPage.LoginPage;
import com.EducationalDomain.Wipro.PomPage.SkilraryDemoLoginPage;
import com.EducationalDomain.Wipro.genericLib.BaseClass;

public class Testcase1 extends BaseClass {
	@Test
	public void testcase1() {
		test=reports.createTest("Testcase1");
		LoginPage l=new LoginPage(driver);
		SkilraryDemoLoginPage hp = l.demoApp(driver);
		utilies.switchTabs(driver);
		utilies.mouseHover(driver,hp.getCoursebtn());
		AddtocartPage cart = hp.couse(driver);
        utilies.doubleclick(driver,cart.getAddbtn());
        cart.getAddtocartbtn().click();
        utilies.alertPopupok(driver);
        
		
	}
	

}
