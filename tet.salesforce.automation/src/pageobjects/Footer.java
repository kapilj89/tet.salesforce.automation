package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Footer"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class Footer {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Account Search']")
	public WebElement accountSearch;
			
}
