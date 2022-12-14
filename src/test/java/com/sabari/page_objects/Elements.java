package com.sabari.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.login;

public class Elements extends login {

	private WebElement textBox;

	@Test(priority=0)
	public void clickOnElements() throws InterruptedException {

		System.out.println("***");
		//Thread.sleep(3000);
		WebElement elementsTab = driver.findElement(By.xpath("//h5[.= 'Elements']"));
		System.out.println(elementsTab.isDisplayed());
		
		scrollToElement(elementsTab);
		elementsTab.click();
		System.out.println("++++++");
	}

	@Test(priority=1)
	public void clickOnTextBox() {

		textBox = driver.findElement(By.xpath("//span[.='Text Box']"));
		textBox.click();

	}

}
