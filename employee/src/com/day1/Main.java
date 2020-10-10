package com.day1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee e =new Employee();
        e.name="Smith";
        e.city="Banglore";
        e.age=20;
        Employee e1=new Employee();
        e1.name="Bonnie";
        e1.city="Chennai";
        e1.age=18;
        e.display();
        e1.display();

    }
}
