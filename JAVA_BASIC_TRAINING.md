# 📘 KỊCH BẢN TRAINING JAVA BASIC

> **Theme:** Dark, nội dung chuyên sâu, trình bày dạng slide
> **Target:** Automation Testing & Selenium Foundation

---

## Slide 1 – Java Basic Training – Giới thiệu

### 🎯 Mục tiêu khóa học

- Hiểu rõ **biến, kiểu dữ liệu, mảng, điều kiện, hàm** trong Java
- Làm nền tảng để học **Selenium** và **Automation Testing**

### 📋 Nội dung chính

1. **Biến & Kiểu dữ liệu**
2. **Câu lệnh điều kiện**
3. **Mảng 1D – 2D**
4. **Hàm (method)**

---

## Slide 2 – Biến (Variables) – Giới thiệu

### 📌 Định nghĩa

**Biến** là vùng nhớ lưu dữ liệu trong chương trình.

### 💻 Cú pháp

```java
kiểuDữLiệu tênBiến = giáTrị;
```

**Ví dụ cụ thể:**

```java
int age = 25;                    // số nguyên
double price = 99.99;            // số thực
String name = "John";            // chuỗi ký tự
boolean isActive = true;         // true/false
char grade = 'A';                // ký tự đơn
```

### ✅ Quy tắc đặt tên biến

- ❌ Không bắt đầu bằng số
- ❌ Không dùng ký tự đặc biệt (trừ `_` và `$`)
- ✅ Dùng **camelCase** cho biến & method

**Ví dụ đúng:**
```java
int studentAge;          // ✅ Đúng
String firstName;        // ✅ Đúng
double totalPrice;       // ✅ Đúng
```

**Ví dụ sai:**
```java
int 2ndPlace;            // ❌ Sai - bắt đầu bằng số
String first-name;       // ❌ Sai - có ký tự đặc biệt (-)
double total price;      // ❌ Sai - có khoảng trắng
```

### 🔖 Các loại biến trong Java

Java có **3 loại biến** chính, phân biệt dựa trên **vị trí khai báo** và **phạm vi sử dụng**:

1. **Local Variable** (Biến cục bộ) – trong method/block
2. **Instance Variable** (Biến instance) – trong class, thuộc object
3. **Static Variable** (Biến tĩnh) – trong class, dùng chung

---

## Slide 3 – Local Variable (Biến cục bộ)

### 📍 Khai báo ở đâu?
- Bên trong **method**, **constructor** hoặc **block { }**

### 🔍 Phạm vi sử dụng
- Chỉ dùng được trong method/block đó
- Bị hủy khi method kết thúc

### ⚡ Đặc điểm
- **Không có giá trị mặc định** → Bắt buộc phải khởi tạo trước khi dùng
- Lưu trong **Stack memory**
- Tồn tại cho đến khi method kết thúc

### 💻 Ví dụ

```java
public void calculateTotal() {
    int quantity = 5;           // local variable
    double price = 100.0;       // local variable
    double total = quantity * price;  // local variable

    System.out.println("Total: " + total);
}
// Sau khi method kết thúc, quantity, price, total bị xóa khỏi bộ nhớ
```

### ❌ Lỗi thường gặp

```java
public void test() {
    int x;  // khai báo nhưng chưa khởi tạo
    System.out.println(x);  // ❌ ERROR: variable x might not have been initialized
}
```

---

## Slide 4 – Instance Variable (Biến instance)

### 📍 Khai báo ở đâu?
- Trong **class** nhưng **ngoài method**

### 🔍 Phạm vi sử dụng
- Dùng được ở mọi method trong class (thông qua object)
- **Mỗi object có 1 bản sao riêng**

### ⚡ Đặc điểm
- **Có giá trị mặc định** (int=0, double=0.0, boolean=false, String=null)
- Lưu trong **Heap memory**
- Tồn tại cho đến khi object bị xóa (Garbage Collection)

### 💻 Ví dụ

```java
class Student {
    // Instance variables
    String name;        // mặc định = null
    int age;            // mặc định = 0
    double gpa;         // mặc định = 0.0
    boolean isPassed;   // mặc định = false

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}

// Sử dụng:
Student student1 = new Student();
student1.name = "John";
student1.age = 20;

Student student2 = new Student();
student2.name = "Jane";
student2.age = 22;

// student1 và student2 có bản sao riêng của name, age, gpa
```

### 🔑 Điểm quan trọng
- Mỗi object có **dữ liệu riêng biệt**
- Thay đổi `student1.name` **không ảnh hưởng** đến `student2.name`

---

## Slide 5 – Static Variable (Biến tĩnh)

### 📍 Khai báo ở đâu?
- Trong **class** với từ khóa **static**

### 🔍 Phạm vi sử dụng
- Thuộc về **class**, không thuộc về method riêng lẻ
- **Được chia sẻ chung** cho toàn bộ chương trình
- Có thể truy cập từ bất kỳ method nào

### ⚡ Đặc điểm
- Chỉ có **1 bản duy nhất** trong bộ nhớ
- **Có giá trị mặc định** (giống instance variable)
- Lưu trong **Method Area** (Java 8+: Metaspace)
- Tồn tại cho đến khi chương trình kết thúc

### 💻 Ví dụ 1: Biến đếm (Counter)

```java
public class Calculator {
    static int calculationCount = 0;  // static variable - đếm số lần tính toán

    public static void add(int a, int b) {
        calculationCount++;  // Tăng mỗi khi gọi method
        int result = a + b;
        System.out.println("Result: " + result);
        System.out.println("Total calculations: " + calculationCount);
    }

    public static void subtract(int a, int b) {
        calculationCount++;  // Tăng mỗi khi gọi method
        int result = a - b;
        System.out.println("Result: " + result);
        System.out.println("Total calculations: " + calculationCount);
    }
}
```

### 💡 Sử dụng thực tế

```java
public class Main {
    public static void main(String[] args) {
        Calculator.add(10, 5);        // calculationCount = 1
        // Output: Result: 15
        //         Total calculations: 1

        Calculator.add(20, 8);        // calculationCount = 2
        // Output: Result: 28
        //         Total calculations: 2

        Calculator.subtract(30, 12);  // calculationCount = 3
        // Output: Result: 18
        //         Total calculations: 3
    }
}
```

### 💻 Ví dụ 2: Hằng số chung

```java
public class Config {
    static final String APP_NAME = "TestApp";     // Hằng số - không thay đổi
    static final int MAX_USERS = 100;             // Hằng số - không thay đổi
    static final double PI = 3.14159;             // Hằng số - không thay đổi

    static String currentUser = "Admin";          // Biến static - có thể thay đổi
}

public class Main {
    public static void main(String[] args) {
        System.out.println("App: " + Config.APP_NAME);
        System.out.println("Max Users: " + Config.MAX_USERS);
        System.out.println("Current User: " + Config.currentUser);

        Config.currentUser = "John";  // Thay đổi được
        System.out.println("New User: " + Config.currentUser);

        // Config.MAX_USERS = 200;  // ❌ ERROR: không thay đổi được vì có 'final'
    }
}
```

### 🔑 Điểm quan trọng
- Static variable **chỉ tồn tại 1 bản** trong bộ nhớ
- **Tất cả method đều dùng chung** giá trị này
- Thường dùng cho: **hằng số, biến đếm, configuration**
- Kết hợp với **final** để tạo hằng số không đổi

---

## Slide 6 – So sánh 3 loại biến

### 📊 Bảng so sánh tổng quan

| Đặc điểm | Local Variable | Instance Variable | Static Variable |
|----------|----------------|-------------------|-----------------|
| **Vị trí khai báo** | Trong method/block | Trong class, ngoài method | Trong class với `static` |
| **Giá trị mặc định** | ❌ Không có | ✅ Có | ✅ Có |
| **Phạm vi** | Trong method/block | Toàn bộ object | Toàn bộ class |
| **Bộ nhớ** | Stack | Heap | Method Area |
| **Số bản sao** | 1 bản / lần gọi | 1 bản / object | 1 bản / class |
| **Truy cập** | Chỉ trong method | Qua object | Qua class hoặc object |
| **Tồn tại đến khi** | Method kết thúc | Object bị xóa | Chương trình kết thúc |

### 🎯 Khi nào dùng loại nào?

**Local Variable:**
- ✅ Biến tạm thời trong method
- ✅ Tính toán, xử lý logic trong hàm

**Instance Variable:**
- ✅ Thuộc tính của object (name, age, price...)
- ✅ Mỗi object có dữ liệu riêng

**Static Variable:**
- ✅ Hằng số chung (PI, MAX_VALUE...)
- ✅ Biến đếm, configuration chung
- ✅ Dữ liệu chia sẻ giữa các objects

---

## Slide 7 – Kiểu dữ liệu trong Java

### 📌 Primitive Type (Kiểu dữ liệu nguyên thủy) là gì?

**Primitive Type** là kiểu dữ liệu **cơ bản nhất** trong Java, lưu trữ **giá trị trực tiếp**.

**Đặc điểm:**
- ✅ Lưu **giá trị** trực tiếp trong bộ nhớ (Stack)
- ✅ Có kích thước **cố định**
- ✅ **Nhanh** và **hiệu quả** về bộ nhớ
- ✅ **Không phải object**, không có method

### 🔢 8 Kiểu dữ liệu Primitive trong Java

| Kiểu | Mô tả | Kích thước | Giá trị mặc định | Phạm vi |
|------|-------|------------|------------------|---------|
| `byte` | Số nguyên rất nhỏ | 8-bit | 0 | -128 đến 127 |
| `short` | Số nguyên nhỏ | 16-bit | 0 | -32,768 đến 32,767 |
| `int` | Số nguyên | 32-bit | 0 | -2³¹ đến 2³¹-1 |
| `long` | Số nguyên lớn | 64-bit | 0L | -2⁶³ đến 2⁶³-1 |
| `float` | Số thực đơn | 32-bit | 0.0f | ~±3.4E+38 |
| `double` | Số thực kép | 64-bit | 0.0d | ~±1.7E+308 |
| `char` | Ký tự Unicode | 16-bit | '\u0000' | 0 đến 65,535 |
| `boolean` | true/false | 1-bit | false | true hoặc false |

### 💻 Ví dụ Primitive Types

```java
byte age = 25;                  // Số nhỏ
short year = 2025;              // Số vừa
int population = 1000000;       // Số nguyên thông dụng
long distance = 9876543210L;    // Số rất lớn (cần thêm L)

float price = 99.99f;           // Số thực đơn (cần thêm f)
double pi = 3.14159265359;      // Số thực kép (chính xác hơn)

char grade = 'A';               // Ký tự đơn
boolean isPass = true;          // true/false
Khi gán b = a;, giá trị 5 được sao chép sang b (hai biến hoàn toàn riêng biệt).
```

---

## Slide 7.1 – Reference Type (Kiểu tham chiếu)

### 📦 Reference Type là gì?

**Reference Type** là kiểu dữ liệu lưu trữ **địa chỉ bộ nhớ** (tham chiếu) đến object. Lưu địa chỉ của object trong bộ nhớ, không phải giá trị thực của object.

**Đặc điểm:**
- ✅ Lưu **địa chỉ** của object trong Stack
- ✅ Object thực tế nằm trong Heap
- ✅ Kích thước **không cố định** (phụ thuộc object)
- ✅ **Có method** và thuộc tính
- ✅ Giá trị mặc định là **null**

### 🎯 Các loại Reference Type

1. **Class** (String, Scanner, Student...)
2. **Array** (int[], String[]...)
3. **Interface** (List, Map...)

### 💻 Ví dụ Reference Types

```java
String s1 = "Hello";
String s2 = s1;  // s2 không lưu "Hello", mà lưu địa chỉ nơi s1 đang trỏ tới

StringBuilder sb1 = new StringBuilder("Hi");
StringBuilder sb2 = sb1;
sb2.append(" there");
System.out.println(sb1); // In ra: "Hi there"
```

---

## Slide 7.2 – So sánh Primitive vs Reference

### 📊 Bảng so sánh

| Đặc điểm | Primitive Type | Reference Type |
|----------|----------------|----------------|
| **Lưu trữ** | Giá trị trực tiếp | Địa chỉ bộ nhớ (reference) |
| **Vị trí** | Stack | Stack (địa chỉ) + Heap (object) |
| **Giá trị mặc định** | 0, false, '\u0000' | null |
| **Kích thước** | Cố định | Không cố định |
| **So sánh** | `==` so sánh giá trị | `==` so sánh địa chỉ |
| **Có method?** | ❌ Không | ✅ Có |
| **Có thể null?** | ❌ Không | ✅ Có |
| **Tốc độ** | ⚡ Nhanh hơn | 🐢 Chậm hơn |

### 💡 Ví dụ minh họa sự khác biệt

```java
        // Primitive
        int a1 = 5;
        int b1 = a1;
        a1 = 10;
        System.out.println(a1); // 10
        System.out.println(b1); // 5

        // Reference type mutable
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = sb1;  // sb2 tham chiếu cùng object với sb1

        sb1.append(" world");     // thay đổi nội dung object

        System.out.println(sb1);  // hello world
        System.out.println(sb2);  // hello world  <-- sb2 cũng thay đổi
```

---

## Slide 7.3 – Tại sao Java chia làm 2 loại?

### 🎯 Lý do thiết kế

#### 1️⃣ **Hiệu suất (Performance)**
- **Primitive:** Truy cập trực tiếp → **Cực nhanh**
- **Reference:** Phải truy cập qua địa chỉ → Chậm hơn
- 💡 Dùng primitive cho phép tính toán nhanh hơn

#### 2️⃣ **Tiết kiệm bộ nhớ**
- **Primitive:** Chỉ lưu giá trị (4 bytes cho int)
- **Reference:** Lưu địa chỉ + object + metadata (> 16 bytes)
- 💡 Tiết kiệm RAM khi làm việc với số lượng lớn

#### 3️⃣ **Đơn giản hóa**
- **Primitive:** Dễ dùng, không cần `new`, không lo null
- **Reference:** Linh hoạt, có method, nhưng phức tạp hơn

### 💻 Ví dụ thực tế

```java
// Tính toán với primitive - nhanh, đơn giản
int sum = 0;
for (int i = 0; i < 1000000; i++) {
    sum += i;  // Cực nhanh
}

// Tính toán với Reference - chậm hơn
Integer sumObj = 0;
for (int i = 0; i < 1000000; i++) {
    sumObj += i;  // Phải boxing/unboxing → Chậm hơn
}
```


### 🔒 Hằng số – dùng từ khóa `final`

```java
final int MAX_VALUE = 100;           // Primitive constant
final String APP_NAME = "TestApp";   // Reference constant
```

⚠️ **Lưu ý:** Giá trị hằng số không thể thay đổi sau khi khởi tạo

---

## Slide 8 – Câu lệnh điều kiện (Control Flow)

### 🔀 Các loại câu lệnh

1. **`if`** – điều kiện đơn
2. **`if – else`** – chọn 1 trong 2 trường hợp
3. **`else if`** – chuỗi điều kiện
4. **`switch`** – lựa chọn theo giá trị cụ thể

### 🔑 Switch hỗ trợ

- `int`
- `char`
- `String`

### ✅ Best Practice

- ✔️ Dùng **switch** khi có nhiều case cố định
- ✔️ Luôn thêm **default** trong switch

### 💻 Ví dụ

```java
// if-else
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else {
    System.out.println("C");
}

// switch
switch (day) {
    case "Monday":
        System.out.println("Start of week");
        break;
    case "Friday":
        System.out.println("End of week");
        break;
    default:
        System.out.println("Mid week");
}
```

---

## Slide 9 – Mảng 1 chiều (1D Array)

### 📦 Định nghĩa

**Mảng** là tập hợp phần tử **cùng kiểu dữ liệu**

### 💻 Khai báo & Khởi tạo

```java
// Khai báo
int[] arr = new int[5];

// Khởi tạo
int[] nums = {1, 2, 3, 4, 5};
```

### 🔧 Thuộc tính quan trọng

```java
arr.length  // Lấy độ dài mảng
```

### 🔄 Duyệt mảng

```java
// Dùng for
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Dùng foreach
for (int num : nums) {
    System.out.println(num);
}
```

### ⚠️ Lỗi thường gặp

```java
ArrayIndexOutOfBoundsException
```

➡️ Xảy ra khi truy cập index ngoài phạm vi mảng

---

## Slide 10 – Mảng 2 chiều (2D Array)

### 📊 Định nghĩa

**Mảng 2 chiều** là **mảng của mảng**

### 💻 Khai báo & Khởi tạo

```java
// Khai báo
int[][] matrix = new int[3][4];

// Khởi tạo
int[][] m = {
    {1, 2},
    {3, 4}
};
```

### 🎯 Ứng dụng

- 📋 Bảng dữ liệu
- 🔢 Ma trận
- 📊 Grid layout

### 🔄 Duyệt mảng 2 chiều

```java
// Dùng 2 vòng for lồng nhau
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## Slide 11 – Hàm (Method) trong Java

### 🎯 Mục đích

- ♻️ **Tái sử dụng** logic
- 🔧 **Tách biệt** chức năng
- 📉 **Giảm** code lặp

### 💻 Cú pháp

```java
returnType methodName(params) {
    // code
    return value;
}
```

### 📥 Truyền tham số

⚠️ **Java sử dụng pass-by-value**

```java
public void printName(String name) {
    System.out.println(name);
}
```

### 🔄 Method Overloading

**Cùng tên method** nhưng **khác số lượng hoặc kiểu tham số**

```java
public int sum(int a, int b) {
    return a + b;
}

public double sum(double a, double b) {
    return a + b;
}

public int sum(int a, int b, int c) {
    return a + b + c;
}
```

### ✅ Best Practice

- ✔️ Mỗi method chỉ làm **1 nhiệm vụ**
- ✔️ Tên method dùng **camelCase** và **rõ nghĩa**
- ✔️ Method không quá dài (< 20 dòng)

### 💡 Ví dụ thực tế

```java
// Tính tổng mảng
public int calculateSum(int[] numbers) {
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return sum;
}

// Kiểm tra số chẵn
public boolean isEven(int number) {
    return number % 2 == 0;
}
```

---

## Slide 12 – Tổng kết

### 🎓 Java Basic – Nền tảng gồm

1. ✅ **Biến & Kiểu dữ liệu**
   - Local, Instance, Static variables
   - Primitive types: int, double, char, boolean

2. ✅ **Điều kiện**
   - if-else, else if
   - switch-case

3. ✅ **Mảng**
   - Mảng 1 chiều (1D Array)
   - Mảng 2 chiều (2D Array)

4. ✅ **Hàm (Method)**
   - Khai báo & sử dụng
   - Overloading
   - Best practices

### 🚀 Đây là nền móng để học

- 🔧 **Selenium WebDriver**
- 🎨 **OOP (Object-Oriented Programming)**
- 🤖 **Test Automation Framework**

---

## Slide 13 – Bài tập thực hành tổng hợp

### 🎯 Mục tiêu
Ứng dụng **tất cả kiến thức** đã học: Variables, Data Types, Control Flow, Arrays, Methods

---

### 📝 **BÀI TẬP 1: Quản lý điểm sinh viên**

**Yêu cầu:**
1. Tạo mảng lưu điểm của 5 sinh viên
2. Tính điểm trung bình
3. Tìm điểm cao nhất, thấp nhất
4. Đếm số sinh viên đạt (>= 5.0) và không đạt

**Áp dụng kiến thức:**
- ✅ Mảng 1 chiều (int[] hoặc double[])
- ✅ Vòng lặp for
- ✅ Câu lệnh if-else
- ✅ Local variables

**Gợi ý code:**
```java
public class StudentScore {
    public static void main(String[] args) {
        // TODO: Khai báo mảng điểm
        // TODO: Tính điểm trung bình
        // TODO: Tìm max, min
        // TODO: Đếm số sinh viên đạt/không đạt
    }
}
```

---

### 📝 **BÀI TẬP 2: Calculator với Method Overloading**

**Yêu cầu:**
1. Tạo class `Calculator` với static variable đếm số lần tính toán
2. Viết method `calculate()` với overloading:
   - `calculate(int a, int b)` → cộng 2 số
   - `calculate(int a, int b, int c)` → cộng 3 số
   - `calculate(double a, double b)` → cộng 2 số thực
3. Mỗi lần gọi method, tăng biến đếm
4. Hiển thị tổng số lần tính toán

**Áp dụng kiến thức:**
- ✅ Static variable (counter)
- ✅ Method overloading
- ✅ Primitive types (int, double)
- ✅ Return type

**Gợi ý code:**
```java
public class Calculator {
    static int calculationCount = 0;

    // TODO: Implement calculate methods with overloading
    // TODO: Increment calculationCount in each method
    // TODO: Create main method to test
}
```

---

### 📝 **BÀI TẬP 3: Phân loại học lực**

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

**Gợi ý code:**
```java
public class GradeClassifier {
    public static String classifyGrade(double score) {
        // TODO: Validate score (0-10)
        // TODO: Classify using if-else or switch
        // TODO: Return classification string
    }

    public static void main(String[] args) {
        // TODO: Test with different scores
    }
}
```

---

### 📝 **BÀI TẬP 4: Ma trận và tính tổng**

**Yêu cầu:**
1. Tạo ma trận 3x3
2. Tính tổng tất cả phần tử
3. Tính tổng từng hàng
4. Tính tổng từng cột
5. Tìm phần tử lớn nhất trong ma trận

**Áp dụng kiến thức:**
- ✅ Mảng 2 chiều
- ✅ Vòng lặp lồng nhau
- ✅ Method với mảng làm tham số
- ✅ Local variables

**Gợi ý code:**
```java
public class MatrixCalculator {
    public static int sumAll(int[][] matrix) {
        // TODO: Calculate sum of all elements
    }

    public static void sumRows(int[][] matrix) {
        // TODO: Calculate sum of each row
    }

    public static void sumColumns(int[][] matrix) {
        // TODO: Calculate sum of each column
    }

    public static int findMax(int[][] matrix) {
        // TODO: Find maximum element
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // TODO: Test all methods
    }
}
```

---

### 📝 **BÀI TẬP 5: Kiểm tra số nguyên tố**

**Yêu cầu:**
1. Viết method kiểm tra số nguyên tố
2. Tìm tất cả số nguyên tố từ 1 đến N
3. Lưu vào mảng và in ra
4. Đếm số lượng số nguyên tố tìm được

**Áp dụng kiến thức:**
- ✅ Method với return type boolean
- ✅ Vòng lặp for
- ✅ if-else
- ✅ Mảng động (hoặc đếm trước)
- ✅ Static variable để đếm

**Gợi ý code:**
```java
public class PrimeNumber {
    static int primeCount = 0;

    public static boolean isPrime(int number) {
        // TODO: Check if number is prime
        // Hint: Check divisibility from 2 to sqrt(number)
    }

    public static void findPrimes(int n) {
        // TODO: Find all primes from 1 to n
        // TODO: Store in array and print
    }

    public static void main(String[] args) {
        findPrimes(50);
        System.out.println("Total primes found: " + primeCount);
    }
}
```