package org.example.Day1.Khoi;

public class AutoTraining_session01_baiTap3 {

    public static String classifyGrade(double a){
        if (a < 5){
            return "Yếu";
        } else if (a >= 5 && a <= 6.4){
            return "Trung bình";
        } else if (a >= 6.5 && a <= 7.9){
            return "Khá";
        } else if (a >= 8 && a <= 8.9){
            return "Giỏi";
        } else if (a >= 9 && a <= 10){
            return "Xuất sắc";
        } else{
            return "Nhập điểm không hợp lệ!";
        }
    }

    public static void main(String[] args){
        double diem = 10;
        System.out.println(classifyGrade(diem));
    }

}
