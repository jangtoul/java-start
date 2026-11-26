package operator;

public class Comp1 {
    public static void main(String[] args) {
        String s1 = "string1";
        String s2 = "string2";

        boolean result1 = "Hello".equals("Hello");  // 리터럴 비교
        boolean result2 = s1.equals("string1");  // 문자열 변수와 리터럴 비교
        boolean result3 = s1.equals(s2);  // 문자열 변수 비교

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
