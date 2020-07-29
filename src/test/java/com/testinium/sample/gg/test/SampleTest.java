package com.testinium.sample.gg.test;

import com.testinium.sample.gg.test.base.BaseTest;
import com.testinium.sample.gg.test.page.HomePage;
import com.testinium.sample.gg.test.page.LoginPage;
import org.junit.Test;

public class SampleTest extends BaseTest {

    @Test
    public void sampleTest(){
        new HomePage(driver).search("samsung");
        new LoginPage(driver).login("melih","123456");
    }

    //gittigidiyor
    //Hepsiburada için search, login işlemlerini page lere ayirarak yapiniz
}
