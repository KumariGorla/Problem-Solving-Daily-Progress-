import java.util.*;
public class KScores{
    public static void main(String[] args) {
        int arr[] = {1, 4,  7,9};
        int res = KScoresans(arr,2);
        System.out.println(res);  
    }
    static int  KScoresans(int arr[],int k){
        Arrays.sort(arr);
        int l = 0;
        int ans = 0;
        for(int r = 0;r<arr.length;r++){
            if(r-l==k){
                l++;
            }
            if(r-l+1==k){
                int temp  = arr[r] - arr[l];
                ans = Math.min(ans,temp);
                
            }
        }
        return ans;
    }
}