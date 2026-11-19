package method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1번 메서드 호출: " + add(1, 2));
        System.out.println("2번 메서드 호출: " + add(1, 2, 3));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }
}
