class KumException extends Exception{
    public KumException (String string){
        super(string);
    }
}
public class exception {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        //throw keyword usage
        try {
            j = 18/i;
            if(j==0)
                throw new KumException("You got the Exception.");
        }catch(Exception e){
            System.out.println("Cannot divide by zero:"+e);
        }
        System.out.println(j);


        //throws keyword usage

           
        }
    }
}
