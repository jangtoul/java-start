package method.ex;

// 문제 - 평균값 리펙토링
// 메서드를 잘 이해하고 있는지 확인하기 위해 다음 코드를 메서드를 사용하도록 리펙토링해보자.

public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println("평균값: " + average(1, 2, 3));
        System.out.println("평균값: " + average(15, 25, 35));
    }

    public static double average(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum / 3.0;
    }
}
