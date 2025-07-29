package LamdaExp;

@FunctionalInterface
interface MyLam{
    public float val(int a,int b);
}
public class Mathoperation {
    public static void main(String[] args) {
        MyLam add=(a,b)->a+b;  //-> denotes lambda and (a+b) is expression so becomes lambdaExpression.
        MyLam sub=(a,b)->a-b;
        MyLam mul=(a,b)->a*b;
        MyLam div=(a,b)->a/b;

        System.out.println(add.val(3,4));
        System.out.println(sub.val(3,4));
        System.out.println(mul.val(3,4));
        System.out.println(div.val(4,3));

    }
}
