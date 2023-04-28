package org.example.services;
//
//import org.example.calculaterservice.CalculaterService;
//import org.junit.*;
//import org.junit.jupiter.api.Test;
//
//
//import java.util.Date;
//
//public class CalculaterServiceTest {
//
//    Integer counter = 0;
//
//    @Test(timeout = 2000)
//    //Timeout fails the particular test case of it takes more than 2 seconds
//    public void addTwoNumbersTest() throws InterruptedException {
//
//        for(int i=0;i<=10;i++){
//            counter=i++;
//        }
//        Thread.sleep(3000);
//        System.out.println("Test case for addTwoNumbers");
//        Integer actualResult = CalculaterService.addTwoNumbers(12, 10);
//        System.out.println("Counter in first test case " +counter);
//        Integer expected = 22;
//
//        Assert.assertEquals(expected, actualResult);
//
//    }
//
//    @BeforeClass
//    public static void before() {
//        System.out.println("Before class annotation executes particular method before all the test cases present in class");
//        System.out.println("Started testcase:" +new Date());
//        //It is mostly used to open connection with database or open file
//    }
//
//    @Test
//    public void subTwoNumbersTest() {
//        System.out.println("Test case for subTwoNumbers");
//
//        Integer actualResult = CalculaterService.subTwoNumbers(10, 5);
//
//        Integer expectedResult = 5;
//
//        Assert.assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void sumOfAnyNumbersTest() {
//
//        for(int i=0;i<=10;i++){
//            counter=i++;
//        }
//
//        System.out.println("Test case for sumOfAnyNumbers");
//
//        Integer actualResult = CalculaterService.sumOfAnyNumbers(2, 5, 6, 10);
//
//        Integer expectedResult = 23;
//
//        System.out.println("Counter in sumOfAnyNumbers test case " +counter);
//
//        Assert.assertEquals(expectedResult, actualResult);
//
//    }
//    @Before
//    public void beforeEach(){
//        System.out.println("Before annotation executes particular method before each test cases execute in class");
//        counter=0;
//    }
//
//    @AfterClass
//    public static void closeCleanUp() {
//        System.out.println("After class annotation executes particular method after all the test cases present in class");
//        System.out.println("Ended testcases:" + new Date());
//        //It is mostly used to close connection with database or close file
//    }
//    @After
//    public void afterEach(){
//        System.out.println("After annotation executes particular method after each test cases execute in class");
//        counter=0;
//    }
//
//
//
//
//}

