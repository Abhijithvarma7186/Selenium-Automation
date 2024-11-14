package day1;

import org.testng.annotations.Test;

public class TC02 extends BaseTest {

    @Test
    public void test() {
        System.out.println("Hello World");
        driver.get("http://www.amazon.com");
        System.out.println(driver.getTitle());
    }
}
