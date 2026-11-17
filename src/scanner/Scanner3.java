package scanner;

// Scanner 예제3
// 사용자로부터 두 개의 정수를 입력 받고, 더 큰 수를 출력하는 프로그램을 작성해보자. 두 숫자가 같은 경우 두 숫자는 같다고 출력하면 된다.
// 조건문을 사용해서 처리할 수 있다.

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if(num1 == num2){
            System.out.println("두 숫자는 같습니다");
        } else {
            int max = (num1 > num2) ? num1 : num2;
            System.out.println("더 큰 숫자: " + max);
        }
    }
}
