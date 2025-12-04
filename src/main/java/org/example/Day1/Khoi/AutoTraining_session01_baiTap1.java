package org.example.Day1.Khoi;

public class AutoTraining_session01_baiTap1 {

    public static double diemTrungBinh(double[] arrDiemHS){
        double sum = 0;
        for (double x : arrDiemHS){
            sum += x;
        }
        return (double) sum/ arrDiemHS.length;
    }

    public static double timDiemMax(double[] arrDiemHS){
        double max = 0;
        for (double x : arrDiemHS){
            if (x > max){
                max = x;
            }
        }
        return (double) max;
    }

    public static double timDiemMin(double[] arrDiemHS){
        double min = arrDiemHS.length;
        for (double x : arrDiemHS){
            if (x <= min){
                min = x;
            }
        }
        return (double) min;
    }

    public static int demHsPass(double[] arrDiemHS){
        int count = 0;
        for (double x : arrDiemHS){
            if (x >= 5){
                count++;
            }
        }
        return count;
    }

    public static int demHsFail(double[] arrDiemHS){
        int count = 0;
        for (double x : arrDiemHS){
            if (x < 5){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        double[] scores = {5.5, 4.9, 9, 1, 8};

        double dtb = diemTrungBinh(scores);
        System.out.println("Điểm trung bình = " + dtb);

        double max = timDiemMax(scores);
        System.out.println("Điểm cao nhất = " + max);

        double min = timDiemMin(scores);
        System.out.println("Điểm thấp nhất = " + min);

        int count = demHsPass(scores);
        System.out.println("Số lượng HS đạt: " + count);

        count = demHsFail(scores);
        System.out.println("Số lượng HS không đạt: " + count);
    }

}
