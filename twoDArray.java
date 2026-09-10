import java.util.*;
public class twoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        //Input array
        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr.length;col++){
                int num = sc.nextInt();
                arr[row][col] = num;
            }
        }
        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr.length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

    }
}
