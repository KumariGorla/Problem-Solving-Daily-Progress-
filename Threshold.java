public class Threshold{
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4};
        int n = arr.length;
        int cnt  = 0;
        int threshold_val = 6;
        //Brut e force Approcah
        //for(int i = 0;i<=n;i++){
        //    for(int j = i+1;j<n;j++){
        //        for(int k = i;k<=j;k++){
        //            
        //            sum += arr[k];
        //            
        //        }
        //        System.out.println(arr[i]+","+arr[j]+"->"+"sum = "+sum);
        //        if(sum == threshold_val) cnt++;
        //        sum = 0;
        //        
        //    }

        //}
        //System.out.println(cnt);

        //Optimal Approach using two pointers and sliding window pattern
        int l = 0;
        int temp = 0;
        for(int r = 0;r<n;r++){
            temp += arr[r];
            if(temp == threshold_val) cnt++;
            if(r-l+1==3){
                //If the length of the array is 3
                //Remove the left pointer element from the temp
                temp -= arr[l];
                l++;
                

            }
            
        }
        System.out.println(cnt);
    }
}