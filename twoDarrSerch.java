//import java.util.*;
//class twoDarrSerch{ 
//    public static void main(String[] args) {
//        int r = 3, c = 3,target = 91;
//        int arr[][] = new int[r][c];
//        Scanner sc = new Scanner(System.in);
//        for(int i = 0;i<r;i++){
//            for(int j = 0;j<r;j++){
//                int num = sc.nextInt();
//                arr[i][j] = num;
//            }
//        }//

//        for(int i = 0;i<r;i++){
//            for(int j = 0;j<r;j++){
//                if(arr[i][j] == target){
//                    System.out.println("Found at index: "+i+","+j);//

//                break;
//            }
//        }
//        
//    }
//}
//}

//Brute force Approch
import java.util.*;
class twoDarrSerch {
    public static void main(String[] args) {
        int arr[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int[] res = serch(arr,50);
        System.out.println(Arrays.toString(res));
    }
    static int[] serch(int arr[][], int target){
        int r = 0;
        int c = arr.length-1;
        while(r<c && c>=0){
            if(arr[r][c] == target){
                return new int[]{r,c};
                
            }
            if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{r,c};
    }
}