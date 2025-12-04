package org.example.Day1.Chinh;

public class BT1 {
    public static void main(String[] args) {
        double[] studentScores = {5.0, 3.4, 4.9, 7.8, 9.5};

        double sum = 0;
        double max = 0;
        double min = 0;
        double avg = 0;
        int countPass = 0;
        int countNotPass = 0;

        for (double number : studentScores) {
            sum += number;
            //Tìm max
            if (number > max) {
                max = number;
            }

            //Tìm min
            if (number < min || min == 0) {
                min = number;
            }

            //Điểm trung bình
            avg = sum / studentScores.length;

            //Đếm đạt, không đạt
            if (number >= 5) {
                countPass++;
            } else {
                countNotPass++;
            }
        }

        System.out.println("Điểm cao nhất: " + max);
        System.out.println("Điểm thấp nhất: " + min);
        System.out.println("Điểm trung bình: " + avg);
        System.out.println("Số sinh viên đạt: " + countPass);
        System.out.println("Số sinh viên không đạt: " + countNotPass);

    }
}