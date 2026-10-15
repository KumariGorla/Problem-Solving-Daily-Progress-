class PeakEle {
   public static void main(String[] args) {
        int arr[] = {0,10,5,2};
        int res = BinSearch(arr);
        System.out.println(res); 
    }
    static int BinSearch(int arr[]){
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){


                
                end = mid;
                
            }
            else{
                
                start  = mid + 1;
            }
        }
        return end;

    }
    
}
