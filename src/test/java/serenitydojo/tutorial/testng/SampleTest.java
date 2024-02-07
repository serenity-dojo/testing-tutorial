package serenitydojo.tutorial.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest {

    @BeforeSuite
    void prepareTestData() {
        System.out.println("BEFORE TEST SUITE");
    }

    @AfterSuite
    void cleanup() {
        System.out.println("AFTER TEST SUITE");
    }

    @DataProvider(name = "sums")
    public static Object[][] sums() {
        return new Object[][] {
                {1,2,3},
                {3,5,8},
                {10,20,30}};
    }

    @Test(dataProvider = "sums")
    void shouldAddTwoNumbers(int a, int b, int result) {
        System.out.println("ADDING " + a + " and " + b);
        int sum = a + b;
        assert sum == result;
    }
}



