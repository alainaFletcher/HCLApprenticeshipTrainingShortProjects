 package com.hcl.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;

public class Main {

public static void main(String[] args) {
   ArrayList<Integer> numList = new ArrayList<Integer>(
         Arrays.asList(2,3,1,4,5,6,3,7,8,4,6,9,5,4));
   
   //Lambda expressions
   LambdaPractice.lambda(numList);
       
   //Method references
        BiFunction<Integer, Integer, Integer>multi = MethodReferencePractice::multiply;  
        int result = multi.apply(15, 26);  
        System.out.println(result);  
       
       
        //Functional interfaces
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Testing a new thread...");
            }
        }).start();
       
       

}

}

