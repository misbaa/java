package com.day2;
import java.util.Scanner;

import java.time.Period;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        String name;
        int date,year,month,salary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name:");
        name=sc.nextLine();
        System.out.println("Enter date of birth:");
        date=sc.nextInt();
        //sc.nextInt();
        System.out.println("Enter month of birth:");
        month=sc.nextInt();
        System.out.println("Enter birth year:");
        year=sc.nextInt();
        System.out.println("Enter monthly salary:");
        salary=sc.nextInt();
        Em e=new Em();
        e.name="Riva";
        LocalDate today= LocalDate.now();
        LocalDate birthDate=LocalDate.of(year,month,date);
        int years=Period.between(birthDate,today).getYears();
        e.age=years;
        int annualsalary;
        annualsalary=12*(salary);
        e.annualsalary=annualsalary;


                   if(annualsalary>=500000)
                    {
                        System.out.println("tax amount is 20%");
                     }
                   else if(annualsalary>=400000)
                   {
                       System.out.println("tax amount is 15%");
                   }
                   else if(annualsalary>=300000)
                   {
                       System.out.println("tax amount is 10%");
                   }
                   else {
                       System.out.println("no tax");;
                   }


        e.display();



    }
}
