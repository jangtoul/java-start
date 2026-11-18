package array.ex;

// 문제 - 2차원 배열2
// 이전 문제에서 학생수를 입력받도록 개선하자.

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int size = scanner.nextInt();

        String[] subjects = {"국어", "수학", "영어"};
        int[][] students = new int[size][subjects.length];

        for(int i = 0; i < students.length; i++){
            System.out.println((i + 1) + "번 학생의 점수를 입력하세요: ");
            for(int j = 0; j < subjects.length; j++){
                System.out.print(subjects[j] + "점수: ");
                students[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < students.length; i++){
            int sum = 0;
            double average;
            for(int j = 0; j < students[i].length; j++){
                sum += students[i][j];
            }
            average = (double)sum / students[i].length;
            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
