package org.example.Day1.Nhan;

public class BaiTap3 {

    public static String classifyGrade(double score) {

        if (score < 0 || score > 10) {
            return "Điểm số chỉ chấp nhận từ 0 đến 10";
        }

        if (score >= 9.0 && score <= 10.0) {
            return "Xuất sắc";
        } else if (score >= 8.0) {          // 8.0–8.9
            return "Giỏi";
        } else if (score >= 6.5) {          // 6.5–7.9
            return "Khá";
        } else if (score >= 5.0) {          // 5.0–6.4
            return "Trung bình";
        } else {                            // < 5.0
            return "Yếu";
        }
    }

    public static void main(String[] args) {

        double[] testScores = {9.5, 8.2, 7.0, 5.5, 3.8, -1, 13};

        for (double score : testScores) {
            String result = classifyGrade(score);
            System.out.println("Điểm: " + score + " → " + result);
        }
    }
}
