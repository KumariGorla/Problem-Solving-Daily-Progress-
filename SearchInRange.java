public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {2,-2,5,6,7,8,9,90};
        boolean res  = SerchRnage(arr,4,8,90);  
        System.out.println(res);  
    }
    static boolean SerchRnage(int[] arr,int start ,int end, int ele){
        if(arr.length==0) return false;
        for(int i = start;i<end;i++){
            if(ele == arr[i]) return true;
        }
        return false;
    }
}
