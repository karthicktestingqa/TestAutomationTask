package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumBase.ProjectSpecifiedMethods;
import utils.ConstantData;

public class Homepage extends ProjectSpecifiedMethods{
	
	public Homepage enterTextInSearchBox() {
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		element.clear();
		element.sendKeys(ConstantData.SearchTextData);
		return new Homepage();
	}
public Homepage ClickFirstResult() {
	WebElement element = driver.findElement(By.xpath("//div[@class='s-item__image-wrapper']//following::img"));
	element.click();
	return new Homepage();
}
public Homepage clickSearch() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	return new Homepage();
}
public Homepage getprice() {
	WebElement element = driver.findElement(By.xpath(" //span[@itemprop='price']"));
	
System.out.println("First Resultitem price =" + element.getText());
	return new Homepage();
}

}
