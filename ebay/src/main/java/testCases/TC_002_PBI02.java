package testCases;

import org.testng.annotations.Test;

import pages.Homepage;
import seleniumBase.ProjectSpecifiedMethods;

public class TC_002_PBI02 extends ProjectSpecifiedMethods{
	
	@Test
	public void FirstPriceResult() {
		
	new Homepage().enterTextInSearchBox().clickSearch().ClickFirstResult().getprice();
		
	}

}
