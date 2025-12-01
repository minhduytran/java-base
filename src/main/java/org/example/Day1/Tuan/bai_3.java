package org.example.Day1.Tuan;/*
**Yêu cầu:**
        1. Nhập điểm số (0-10)
2. Sử dụng **if-else** hoặc **switch** để phân loại:
        - 9.0 - 10: Xuất sắc
  - 8.0 - 8.9: Giỏi
  - 6.5 - 7.9: Khá
  - 5.0 - 6.4: Trung bình
  - < 5.0: Yếu
3. Kiểm tra điểm hợp lệ (0-10)

**Áp dụng kiến thức:**
        - ✅ Primitive type (double)
- ✅ if-else hoặc switch-case
        - ✅ Logical operators
- ✅ Method với tham số
*/

import java.util.Scanner;

public class bai_3 {
    public static String rank(double score) {

        if(score >= 9 && score <= 10){
            return "Xuất sắc";
        } else if (score >=8 && score <=8.9){
            return "Giỏi";
        } else if (score >=6.5 && score <=7.9){
            return "Khá";
        } else if (score >=5.0 && score <=6.4){
            return "Trugn Bình";
        } else if (score < 5 && score >=0){
            return "Yếu";
        } else {
            return "Điểm không hợp lệ!";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm: ");

        double score = sc.nextDouble();
        String ketQua = rank(score);
        System.out.println("Học lực: " + ketQua);

    }



    }

