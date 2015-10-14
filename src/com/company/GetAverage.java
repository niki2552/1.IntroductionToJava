package com.company;

import java.util.Scanner;

//problem 8
public class GetAverage {
    public static void main (String[] args){
        System.out.println("Enter three numbers to find their average: ");
        Scanner reader = new Scanner(System.in);
        Double firstNumber = reader.nextDouble();
        Double secondNumber = reader.nextDouble();
        Double threeNumber = reader.nextDouble();
        Double average = findingAverage(firstNumber, secondNumber, threeNumber);
        System.out.format("The average number is %.2f \n", average);
    }
    private static Double findingAverage(Double firstNumber, Double secondNumber, Double threeNumber) {
        Double sum =  firstNumber + secondNumber + threeNumber;
        Double average = sum / 3;
        return  average;
    }
}
