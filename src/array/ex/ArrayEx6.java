package array.ex;

// 문제 - 가장 작은 수, 큰 수 찾기
// 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자.

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int min = 0;
        int max = 0;

        System.out.println(size + "개의 정수를 입력하세요:");
        for(int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();

            if(i == 0){
                min = numbers[i];
                max = numbers[i];
            } else if(numbers[i] < min){
                min = numbers[i];
            } else if(numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
