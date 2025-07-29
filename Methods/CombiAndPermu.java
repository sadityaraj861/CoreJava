package Methods;

public class CombiAndPermu {
    public  int fact(int a){
        int fac=1;
        for(int i=1;i<=a;i++){
            fac *=i;
        }
        return fac;
    }
    public  int combination(int n,int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
    public  int permutation(int n,int r){
        return fact(n)/fact(n-r);
    }
    public static void main(String[] args) {
        CombiAndPermu obj = new CombiAndPermu();
//        Permutation
//                nCr = n! / r!* (n-r)!
        System.out.println(obj.combination(5,2));
        System.out.println(obj.permutation(5,2));
    }
}
