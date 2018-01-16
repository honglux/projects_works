package com.selftest;

import java.util.Random;

//our mutiple exceptions test;
public class MultipleSTest {

    private final int MaxB = 33554432;

	//method to generate mutiple exceptions randomly;
    public void multipleExceptionGenerator(){

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

		//condition for all the exceptions occur;
        if (random.nextInt(MaxB) > 2000000){

            int outOfBE[] = new int[10];
            outOfBE[11] = 1;
        }

		//condition for two exceptions occur;
        if (random.nextInt(MaxB) > 1000000){

            Object intNumber = 1;
            String intToSE = (String)intNumber;

        }

		//condition for only one exception occur;
        if (random.nextInt(MaxB) > 500000){

            String a = null; //null value
            System.out.println(a.charAt(0));

        }

    }





}
