package com.code.ConstructionCost;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ConstructionCost test= new ConstructionCost();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Standard or AboveStandard or HighStandard or FullyAutomated"); 
        String material=sc.nextLine();
        System.out.println("enter Area value");
        double Area = sc.nextDouble();
        System.out.println("enter Automation value(True or False)");
        boolean automation=sc.nextBoolean()
        System.out.println(test.costForConstructionMaterial(material,Area,automation));
    }
}
