package com.code.SimpleandCompoundInterest;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args)
    {
       SimpleandCompoundInterest test =new SimpleandCompoundInterest();
        Scanner sc=new Scanner(System.in);
        double principal=sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();
        System.out.println(test.simpleInterest(principal,rate,time));
        System.out.println(test.compoundInterest(principal,rate,time));
    }
}
