enum Status{
    Running, Failed, Success,Pending;

    

}
public class enumpr {
    public static void main(String args[]){
        
        //Status s = Status.Running;
        //System.out.println(s.ordinal());
        


        Status  s = Status.Success;
        switch(s){
            case Running:
                System.out.println("Working");
                break;
            case Failed:
                System.out.println("Not working");
                break;
            case Success:
                System.out.println("Completed");
                break;
            case Pending:
                System.out.println("Pending! Need Update");
                break;
            default:
                System.out.println("Nothing");
                break;
        }
    }
}
