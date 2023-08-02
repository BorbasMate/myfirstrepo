package com.example.demojavafx;

public class Main {



    public static void main(String[] args) {

        System.out.println("Hello World");

        int firstNumber;
        firstNumber = 5;
        int secondNumber = 9;

        // Shift + F6

        int sum = sumTwoInt(firstNumber, secondNumber);
        printHello(String.valueOf(sum));

        printHello("Hello World");

        int anotherSum = sumTwoInt(firstNumber, secondNumber);

        Parrot gyuri = new Parrot("Gyuri",10,true);
        Parrot pityu = new Parrot("Pityu",2,true);

        gyuri.speak();
        pityu.speak();

        System.out.println(Parrot.MAX_SPEED);

        double pi = Math.PI;

    }


    private static int sumTwoInt(int firstInt, int secondInt) {
        return firstInt + secondInt;
    }

    public static void printHello(String input) {
        System.out.printf("%20s%n", input);
    }
}

