package org.example.Day1.Thanh;

public class GradeClassifier {
    public static String classifyGrade(double score){
        //Kiểm tra tính hợp lệ
        if (score <0|| score>10){
            return "Điểm không hợp lệ";
        }
        // Phân loại bằng if-else
        if (score >=9.0 && score <=10.0){
            return "Xuất sắc";
        }
        else if (score >= 8.0){
            return "Giỏi";
        }
        else if (score >= 6.5){
            return "Khá";
        }
        else if (score >=5.0){
            return "Trung bình";
        }
        else{
            return "Yếu";
        }
    }

    public static void main(String[] args){
        double [] testScores = {9.6, 8.5, 7.0, 5.5, 3.4, -1.0, 11};
        for (double score : testScores){
            System.out.println("Điểm: "+ score + "->" + classifyGrade(score));
        }
    }
}
