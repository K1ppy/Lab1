package com.company;

import java.util.Scanner;

import com.sun.media.sound.InvalidFormatException;

public class Main {

    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(System.in)) {
           System.out.println("Enter k : ");
           int k = scanner.nextInt();
           double eps = Math.pow(10, -k);
           System.out.println("Enter x (-1, 1) : ");
           double x = scanner.nextDouble();
           if(x <= -1 || x >= 1){
               throw new InvalidFormatException("x should be in (1, -1)");
           }
           double formValue = Math.sin(x);
           double calcValue = calcValue(x, eps);

           System.out.println("FormulaValue : " + formattedValue(formValue));
           System.out.println("CalcValue : " + formattedValue(calcValue));
       } catch (Exception ex) {
           System.out.println("Error while reading value : " + ex);
       }
    }

    public static double calcValue(double x, double eps){
        double item = x;
        double calculatedValue = x;
        int n = 1;
        while(Math.abs(item) >= eps){
            item = item*x*x/(n+1)/(n+2)/(-1);
            calculatedValue += item;
            n += 2;
        }
        return calculatedValue;
    }

    private static String formattedValue(double value){
        return String.format("%.3f", value);
    }
}
