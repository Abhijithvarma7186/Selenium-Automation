package day1;

import org.testng.annotations.Test;

public class TC01 extends BaseTest {

    @Test
    public void test() {
        System.out.println("Hello World");
        driver.get("http://www.google.com");
    }
}
