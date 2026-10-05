enum Laptop{
    MacBook(2000),Samsung(1500),hp(1200),mi(1000);
    private int price;


    private Laptop(int price){
        this.price = price;
    }

    public  int getPrice(){
        return price;
    }
    public void SetPrice(int price){
        this.price = price;
    }

}
public class getsetters {

    public static void main(String[] args) {
        //Laptop lp = Laptop.Samsung;
        //System.out.println(lp+":"+lp.getPrice());

        for(Laptop lap:Laptop.values()){
            System.out.println(lap+":"+lap.getPrice());
        }
    }
}
