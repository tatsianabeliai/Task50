import org.openqa.selenium.By;

public class AdvancedLocatorsTest {

    //CSS locators

    //a) Selector, which grabs all links and inputs on home page;
    private By allLinksAndInputsOnHomePage = By.cssSelector("a, input");
    //b) Selector, which grabs all elements on home page;
    private By allElementsOnHomePage = By.cssSelector("*");
    //c) Selector, which grabs all elements near to link for your name on home page;
    private By allElementsNearUserName = By.cssSelector("#info>div");
    //d) Chapaeva 051 link, do not use "href" attribute of link;
    private By chapaeva51OfficeLink = By.cssSelector("#officeWidgetContent>ol>li:nth-of-type(2)>a");
    //e) Chapaeva 424 link, do not use "href" attribute of link;
    private By chapaeva424OfficeLink = By.cssSelector("#officeWidgetContent>ol>li:nth-last-of-type(2)>a");
    //f) Chapaeva 118 link, do not use "href" attribute of link;
    private By chapaeva118OfficeLink = By.cssSelector("#officeWidgetContent>ol>li:nth-of-type(5)>a");
    //g) Selector, which grabs elements together –
    // Chapaeva 206 link, Chapaeva 212 link, Chapaeva 320 link, Chapaeva 414 link, Chapaeva 424 link;
    private By offices206_212_320_414_424 = By.cssSelector("ol[class='officeShortInfo zebraStyle']>li:nth-child(5n+8)>a");
    //h) Selector, which grabs all inputs on vacation page, except of Start Date input.
    private By allInputsExceptForStartDateOnVacationPage = By.cssSelector("input:not([name='AddVacationRequestStartDate'])");

    //Xpath locators

    // a) Selector, which grabs all links and inputs on home page;
    private By allLinksAndInputsOnHomePageXpath = By.xpath("//*[a or input]");
    //    b) Selector, which grabs all elements on home page;
    private By allElementsOnHomePageXpath = By.xpath("*");
    //    c) Selector, which grabs all elements near to link for your name on home page (see screenshot a);
    private By allElementsNearUserNameXpath = By.xpath("//div[@id=\"info\"]/div");
    //    d) Chapaeva 051 link, do not use "href" attribute of link and index;
    private By chapaeva51OfficeLinkXpath = By.xpath("//a[contains (text(), \"Chapaeva 051\")]");
    //or //div[@id="officeWidgetContent"]//li[2]/a
    //    e) Chapaeva 424 link, do not use "href" attribute of link and index;
    private By chapaeva424OfficeLinkXpath = By.xpath("//a[contains (text(), \"Chapaeva 424\")]");
    //or //div[@id="officeWidgetContent"]//li[last()-1]/a
    //    f) Chapaeva 118 link, do not use "href" attribute of link and index;
    private By chapaeva118OfficeLinkXpath = By.xpath("//a[contains (text(), \"Chapaeva 118\")]");
    // or //div[@id="officeWidgetContent"]//li[5]/a
    //    g) Selector, which grads all elements together – Chapaeva 051 link, Chapaeva 105 link, Chapaeva 111 link, Chapaeva 118 link;
    private By offices_051_105_111_118 = By.xpath("//*[@id='officeWidgetContent']//li[@class='widgetSelectableRow'][position()>1 and position()<6]/a");
    //    h) Selector, which grabs all elements with css classes;
    private By allElementsWithCSSClasses = By.xpath("//div[@class]");
    //    i) Selector, which grabs all elements with css class, which starts with “widget”;
    private By allElementsWithCSSClassWidget = By.xpath("//*[starts-with(@class, \"widget\")]");
    //    j) Selector, which grabs all elements with id, which ends with “wrapper”;
    private By allelementsWithIdEndingInWrapper = By.xpath("//*[contains (@id, 'wrapper')]");
    //    k) Selector, which grabs all elements with attribute “data-officeid” (attribute should contain “b” letter);
    private By allElementsWithDataOfficeID = By.xpath("//*[contains(@data-officeid,'b')]");
    //    l) Element with text "Management Belarus";
    private By managementBelarus = By.xpath("//a[@href='#ManagementBelarus']");
    //    m) Update selector "//span[text()="2"]". Updated selector should point to Company link.
    private By CompanyLink = By.xpath("//a[text()=' Company']");
}
