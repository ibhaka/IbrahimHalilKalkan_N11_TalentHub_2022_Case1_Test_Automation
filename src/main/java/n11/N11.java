package n11;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import au.com.bytecode.opencsv.CSVWriter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class N11 {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        Log4j.startLog("Test Started");
        driver.get("https://www.n11.com/");
        Log4j.info("Opening Page : " + "https://www.n11.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Log4j.info("Switched to full screen");
        //Thread.sleep(3000);


        //Empty csv file has been added to the project file
        //Copy csv which is in project files and paste your desktop, then change this path
        File file = new File("C:/Users/LENOVO/Desktop/N11.csv");
        FileWriter outputfile = new FileWriter(file);

        // create CSVWriter object filewriter object as parameter
        CSVWriter writer = new CSVWriter(outputfile);




        driver.findElement(By.xpath( "/html/body/div[1]/header/div/div/div[3]/nav/ul/li[2]/a" )).click();
        Log4j.info("Clicked on campaigns");
        //Thread.sleep(1000);


        String moda = driver.findElement(By.xpath("//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/section[2]")).getAttribute("data-category");
        //Thread.sleep(1000);
        driver.findElement(By.xpath( "/html/body/div[1]/div[3]/div/div[2]/div/div[2]/div/div/ul/li[2]" )).click();
        Log4j.info( moda +" clicked");
        //Thread.sleep(2000);
        java.util.List<WebElement> links=driver.findElements(By.tagName("a"));


        // this will display list of all images exist on page
        for(WebElement ele:links){
            if(ele.getAttribute("href") != null && ele.getAttribute("href").contains("https://www.n11.com/promosyon/") ) {
                String[] header = {moda, ele.getAttribute("href") };
                writer.writeNext(header);

            }
        }
        Log4j.info(moda+ " urls added");


        String elektronik = driver.findElement(By.xpath("//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/section[3]")).getAttribute("data-category");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/div/div/ul/li[3]")).click();
        Log4j.info( elektronik +" clicked");
        //Thread.sleep(2000);
        java.util.List<WebElement> links2 =driver.findElements(By.tagName("a"));
        // this will display list of all images exist on page
        for(WebElement ele2:links2){
            if(ele2.getAttribute("href") != null && ele2.getAttribute("href").contains("https://www.n11.com/promosyon/") ) {
                String[] header = {elektronik, ele2.getAttribute("href") };
                writer.writeNext(header);
            }
        }
        Log4j.info(elektronik+" urls added");


        String evyasam = driver.findElement(By.xpath("//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/section[4]")).getAttribute("data-category");
        //Thread.sleep(1000);
        driver.findElement(By.xpath( "//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/div/div/ul/li[4]" )).click();
        Log4j.info( evyasam +" clicked");
        //Thread.sleep(2000);
        java.util.List<WebElement> links3 =driver.findElements(By.tagName("a"));
        for(WebElement ele3:links3){
            if(ele3.getAttribute("href") != null && ele3.getAttribute("href").contains("https://www.n11.com/promosyon/") ) {
                String[] header = {evyasam, ele3.getAttribute("href") };
                writer.writeNext(header);

            }
        }
        Log4j.info(evyasam+" urls added");

        String annebebek = driver.findElement(By.xpath("//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/section[5]")).getAttribute("data-category");
        //Thread.sleep(1000);
        driver.findElement(By.xpath( "//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/div/div/ul/li[5]" )).click();
        Log4j.info( annebebek +" clicked");
        //Thread.sleep(2000);
        java.util.List<WebElement> links4 =driver.findElements(By.tagName("a"));
        for(WebElement ele4:links4){
            if(ele4.getAttribute("href") != null && ele4.getAttribute("href").contains("https://www.n11.com/promosyon/") ) {
                String[] header = {annebebek, ele4.getAttribute("href") };
                writer.writeNext(header);

            }
        }
        Log4j.info(annebebek+" urls added");


        String kozmetik = driver.findElement(By.xpath("//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/section[6]")).getAttribute("data-category");
        //	Thread.sleep(1000);
        driver.findElement(By.xpath( "//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/div/div/ul/li[6]" )).click();
        Log4j.info( kozmetik +" clicked");
        //	Thread.sleep(2000);
        java.util.List<WebElement> links5 =driver.findElements(By.tagName("a"));
        for(WebElement ele5:links5){
            if(ele5.getAttribute("href") != null && ele5.getAttribute("href").contains("https://www.n11.com/promosyon/") ) {
                String[] header = {kozmetik, ele5.getAttribute("href") };
                writer.writeNext(header);

            }
        }
        Log4j.info(kozmetik+" urls added");


        String mucevher = driver.findElement(By.xpath("//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/section[7]")).getAttribute("data-category");
        //	Thread.sleep(1000);
        driver.findElement(By.xpath( "//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/div/div/ul/li[7]" )).click();
        Log4j.info( mucevher +" clicked");
        //	Thread.sleep(2000);
        java.util.List<WebElement> links6 =driver.findElements(By.tagName("a"));
        for(WebElement ele6:links6){
            if(ele6.getAttribute("href") != null && ele6.getAttribute("href").contains("https://www.n11.com/promosyon/") ) {
                String[] header = {mucevher, ele6.getAttribute("href") };
                writer.writeNext(header);

            }
        }
        Log4j.info(mucevher+" urls added");

        String spor = driver.findElement(By.xpath("//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/section[8]")).getAttribute("data-category");
        //Thread.sleep(1000);
        driver.findElement(By.xpath( "//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/div/div/ul/li[8]" )).click();
        Log4j.info( spor +" clicked");
        //Thread.sleep(2000);
        java.util.List<WebElement> links7 =driver.findElements(By.tagName("a"));
        for(WebElement ele7:links7){
            if(ele7.getAttribute("href") != null && ele7.getAttribute("href").contains("https://www.n11.com/promosyon/") ) {
                String[] header = {spor, ele7.getAttribute("href") };
                writer.writeNext(header);

            }
        }
        Log4j.info(spor+" urls added");


        String kitap = driver.findElement(By.xpath("//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/section[9]")).getAttribute("data-category");
        //	Thread.sleep(1000);
        driver.findElement(By.xpath( "//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/div/div/ul/li[9]" )).click();
        Log4j.info( kitap +" clicked");
        //	Thread.sleep(2000);
        java.util.List<WebElement> links8 =driver.findElements(By.tagName("a"));
        for(WebElement ele8:links8){
            if(ele8.getAttribute("href") != null && ele8.getAttribute("href").contains("https://www.n11.com/promosyon/") ) {
                String[] header = {kitap, ele8.getAttribute("href") };
                writer.writeNext(header);

            }
        }
        Log4j.info(kitap+" urls added");


        String tatil = driver.findElement(By.xpath("//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/section[10]")).getAttribute("data-category");
        //	Thread.sleep(1000);
        driver.findElement(By.xpath( "//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/div/div/ul/li[10]" )).click();
        Log4j.info( tatil +" clicked");
        //	Thread.sleep(2000);
        java.util.List<WebElement> links9 =driver.findElements(By.tagName("a"));
        for(WebElement ele9:links9){
            if(ele9.getAttribute("href") != null && ele9.getAttribute("href").contains("https://www.n11.com/promosyon/") ) {
                String[] header = {tatil, ele9.getAttribute("href") };
                writer.writeNext(header);

            }
        }
        Log4j.info(tatil+" urls added");

        String otomativ = driver.findElement(By.xpath("//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/section[11]")).getAttribute("data-category");
        //	Thread.sleep(1000);
        driver.findElement(By.xpath( "//*[@id=\"contentCampaignPromotion\"]/div/div[2]/div/div[2]/div/div/div/ul/li[11]" )).click();
        Log4j.info( otomativ +" clicked");
        //	Thread.sleep(2000);
        java.util.List<WebElement> links10 =driver.findElements(By.tagName("a"));
        for(WebElement ele10:links10){
            if(ele10.getAttribute("href") != null && ele10.getAttribute("href").contains("https://www.n11.com/promosyon/") ) {
                String[] header = {otomativ, ele10.getAttribute("href") };
                writer.writeNext(header);

            }
        }
        Log4j.info(otomativ+" urls added");



        writer.close();
        Log4j.info("URLs exported to CSV file");

        Log4j.endLog("Test Compleated");

    }
}
