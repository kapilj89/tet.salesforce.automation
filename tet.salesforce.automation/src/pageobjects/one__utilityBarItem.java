package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="one__utilityBarItem"                                
               , summary=""
               , connection="Admin"
               , object=""
     )             
public class one__utilityBarItem {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Account Search']")
	public WebElement accountSearch;
	
}
