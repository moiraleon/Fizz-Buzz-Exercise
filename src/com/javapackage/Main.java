package com.javapackage;

public class Main {

    public static void main(String[] args) {

        //divisible by 5 fizz
        //divisible by 3 buzz
        //divisible by 3 and 5 fizzbuzz
        //else return the number
        int number = 3;
        switch(number){
            case (number/3) % ==0:
                System.out.println("Buzz");
                break;
            case (number/5) %==0:
                System.out.println("Fizz");
                break;
            default:
                System.out.println(number);
        }
    }
}
