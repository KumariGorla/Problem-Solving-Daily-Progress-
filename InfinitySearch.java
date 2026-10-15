class InfinitySearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,10,11,12,13,15,23,24,30};
        int target = 4;
        int res = ans(arr,target);
        System.out.println(res);
    }
    static int ans(int arr[],int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start+1)*2;
            start = temp;
        }
        return BinSearch(arr,target,start,end);
    } 
    static int BinSearch(int arr[], int target, int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
                
            }else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    
    }
    
}