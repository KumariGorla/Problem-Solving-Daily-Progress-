//Functiona Interface
@FunctionalInterface
interface S{
    void show();
    
}
public class FunctnalInterfce {
    public static void main(String[] args) {
        S obj = new S() {
            public void show(){
                System.out.println("In A show");
            }
        }; 
        obj.show();
    }
}
