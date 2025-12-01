package org.example.Day1.Khoi;

import java.util.Scanner;

public class AutoTraining_session01_baiTap4 {

    public static int[][] nhapMang2Chieu(int row, int column){
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = new int[row][column];
        for (int r = 0; r < row; r++){
            for (int c = 0; c < column; c++){
                System.out.println("arr2d["+ r +"][" + c + "]: ");
                arr2D[r][c] = sc.nextInt();
            }
        }
        return arr2D;
    }

    public static void xuatMang2Chieu(int[][] arr2D){
        for (int[] r : arr2D){
            for (int c : r){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static int sumAll(int[][] arr2D){
        int sumAll = 0;
        for (int[] row : arr2D){
            for (int column : row){
                sumAll += column;
            }
        }
        return (int) sumAll;
    }

    public static void sumAllByRow(int[][] arr2D){
        int sumRow = 0;
        int i = 0;
        for (int[] row : arr2D){
            for (int x : row){
                sumRow += x;
            }
            System.out.println("Tổng giá trị hàng " + ++i +": " + sumRow);
            sumRow = 0;
        }
    }

    public static void sumAllByColumn(int[][] arr2D){
        int sumColumn = 0;
        int columnCount = arr2D[0].length;
        int i = 0;

        for (int column = 0; column < columnCount; column++){
            for (int row = 0; row < arr2D.length; row++){
                sumColumn += arr2D[row][column];
            }
            System.out.println("Tổng giá trị cột " + ++i + ": " + sumColumn);
            sumColumn = 0;
        }
    }

    // 1 2 3
    // 3 4 5
    // 6 7 8

    public static int findMax(int[][] arr2D){
        int max = 0;

        for (int[] row : arr2D){
            for (int column : row){
                if (column > max)
                    max = column;
            }
        }
        return (int) max;
    }

    public static void main (String[] args){

        int row = 0;
        int column = 0;
        int[][] arr2D;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số hàng cho mảng 2 chiều");
        row = sc.nextInt();
        System.out.println("Nhập số cột cho mảng 2 chiều");
        column = sc.nextInt();

        arr2D = nhapMang2Chieu(row, column);
        xuatMang2Chieu(arr2D);

        System.out.println("Tổng giá trị mảng 2 chiều: " + sumAll(arr2D));

        sumAllByRow(arr2D);

        sumAllByColumn(arr2D);

        System.out.println("Giá trị lớn nhất trong mảng: " + findMax(arr2D));
    }
}
