package com.selftest;

import java.util.Random;

//our infinity loop test;
public class LoopSTest {

    private final int MaxB = 33554432;

	//infinity loop exceptions generator;
    public void loopGenerator(){

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int condition = random.nextInt(MaxB);
        System.out.println("condition "+condition);

		//infinity loop;
        while (condition>1000000){

            condition = condition;


        }


    }


}
