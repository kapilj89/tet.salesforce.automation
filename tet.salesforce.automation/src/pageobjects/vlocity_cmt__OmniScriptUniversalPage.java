package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Vlocity_cmt__ Omni Script Universal Page"                                
               , summary=""
               , page="OmniScriptUniversalPage"
               , namespacePrefix="vlocity_cmt"
               , object=""
               , connection="Admin"
     )             
public class vlocity_cmt__OmniScriptUniversalPage {

	@TextType()
	@FindBy(xpath = "//b[contains(text(),'InstallmentLimitAvailable')]")
	public WebElement InstallmentLimitAvailable;

	@TextType()
	@FindBy(xpath = "//div[@id='TaskYesAction']/p")
	public WebElement CaptureConsent;

	/*
	 * @TextType()
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='vlc-control-wrapper']/input[@id='AccountNumber']") public
	 * WebElement aCCOUNTNUMBER;
	 */
	@TextType()
	@FindBy(xpath = "//input[@id='AccountNumber']")
	public WebElement accountNumber;

	@TextType()
	@FindBy(xpath = "//div[@id='SearchAccount_nextBtn']/p")
	public WebElement SearchAccount;

	@TextType()
	@FindBy(xpath = "//label[@title='View Account']/div")
	public WebElement Account;

}
