package com.company;

import java.util.Scanner;

//problem 6
public class SumNumbersFrom1ToN {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("n= ");
        int n=input.nextInt();
        int result=0;
        for (int i = 1; i <= n; i++) {
            result=result+i;
        }
        System.out.print(result);
    }
//    public static long factorial(int n) {
//
//        long result = 0;
//
//
//
//        for (int i = 1; i <= n; i++) {
//
//            result = result + i;
//
//        }
//
//
//
//        return result;
//
//    }
}
