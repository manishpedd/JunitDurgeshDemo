package org.example.calculaterservice;

public class CalculaterService {

    public static Integer addTwoNumbers(Integer a,Integer b){
        return a+b;
    }

    public static Integer subTwoNumbers(Integer a,Integer b){
        return a-b;
    }

    public static Integer mulTwoNumbers(Integer a,Integer b){
        return a*b;
    }

    public static Integer divTwoNumbers(Integer a,Integer b){
        return a/b;
    }

    public static Integer sumOfAnyNumbers(Integer... numbers){
        int s=0;
        for(Integer n:numbers){
            s=s+n;
        }
        return s;
    }


}
