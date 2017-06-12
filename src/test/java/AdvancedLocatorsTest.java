import org.openqa.selenium.By;

public class AdvancedLocatorsTest {

    //CSS locators

    //a) Selector, which grabs all links and inputs on home page;
    public static final By ALL_LINKS_AND_INPUTS_ON_HOME_PAGE = By.cssSelector("a, input");
    //b) Selector, which grabs all elements on home page;
    public static final By ALL_ELEMENTS_ON_HOME_PAGE = By.cssSelector("*");
    //c) Selector, which grabs all elements near to link for your name on home page;
    public static final By ALL_ELEMENTS_NEAR_USER_NAME = By.cssSelector("#info>div");
    //d) Chapaeva 051 link, do not use "href" attribute of link;
    public static final By CHAPAEVA_51_OFFICE_LINK = By.cssSelector("#officeWidgetContent>ol>li:nth-of-type(2)>a");
    //e) Chapaeva 424 link, do not use "href" attribute of link;
    public static final By CHAPAEVA_424_OFFICE_LINK = By.cssSelector("#officeWidgetContent>ol>li:nth-last-of-type(2)>a");
    //f) Chapaeva 118 link, do not use "href" attribute of link;
    public static final By CHAPAEVA_118_OFFICE_LINK = By.cssSelector("#officeWidgetContent>ol>li:nth-of-type(5)>a");
    //g) Selector, which grabs elements together –
    // Chapaeva 206 link, Chapaeva 212 link, Chapaeva 320 link, Chapaeva 414 link, Chapaeva 424 link;
    public static final By OFFICES_206_212_320_414_424 = By.cssSelector("ol[class='officeShortInfo zebraStyle']>li:nth-child(5n+8)>a");
    //h) Selector, which grabs all inputs on vacation page, except of Start Date input.
    public static final By ALL_INPUTS_EXCEPT_FOR_START_DATE_ON_VACATION_PAGE = By.cssSelector("input:not([name='AddVacationRequestStartDate'])");

    //Xpath locators

    // a) Selector, which grabs all links and inputs on home page;
    public static final By ALL_LINKS_AND_INPUTS_ON_HOME_PAGE_XPATH = By.xpath("//*[a or input]");
    //    b) Selector, which grabs all elements on home page;
    public static final By ALL_ELEMENTS_ON_HOME_PAGE_XPATH = By.xpath("*");
    //    c) Selector, which grabs all elements near to link for your name on home page (see screenshot a);
    public static final By ALL_ELEMENTS_NEAR_USER_NAME_XPATH = By.xpath("//div[@id=\"info\"]/div");
    //    d) Chapaeva 051 link, do not use "href" attribute of link and index;
    public static final By CHAPAEVA_51_OFFICE_LINK_XPATH = By.xpath("//a[contains (text(), \"Chapaeva 051\")]");
    //or //div[@id="officeWidgetContent"]//li[2]/a
    //    e) Chapaeva 424 link, do not use "href" attribute of link and index;
    public static final By CHAPAEVA_424_OFFICE_LINK_XPATH = By.xpath("//a[contains (text(), \"Chapaeva 424\")]");
    //or //div[@id="officeWidgetContent"]//li[last()-1]/a
    //    f) Chapaeva 118 link, do not use "href" attribute of link and index;
    public static final By CHAPAEVA_118_OFFICE_LINK_XPATH = By.xpath("//a[contains (text(), \"Chapaeva 118\")]");
    // or //div[@id="officeWidgetContent"]//li[5]/a
    //    g) Selector, which grads all elements together – Chapaeva 051 link, Chapaeva 105 link, Chapaeva 111 link, Chapaeva 118 link;
    public static final By OFFICES_051_105_111_118 = By.xpath("//*[@id='officeWidgetContent']//li[@class='widgetSelectableRow'][position()>1 and position()<6]/a");
    //    h) Selector, which grabs all elements with css classes;
    public static final By ALL_ELEMENTS_WITH_CSS_CLASSES = By.xpath("//div[@class]");
    //    i) Selector, which grabs all elements with css class, which starts with “widget”;
    public static final By ALL_ELEMENTS_WITH_CSS_CLASS_WIDGET = By.xpath("//*[starts-with(@class, \"widget\")]");
    //    j) Selector, which grabs all elements with id, which ends with “wrapper”;
    public static final By ALL_ELEMENTS_WITH_ID_ENDING_IN_WRAPPER = By.xpath("//*[contains (@id, 'wrapper')]");
    //    k) Selector, which grabs all elements with attribute “data-officeid” (attribute should contain “b” letter);
    public static final By ALL_ELEMENTS_WITH_DATA_OFFICE_ID = By.xpath("//*[contains(@data-officeid,'b')]");
    //    l) Element with text "Management Belarus";
    public static final By MANAGEMENT_BELARUS = By.xpath("//a[@href='#ManagementBelarus']");
    //    m) Update selector "//span[text()="2"]". Updated selector should point to Company link.
    public static final By COMPANY_LINK = By.xpath("//a[text()=' Company']");
}
