package com.WebApp.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class quickLinks {

	@Test(priority=3, groups={"sanity"})
	public void Electronics() throws InterruptedException{
		WebElement electro = HomePage.getDriver().findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[2]/a[1]"));
		
		if(electro.isSelected()){
			System.out.println("electro is clicked");
		} else{
			electro.click();
			System.out.println("No Link for Electronics found.");
		} 
		
	/*	WebElement cellPhone = HomePage.getDriver().findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
		cellPhone.click();
		String expectedText = "HTC One M8 Android L 5.0 Lollipop";
		String actualText= cellPhone.getText();

		if(actualText.equals(expectedText)){
			System.out.println("Yes"+ actualText);
		} else
		{
			System.out.println("NOPE" + actualText); 
		}

*/
	}
	
	@Test(priority=4,groups={"performance","sanity"})
	public void Apparel(){
		WebElement Apparells = HomePage.getDriver().findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[3]/a[1]"));
		Apparells.click();
	}
		
		@Test(priority=5,groups={"regression"})
		public void digital(){
			WebElement DD = HomePage.getDriver().findElement((By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[4]/a[1]")));
			DD.click();
		}
		
		@Test(priority=6)
		public void Books(){
			WebElement book = HomePage.getDriver().findElement((By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[5]/a[1]")));
			book.click();
	}
	
}

