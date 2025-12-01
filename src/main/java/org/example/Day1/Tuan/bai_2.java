package org.example.Day1.Tuan;

public class bai_2 {
    static int calculationCount = 0;

    public static int calculate(int a, int b) {
        calculationCount++;
        return a + b;
    }

    public static int calculate( int a, int b, int c ) {
        calculationCount++;
        return a + b + c;
    }

    public static double calculate(double a, double b) {
        calculationCount++;
        return a + b;
    }

    public static void main(String[] args) {
        int cal_1 = calculate(3, 5);
        System.out.println("Cal 1: " + cal_1);

        int cal_2 = calculate(2,5,9);
        System.out.println("Cal 2: " + cal_2);

        double cal_3 = calculate(3.5,6.6);
        System.out.println("Cal 3: " + cal_3);

        int cal_4 = calculate(3,5,9);
        System.out.println("Cal 4: " + cal_4);

        System.out.println("Tổng số lần call: " + calculationCount);

    }
}