package org.example.Day1.Thanh;

public class calculatorMethod {
    private static int count = 0;
    //Cộng 2 số nguyen
    public static int calculate(int a, int b){
        count++;
        return a + b;
    }
    //Cộng 3 số nguyên
    public static int calculator(int a, int b, int c){
        count++;
        return a + b + c;
    }
    //Cộng 2 số thực
    public static double calculator(double a, double b){
        count++;
        return a + b;
    }
}
