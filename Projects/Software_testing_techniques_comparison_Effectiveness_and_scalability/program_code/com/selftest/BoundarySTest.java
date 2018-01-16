package com.selftest;

import java.util.Random;
import java.time.*;


//our own implematation for boundary exception test;
public class BoundarySTest {

	//random max boundary;
    private final int MaxB = 33554432;

	//methods for generating boundary exceptions randomly;
    public void outBoundaryGenertor(){

        Random randomSeed = new Random();
        randomSeed.setSeed(System.currentTimeMillis());

		//have 10000 loops to make sure the exception will occur, but not sure whenit will occur;
        for (int i=0;i<10000;i++){

            int boundary = randomSeed.nextInt(MaxB);
            int array_test[] = new int[boundary];
			//each iteration will have 5 chances to generate the boundary exceptions;
            for (int j = 0;j<5;j++){
                int index = randomSeed.nextInt(MaxB);
				//situation the exception occur;
                if (index-1 >= boundary){
                    System.out.println("outOfBoundary");
                    array_test[index-1] = 1;
                }
				//situation the exception did not occur;
                else{
                    System.out.println("inBoundary");
                    array_test[index-1] = 1;
                }

            }

        }

    }


}
