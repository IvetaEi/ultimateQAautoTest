import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ultimateQA {

//    WebDriver _globalDriver;
//        @BeforeTest
//    public void  SetupWebDriver() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        options.addArguments("--disable-notifications");
//        _globalDriver = new ChromeDriver();
//        _globalDriver.get("https://www.audimas.lt/");
//        _globalDriver.manage().window().maximize();
//        snoozeUntilXpath("");
//        _globalDriver.findElement(By.xpath(""));
//    }
    @Test
    public void ultimateQA () {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/complicated-page");

        driver.findElement(By.id("et_pb_contact_name_0")).sendKeys("Jess");
        driver.findElement(By.id("et_pb_contact_email_0")).sendKeys("12345@gmail.com");
        driver.findElement(By.id("et_pb_contact_message_0")).sendKeys("niceee");

        WebElement Numbers = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[7]/div[2]/div[1]/div[2]/form/div/div"));
        String nr = Numbers.getText();

        int stringLength = nr.length();
        if (stringLength >= 7) {
            var firstNr = nr.charAt(0);
            var secondNr = nr.charAt(6);

            try {
                int frstNrInt = Integer.parseInt(String.valueOf(firstNr));
                int scdNrInt = Integer.parseInt(String.valueOf(secondNr));
                int amount = frstNrInt + scdNrInt;
                String amountStr = String.valueOf(amount);
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));  // Explicit Wait (adjust timeout as needed)
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[7]/div[2]/div[1]/div[2]/form/div/div/p/input")));  // Improved XPath for input field
                driver.findElement(By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div/div[7]/div[2]/div[1]/div[2]/form/div/div/p/input")).sendKeys(amountStr);

                // Rest of your code using amountStr
            } catch (NumberFormatException e) {
                // Handle the exception
                System.err.println("Error parsing numbers from string nr: " + nr);
                // You can also log the exception or take other corrective actions
            }
        } else {
            // Handle scenario where the string length is less than 7
        }


        }


//        String str = amount;
//        String st=str.replaceAll("[^0-9]", "");
//        System.out.println(st);



//    ChromeOptions options = new ChromeOptions();
//options.addArguments("--start-maximized");
//options.addArguments("--disable-notifications");
//    _globalDriver = new ChromeDriver(options);
//_globalDriver.get("https://audimas.lt/");
//_globalDriver.manage().window().maximize();
//    snoozeUntilClickable(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();   // laukiam kol ismes pirmaji cookie
//    asyncClick(_globalDriver, By.xpath("/html/body/div[8]/div/div/div/button")).thenAccept(result -> {  // antros reklamos isjungimas
//        System.out.println("Async click performed: " + result);
//
//     
//        public static CompletableFuture<Boolean> asyncClick(WebDriver driver, By locator) {
//            return CompletableFuture.supplyAsync(() -> {
//                try {
//                    WebElement element = new WebDriverWait(driver, Duration.ofSeconds(30))
//                            .until(ExpectedConditions.elementToBeClickable(locator));
//                    element.click();
//
//                    return true;
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    return false;
//                }
//            });

//        public static void main(String[] args)
//        {
//            List<Integer> list = new ArrayList<Integer>();
//            int b;
//            System.out.println("Enter the number");
//            InputStreamReader inp = new InputStreamReader(System.in);
//            BufferedReader bnp = new BufferedReader(inp);
//            list.add(Integer.parseInt(bnp.readLine()));
//            for(int i=0;i<list.size();i++)
//            {
//                b+= list[i];
//            }
//            System.out.println("The answer is" + b);
//        }


//        try {
//            TimeUnit.SECONDS.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        NumberFormat format = NumberFormat.getCurrencyInstance();
//        Number number = format.parse(Numbers.getText());
//        System.out.println(number.toString());


//        String ArrArgs[] = amount.split("");
//        for (int i=2;i<ArrArgs.length;i++){
//            if (ArrArgs.equals("+")){
//                break;
//            }else{
//                stramount = ""+stramount+ArrArgs[i];
//                System.out.println("Adding "+ArrArgs[i]);
//            }






/*
    public static CompletableFuture<Boolean> asyncClick(WebDriver driver, By locator) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                WebElement element = new WebDriverWait(driver, 10)
                        .until(ExpectedConditions.elementToBeClickable(locator));
                element.click();

                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        });
    }
*/
    }



















