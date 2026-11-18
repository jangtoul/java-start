package array.ex;

// 문제 - 합계와 평균2
// 이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.
// (사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자.)

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int size = scanner.nextInt();

        System.out.println(size + "개의 정수를 입력하세요:");

        int[] numbers = new int[size];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double)sum / numbers.length;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
