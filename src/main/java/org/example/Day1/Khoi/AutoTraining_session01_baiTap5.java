package org.example.Day1.Khoi;

import java.util.Scanner;

public class AutoTraining_session01_baiTap5 {
    static int primeCounter = 0;

    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void findPrimes(int number){
        int[] arrPrime = new int[number];
        int y = 0;
        for (int i = 0; i <= number; i++){
            if (isPrime(i)){
                arrPrime[y] = i;
                System.out.print(arrPrime[y] + " ");
                primeCounter++;
                y++;
            }
        }
        System.out.println();
        System.out.println("Có " + primeCounter + " số nguyên tố trong khoảng từ 1 tới " + number +".");
    }

    public static void main(String[] args){
        int number = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số bất kì: ");
        number = sc.nextInt();

        if (isPrime(number)){
            System.out.println(number + " là số nguyên tố.");
        } else{
            System.out.println(number + " không phải số nguyên tố.");
        }

        findPrimes(number);
    }
}
