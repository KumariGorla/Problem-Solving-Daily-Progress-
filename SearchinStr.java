import java.util.Arrays;

public class SearchinStr {
    public static void main(String[] args) {
        String s = "Nayana";
        char c = 'n';
        boolean res = SearchInStr(s,c);
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(res);
    }
    static boolean SearchInStr(String s,int tarstr){
        if(s.length()==0) return false;
        //for(int i = 0;i<s.length();i++){
        //    if(s.charAt(i)==tarstr) return true;
        //}
        //return false;

        for(char c:s.toCharArray()){
            if(tarstr == c) return true;
        }
        return false;

    }
}
