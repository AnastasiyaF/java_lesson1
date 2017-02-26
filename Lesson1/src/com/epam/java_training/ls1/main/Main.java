package com.epam.java_training.ls1.main;

import java.util.Random;

import com.epam.java_training.ls1.task2.Circle;
import com.epam.java_training.ls1.task3.MultiplyNumberDigits;

public class Main {

	public static void main(String[] args) {
		int R;
		int RandomValue;
		int ResultValue;
		
		Random rand = new Random();
		
		System.out.println("Task2 is in progress...");
		
        R = rand.nextInt(15);
		
		Circle circle = new Circle(R);
		System.out.println("R is " + R);
		circle.calculateCircle();
		
		System.out.println("Task2 is completed." + "\n");
		
		System.out.println("Task3 is in progress...");
		RandomValue = 1080;
		
		System.out.println("The number is " + RandomValue);
		
		ResultValue = MultiplyNumberDigits.multiplyDigits(RandomValue);
		
		System.out.println("Multiply 4 Digits is " + ResultValue);
		
		
        RandomValue = 9745;
		
		System.out.println("The number is " + RandomValue);
		
		ResultValue = MultiplyNumberDigits.multiplyDigits(RandomValue);
		
		System.out.println("Multiply 4 Digits is " + ResultValue);
		
		
        RandomValue = 9981;
		
		System.out.println("The number is " + RandomValue);
		
		ResultValue = MultiplyNumberDigits.multiplyDigits(RandomValue);
		
		System.out.println("Multiply 4 Digits is " + ResultValue);
		
		
		System.out.println("Task3 is completed.");
		
	}

}
