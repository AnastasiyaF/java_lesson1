/*
Задание 3.
Найти произведение цифр заданного четырехзначного числа.

Date: 10.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls1.task3;

public class MultiplyNumberDigits {

	public static int multiplyDigits(int inputdigit){
		int resultvalue = 1;
		int digit;
		
		do{
			digit = inputdigit%10;
			inputdigit = inputdigit/10;
			
			if (digit == 0) {
				return 0;
			}
			resultvalue = resultvalue * digit;	
		}
		while (inputdigit > 0);
		
		return resultvalue;
	}
}
