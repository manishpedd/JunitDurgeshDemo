package org.example.services;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample {

    //Assertion validating actual result with expected result
    @Test
    public void test1() {
        System.out.println("Testing some assertion methods");
        int actual = 20;
        int expected = 20;
        Assertions.assertEquals(actual, expected);
        //assert equals contains overloaded methods

    }

    @Test
    public void test2() {
        System.out.println("Testing array assertion methods");
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        System.out.println("Testing object reference is same or not");
        String expectedName = new String("manish");
        String Actualname = new String("manish");
        Assertions.assertSame(expectedName, Actualname);
        System.out.println("AssertSame method is used to check object reference");

    }

    @Test
    public void test4() {
        System.out.println("Testing object reference is same or not");
        String expectedName = "manish";
        String Actualname = "manish";
        Assertions.assertSame(expectedName, Actualname);
        // Assert.assertNotNull();
        //Assert.assertNull();
        System.out.println("AssertSame method is used to check object reference test case is passed");

    }

    @Test
    public void test5() {
        System.out.println("Testing values");
        boolean expectedValue = true;
        Assertions.assertTrue(expectedValue,"passed");
        Assertions.assertFalse(expectedValue,"failed");
        // Assert.assertNotNull();
        //Assert.assertNull();
    }

    @Test
    public void test6() {
        System.out.println("Testing list values");
        List<Integer> expected =Arrays.asList(1,2,3,4,5);
        List<Integer> actual =Arrays.asList(1,2,3,5,4);
        Assertions.assertIterableEquals(expected,actual);


    }

    @Test
    public void test7() {
        System.out.println("Testing exception");
        Assertions.assertThrows(RuntimeException.class,() -> {
            throw new RuntimeException("This is testing exception");
        });


    }



    }







