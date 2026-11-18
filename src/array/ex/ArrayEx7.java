package array.ex;

// 문제 - 2차원 배열1
// 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
// 2차원 배열을 사용하고, 실행 결과 예시를 참고하자.

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"국어", "수학", "영어"};
        int[][] students = new int[4][subjects.length];

        for(int i = 0; i < students.length; i++){
            System.out.println((i + 1) + "번 학생의 점수를 입력하세요: ");
            for(int j = 0; j < subjects.length; j++){
                System.out.print(subjects[j] + "점수: ");
                students[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < students.length; i++){
            int sum = 0;
            for(int j = 0; j < students[i].length; j++){
                sum += students[i][j];
            }
            double average = (double)sum / students[i].length;
            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
