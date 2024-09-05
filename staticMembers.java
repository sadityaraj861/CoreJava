package Basic;
class HondaCity{
    int a,b;               // INSTANCE VARIABLE
    static long price = 10;   // STATIC VARIABLE

    static double OnRoadPrice(String city){
        switch (city){
            case "delhi":
                return price+price*0.1;
            case "mumbai":
                return price + price * 0.09;
            default:
                return -1;
        }
    }
}


public class staticMembers {
    public static void main(String[] args) {
        System.out.println(HondaCity.OnRoadPrice("mumbai"));
        System.out.println(HondaCity.OnRoadPrice("bangalore"));

    }
}
