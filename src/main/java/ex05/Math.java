package ex05;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class Math {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Math app = new Math();
        double num1 = app.enterNum1();
        double num2 = app.enterNum2();
        double sum = app.calculateSum(num1, num2);
        double diff = app.calculateDiff(num1, num2);
        double prod = app.calculateProduct(num1, num2);
        double quo = app.calculateQuotient(num1, num2);
        app.printOutput(num1, num2, sum, diff, prod, quo);
    }

    public Double enterNum1(){
        System.out.print("What is the first number? ");
        String string1 = input.nextLine();
        return Double.parseDouble(string1);
    }

    public Double enterNum2(){
        System.out.print("What is the second number? ");
        String string2 = input.nextLine();
        return Double.parseDouble(string2);
    }

    public Double calculateSum(double num1, double num2){
        return num1 + num2;
    }

    public Double calculateDiff(double num1, double num2){
        return num1 - num2;
    }

    public Double calculateProduct(double num1, double num2){
        return num1 * num2;
    }

    public Double calculateQuotient(double num1, double num2){
        return num1 / num2;
    }

    public void printOutput(double num1, double num2, double sum, double diff, double prod, double quo){
        System.out.printf("%.2f + %.2f = %.2f\n%.2f - %.2f = %.2f\n%.2f * %.2f = %.2f\n%.2f / %.2f = %.2f", num1, num2, sum, num1, num2, diff, num1, num2, prod, num1, num2, quo);
    }
}
