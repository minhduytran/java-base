/**Yêu cầu:**
1. Tạo mảng lưu điểm của 5 sinh viên
2. Tính điểm trung bình
3. Tìm điểm cao nhất, thấp nhất
4. Đếm số sinh viên đạt (>= 5.0) và không đạt

**Áp dụng kiến thức:**
 ✅ Mảng 1 chiều (int[] hoặc double[])
- ✅ Vòng lặp for
 - ✅ Câu lệnh if-else
- ✅ Local variables */

void main() {
    double[] studentScore = {5.5, 4, 7.3, 6.5, 9};
    System.out.println(studentScore.length);
    double totalScore = 0;
    for(int i = 0; i < studentScore.length; i++){
        totalScore += studentScore[i];
    }
    double avgScore = totalScore/studentScore.length;
    System.out.println("điểm trung bình: " + avgScore);

    double min = studentScore[0];
    double max = studentScore[0];
    for(int i = 0; i < studentScore.length; i++){
        if(studentScore[i] > max){
            max = studentScore[i];
        }
        if(studentScore[i] < min){
            min = studentScore[i];
        }
    }
    System.out.println("điểm cao nhất: " + max);
    System.out.println("điểm thấp nhất: " + min);


    int studentPass = 0;
    int studentFail = 0;
    for(int i = 0; i<studentScore.length; i++){
        if(studentScore[i] < 5){
            studentFail ++;
        }else{
            studentPass ++;
        }
    }
    System.out.println("số sinh viên đạt: " + studentPass);
    System.out.println("số sinh viên ko đạt: "+ studentFail);
}
