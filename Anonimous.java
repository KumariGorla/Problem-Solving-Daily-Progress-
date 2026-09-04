class A{
    public  void show(){
        System.out.println("in Show");
    }
}
public class Anonimous{
    
    public static void main(String args[]){
        A obj = new A()
        {
            public void show(){
                System.out.println("In Show1");
            }

        };
        obj.show();
    }
}