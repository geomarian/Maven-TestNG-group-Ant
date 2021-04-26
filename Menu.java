package com.WebApp.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;


public class Menu {
 
	@Test(enabled=false)
	public void testLink() throws InterruptedException{
		
		
		HomePage.getDriver().findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(3000);
		System.out.println("clicked on computer");
		WebElement compList =  HomePage.getDriver().findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		compList.click();
	}
	
	
	/* public void clickFilter(){
		WebElement productFilter = HomePage.getDriver().findElement(By.tagName("select"));
		productFilter.click();
		
		if(productFilter.isEnabled()){
			System.out.println("It is clicked");
		} else{
			
			System.out.println(" It is not clicked");
		}
		String[] sortBy = {"Position","Name: A to Z","Name: Z to A","Price: Low to High","Price: High to Low","Created on"};
		String[] displayPerPage = {"3","6","9"};
		for(int i=0; i < 6; i++) 
		{
			for (int j=0; j<3;j++)
			{
				HomePage.getDriver().findElement(By.id("products-orderby")).sendKeys(sortBy[i]);
				HomePage.getDriver().findElement(By.id("products-pagesize")).sendKeys(displayPerPage[j]);
				
			}
		}
	}    */
	
	@Test(enabled=false)
	
	public void clickFilter() throws InterruptedException{
		
		System.out.println( " on way");
		WebElement productFilter = HomePage.getDriver().findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/select[1]"));
		productFilter.click();
		Thread.sleep(1000);
		//throw new SkipException("Skipped Test 2");
		System.out.println("clicked on filter");
		Select selectSortBy = new Select(HomePage.getDriver().findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/select[1]")));
		List<WebElement> list1= selectSortBy.getOptions();
		Thread.sleep(6000);
		Select selectDisplay = new Select(HomePage.getDriver().findElement(By.cssSelector("#products-pagesize")));
		List<WebElement> list2= selectDisplay.getOptions();
		Thread.sleep(6000);
		
			for(WebElement dropdown1:list1)
			{
				for(WebElement dropdown2:list2)
				{
					Thread.sleep(3000);
					System.out.println("inside filter");
					HomePage.getDriver().findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/select[1]")).sendKeys(dropdown1.getText());
					Thread.sleep(3000);
					System.out.println("All product filter");
					Thread.sleep(3000);
					HomePage.getDriver().findElement(By.cssSelector("#products-pagesize")).sendKeys(dropdown2.getText());
					Thread.sleep(3000);
				
				}			
				}
			
		}
	
		
	
	}
	
	

