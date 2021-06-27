import org.testng.annotations.Test;

import java.io.IOException;

public class ContactMeTest extends AbstractTestCase {

    @Test()
    public void fillContactForm() throws InterruptedException, IOException {
        homePage.open();
        homePage.clickAgreeToAllButton();
        homePage.selectACarType();
        homePage.scrollToButton();
        homePage.clickMoreDetailsButton();
        homePage.clickContactMeButton();
        homePage.setFirstName(data.get("firstname").toString());
        homePage.setLastName(data.get("lastname").toString());
        homePage.setMailAdress(data.get("email").toString());
        homePage.setMobilePhone(data.get("phone").toString());
        homePage.clickdataProtectionPolicy();
        homePage.checkProceedButtonIsActive();

    }
}
