import java.util.HashMap;

public class HmAngrm {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> hms = new HashMap<>();
        //hm.put(3,4);
        //hm.put(2,8);
        //hm.put(4,3);
        //hm.put(6,7);

        //Hashmap 2 values Insertion

        //hm2.put(6,7);
        //hm2.put(2,8);
        //hm2.put(4,3);
        //hm2.put(3,4);

        String s = "abcda";
        String s1 = "dcbaae";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);

        }

        

        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            hms.put(ch,hms.getOrDefault(ch,0)+1);

        }
        

        System.out.println(fun(hm,hms));
    }
    static boolean fun(HashMap<Character,Integer> hms,HashMap<Character,Integer>hml){
        //Base Case
        if(hms.size()!=hml.size()){
            return false;
        }
        
        for(Character i:hms.keySet()){
            if(hml.containsKey(i)){
                return true;
                
            }
        }
        return false;
    }
}
