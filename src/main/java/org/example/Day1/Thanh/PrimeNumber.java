package org.example.Day1.Thanh;

public class PrimeNumber {
    static int primeCount = 0;
    // 1. Kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        // Số nhỏ hơn 2 không phải số nguyên tố
        if (number <= 1) {
            return false;
        }
        //Kiểm tra tính chia hết cho 2 đến căn bậc 2 của number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    //2. Tìm tất cả số nguyên tố từ 1 đến n
    public static void findPrimes(int n){
        int[] primes = new int[n]; //Mảng lưu số nguyên tố
        int index = 0; //chỉ số trong mảng primes
        for (int i = 1; i<= n; i++){
            if (isPrime(i)){
                primes[index++] = i;
                primeCount++; //Tăng đếm số nguyên tố tìm được
            }
        }
        System.out.println("Các số nguyên tố từ 1 đến " + n + " là");
        for (int i = 0; i< index; i++){
            System.out.println(primes[i] + " ");
        }
        System.out.println();
    }
    public static void main (String[] args){
        findPrimes(50); //Tìm các số nguyên tố từ 1 đến 50
        System.out.println("Tổng số nguyên tố tìm được: " + primeCount);
    }
}
