package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;  // INT 최고값
        long maxIntOver = 2147483648L;  // INT 최고값 + 1
        int intValue = 0;

        intValue = (int)maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int)maxIntOver;
        System.out.println("maxIntOver casting = " + intValue);
    }
}
