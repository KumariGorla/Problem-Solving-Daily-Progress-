import java.util.ArrayList;

public class substr {
    public static void main(String[] args) {
        String s = "Kumari";
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<s.length();j++){
                String temp = " ";
                for(int k = i;k<j;k++){
                    temp += s.charAt(k);
                    
                }
                arr.add(temp);
                
            }
        }
        System.out.println(arr);
    }
}
