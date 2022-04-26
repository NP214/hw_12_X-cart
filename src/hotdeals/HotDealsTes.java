package hotdeals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class HotDealsTes extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void openBrowser() {
        setUpBrowser(baseUrl);
    }

    @Test
    public void method1() {
//    1.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
//		1.2 Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul/li[1]/a"));
//		1.3 Verify the text “Sale”
        verifyTextWithAssert("Sale", By.xpath("//h1[@id='page-title']"), "text is verified");
//      1.4 Mouse hover on “Sort By”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        // select “Name A-Z”
        mouseHoverAndClick(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[5]/a"));
//      1.5 Verify that the product arrange alphabetically
        verifyTextWithAssert("Name A - Z", By.xpath("//span[@class='sort-by-value']"), "Verify product arrange alphabetically");
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() {
//    2.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
//		2.2 Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul/li[1]/a"));
//		2.3 Verify the text “Sale”
        verifyTextWithAssert("Sale", By.xpath("//h1[@id='page-title']"), "text is verified");
//      2.4 Mouse hover on “Sort By”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        // select “Price Low-High”
        mouseHoverAndClick(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[3]/a"));
//        2.5 Verify that the product’s price arrange Low to High
        verifyTextWithAssert("Price Low - High", By.xpath("//span[@class='sort-by-value']"), "Verify product price low to high");
    }

    @Test
    public void verifySaleProductsArrangeByRates() {
        //    3.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
//		3.2 Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul/li[1]/a"));
//		3.3 Verify the text “Sale”
        verifyTextWithAssert("Sale", By.xpath("//h1[@id='page-title']"), "text is verified");
//      3.4 Mouse hover on “Sort By”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        // select “Rates”
        mouseHoverAndClick(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[7]/a"));

//        3.5 Verify that the product’s arrange Rates
        verifyTextWithAssert("Rates", By.xpath("//span[@class='sort-by-value']"), "Verify product arranged in Rates");
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
//        1.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
//        1.2 Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul/li[2]/a"));
//        1.3 Verify the text “Bestsellers”
        verifyTextWithAssert("Bestsellers", By.linkText("Bestsellers"), "text is verified");
//        1.4 Mouse hover on “Sort By”
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
        // select “Name Z-A”
        mouseHoverAndClick(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[7]/a"));

//        1.5 Verify that the product arrange by Z to A
verifyTextWithAssert("Name Z - A", By.xpath("//span[@class='sort-by-value']"), "Verify product ordered in Name Z - A");
    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() {
//        2.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
//        2.2 Mouse hover on the “Bestsellers” link and click
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul/li[2]/a"));
//        2.3 Verify the text “Bestsellers”
        verifyTextWithAssert("Bestsellers", By.linkText("Bestsellers"), "text is verified");
//        2.4 Mouse hover on “Sort By” and
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
//        select “Price High-Low”
        mouseHoverAndClick(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[3]/a"));
//        2.5 Verify that the product’s price arrange High to Low
       verifyTextWithAssert("Price High - Low", By.xpath("//span[@class='sort-by-value']"), "Verify product ordered in Price High - Low");
    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() {
//        3.1 Mouse hover on the “Hot deals” link
        mouseHoverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
//        3.2 Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul/li[2]/a"));
//        3.3 Verify the text “Bestsellers”
        verifyTextWithAssert("Bestsellers", By.linkText("Bestsellers"), "text is verified");
//        3.4 Mouse hover on “Sort By” and
        mouseHoverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
//        select “Rates”
        mouseHoverAndClick(By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[7]/a"));
//        3.5 Verify that the product’s arrange Rates
        verifyTextWithAssert("Rates", By.xpath("//span[@class='sort-by-value']"), "Verify product ordered in Rates ");
    }
}
