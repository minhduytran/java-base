package org.example.Day1.Khoi;

public class AutoTraining_session01_baiTap2 {
    static int demCalculate = 0;
    public static int calculate(int a, int b){
        demCalculate++;
        return a + b;
    }

    public static int calculate(int a, int b, int c){
        demCalculate++;
        return a + b + c;
    }

    public static double calculate(double a, double b){
        demCalculate++;
        return (double) a + b;
    }

    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        double d = 4.5;
        double e = 6.85;

        System.out.println("Tổng 2 số nguyên: " + calculate(a,b));
        System.out.println("Tổng 3 số nguyên: " + calculate(a,b,c));
        System.out.println("Tổng 2 số thực: " + calculate(d,e));
        System.out.println("Tổng số lần tính toán: " + demCalculate);
    }
}
