package com.bridgelabz;

import java.util.Scanner;

public class Leapyear {
public static void main(String[] args){
	int y;
	Scanner sc=new Scanner(System.in); 
	System.out.println("enter the year: ");

	y=sc.nextInt();
	if(((y%4==0) && (y%100!=0)) || (y%400==0))
		System.out.println("entered year is a leap year ");
	else
		System.out.println("entered year is not the leap year");
	}
}
