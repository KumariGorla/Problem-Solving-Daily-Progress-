public class Linear{
    public static void main(String[] args) {
        int[] nums = {1,3,46,7,90};
        int target = 90;
        boolean res = LinearSearch(nums, target);
        System.out.println(res);

    }
    static boolean LinearSearch(int arr[],int target){
        if(arr.length==0){
            return false;
        }
        for(int ele:arr){
            if(ele==target) return true;
        }
        return false;
    }
}