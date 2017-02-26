/*Задание 2.
Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

Date: 10.02.2017
Author: Anastasiya Findziukevich
*/
package com.epam.java_training.ls1.task2;

import java.lang.Math;

public class Circle {
	private double R;
	
	public Circle(double _R){
		R = _R;
	}
	
	
	private double  lengthCircle(){
		double resultvalue = 0;
	
		resultvalue = 2*Math.PI*this.R;
		
		return resultvalue;
		}
	
	private double squareCircle(){
		double resultvalue = 0;
         
		resultvalue = Math.PI*Math.pow(this.R, 2);
		
		return resultvalue;
		}
	
	public void calculateCircle(){
		
		double squareCircleResult;
		double lengthCircleResult;
		
		squareCircleResult = squareCircle();
		
		System.out.println("The square is " + squareCircleResult);
		
		lengthCircleResult = lengthCircle();
		
		System.out.println("The length is " + lengthCircleResult);
	}

}
