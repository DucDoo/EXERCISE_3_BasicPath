package org.example;

public class AverageCalculator {

    // Hàm tính trung bình của các giá trị trong mảng value, với điều kiện nằm trong khoảng [minimum, maximum]
    public int average(int[] value, int minimum, int maximum) {
        int i = 0;
        int inputNumber = 0;
        int validNumber = 0;
        int sum = 0;

        // Vòng lặp qua các giá trị trong mảng
        while ((i < value.length) && (value[i] != -999) && (inputNumber < 100)) {
            inputNumber++;

            // Kiểm tra điều kiện giới hạn giá trị
            if ((value[i] >= minimum) && (value[i] <= maximum)) {
                validNumber++;
                sum += value[i];
            }
            i++;
        }

        // Tính trung bình nếu có giá trị hợp lệ
        if (validNumber > 0) {
            return sum / validNumber;
        } else {
            return -999; // Trả về -999 nếu không có giá trị hợp lệ
        }
    }
}