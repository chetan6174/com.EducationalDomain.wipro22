package com.EducationalDomain.Wipro.PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(xpath="//a[text()=' GEARS ']")
private WebElement gearsbtn;

@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
private WebElement skillrarydemoapp;

@FindBy(name="q")
private WebElement coursenametb;

@FindBy(xpath="//input[@value='go']")
private WebElement gobtn;

public WebElement getCoursenametb() {
	return coursenametb;
}

public WebElement getGobtn() {
	return gobtn;
}

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public SkilraryDemoLoginPage demoApp(WebDriver driver) {
	gearsbtn.click();
	skillrarydemoapp.click();
	return new SkilraryDemoLoginPage(driver);
}

public WebElement getGearsbtn() {
	return gearsbtn;
}

public WebElement getSkillrarydemoapp() {
	return skillrarydemoapp;
}



}
