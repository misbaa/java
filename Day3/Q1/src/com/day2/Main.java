package com.day2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int n,total=0;
    float percentage;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no. of subjects:");
	n=sc.nextInt();
	int marks[]=new int[n];
	System.out.println("enter marks out of 100:");
	for(int i=0;i<n;i++)
	{
		marks[i] = sc.nextInt();
		total=total+ marks[i];
	}
	percentage=(float)total /n;
	System.out.println("Sum:"+total);
	//System.out.println("Percentage:"+percentage);
	if(percentage>=75&& percentage<=100)
	{
		System.out.println("A Grade");
		System.out.println("Percentage:"+percentage);
	}
	else if(percentage>=50&& percentage<75)
	{
		System.out.println("B Grade");
		System.out.println("Percentage:"+percentage);
	}
	else if(percentage>=35&& percentage<50)
	{
		System.out.println("C Grade");
		System.out.println("Percentage:"+percentage);
	}
	else{
		System.out.println("Fail");
		System.out.println("Percentage:"+percentage);
	}

    }
}
