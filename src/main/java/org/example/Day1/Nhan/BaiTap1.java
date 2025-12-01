package org.example.Day1.Nhan;

public class BaiTap1 {

    public static void main(String[] args) {
        double[] scores = {7.5, 4.0, 9.0, 5.5, 3.5};

        double sum = 0;
        double max = scores[0];
        double min = scores[0];
        int pass = 0, fail = 0;

        for (double s : scores) {
            sum += s;

            if (s > max) max = s;
            if (s < min) min = s;

            if (s >= 5) pass++;
            else fail++;
        }

        System.out.println("Điểm TB: " + (sum / scores.length));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Đạt: " + pass);
        System.out.println("Không đạt: " + fail);
    }
}

