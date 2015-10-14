package com.company;

//problem 5
import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n=s.nextInt();

        for (int i = 0; i < n; i++) {
            for (char j ='a'; j <='a'+ i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n-2; i >=0; i--) {
            for (char j ='a'; j <='a'+i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
