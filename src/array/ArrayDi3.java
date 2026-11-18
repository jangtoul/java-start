package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 2차원 배열 초기화
        int[][] arr = new int[2][3];

        int i = 1;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = i++;
            }
        }

        // 배열 출력
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
