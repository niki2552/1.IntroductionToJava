package com.company;

//problem 3
public class AssignVariables {
    public static void main(String[] args){
        short num= -32768 ; //This thing don't work because short is from – 32,768 to 32,767
        int number=num;
        System.out.print(number);
    }
}
