package org.example.Day1.Nhan;

public class BaiTap2 {

    static int calculationCount = 0;

    public static int calculate(int a, int b) {
        calculationCount++;
        return a + b;
    }

    public static int calculate(int a, int b, int c) {
        calculationCount++;
        return a + b + c;
    }

    public static double calculate(double a, double b) {
        calculationCount++;
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(calculate(3, 4));      // 7
        System.out.println(calculate(1, 2, 3));   // 6
        System.out.println(calculate(2.5, 7.5));  // 10.0
        System.out.println(calculate(13, 6));
        System.out.println("Số lần gọi: " + calculationCount);
    }
}
