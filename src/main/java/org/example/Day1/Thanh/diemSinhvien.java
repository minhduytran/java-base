package org.example.Day1.Thanh;

public class diemSinhvien {
    public static void main(String[] args) {
        //1. Tạo mảng lưu điểm 5 sinh viên
        double[] diemSinhVien = {8.5, 7.0, 9.0, 5.0, 3.5};

        //2. Tính điểm trung bình
        double tongDiem = 0;
        for (double diem : diemSinhVien) {
            tongDiem += diem;
        }
        double diemTrungBinh = tongDiem / diemSinhVien.length;

        //3. Tìm điểm cao nhất và thấp nhất
        double diemCaoNhat = diemSinhVien[0];
        double diemThapNhat = diemSinhVien[0];
        for (double diem : diemSinhVien) {
            if (diem > diemCaoNhat) {
                diemCaoNhat = diem;
            }
            if (diem < diemThapNhat) {
                diemThapNhat = diem;
            }
        }
        //4. Dánh dấu sinh viên đậu/rớt
        int dau = 0;
        int rot = 0;
        for (double diem: diemSinhVien){
            if (diem>=5.0) {
                dau++;
            }else
                rot++;

        }        //5. In kết quả
        System.out.printf("Điểm trung bình: %.2f%n", diemTrungBinh);
        System.out.printf("Điểm cao nhất: %.2f%n", diemCaoNhat);
        System.out.printf("Điểm thấp nhất: %.2f%n", diemThapNhat);
        System.out.printf("Số sinh viên đậu: %d%n", dau);
        System.out.printf("Số sinh viên rớt: %d%n", rot);

    }
}