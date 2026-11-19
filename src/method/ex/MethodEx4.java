package method.ex;

// 문제 - 은행 계좌 입출금
// 다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자.
// 또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자
// 출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;

        while(true){
            // 0. 메뉴 출력
            System.out.println("======================================");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("======================================");

            // 1. 사용자 메뉴 선택
            System.out.print("선택: ");
            int option = scanner.nextInt();

            // 2. 입금
            if(option == 1){
                System.out.print("입금액을 입력하세요: ");
                int depositAmount = scanner.nextInt();
                balance = deposit(balance, depositAmount);
            }

            // 3. 출금
            if(option == 2){
                System.out.print("출금액을 입력하세요: ");
                int withdrawAmount = scanner.nextInt();
                balance = withdraw(balance, withdrawAmount);
            }

            // 4. 잔액 확인
            if(option == 3){
                System.out.println("현재 잔액: " + balance + "원");
            }

            // 5. 종료
            if(option == 4){
                System.out.println("시스템을 종료합니다");
                break;
            }
        }
    }

    public static int deposit(int balance, int depositAmount){
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다, 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount){
        if(balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다, 현재 잔액 " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다");
        }
        return balance;
    }
}
