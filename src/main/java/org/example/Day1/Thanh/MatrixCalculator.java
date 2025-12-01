package org.example.Day1.Thanh;

public class MatrixCalculator {
    // 1. Tính tổng tất cả phần tử trong ma trận
    public static int sumAll(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }

    //2. Tính tổng từng hàng
    public static void sumRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Tông hàng " + i + " = " + sum);
        }
    }

    //3. Tính tổng từng cột
    public static void sumColumns(int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            System.out.println("Tổng cột " + col + " = " + sum);
        }
    }

    //4. Tìm phần tử lớn nhất trong ma trận
    public static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    // 5. Test tất cả phương thức
    public static void main(String[] args) {
        int[][] matrix = {
            {
                1, 2, 3
            },
            {
                4, 5, 6
            },
            {
                7, 8, 9
            }
        } ;
        System.out.println("Tổng tất cả phần tử = " + sumAll(matrix));
        sumRows(matrix);
        sumColumns(matrix);
        System.out.println("Phần tử lớn nhất trong ma trận = " + findMax(matrix));
    }
}
