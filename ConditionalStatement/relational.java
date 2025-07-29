package ConditionalStatement;


//  ConditionalStatement uses relational operator for finding its forward route .  {based on :true/false}


public class relational {
    public static void main(String[] args) {


        float a = 10.3f;
        float c = 20.4f;
        float b = 267.4f;
        int f = 10;

        System.out.println(a>c);
        System.out.println(b>c);
        System.out.println(a>c && b>c);
        System.out.println(a<c && b>c);


        int n = -5;

        if(n>0){
            System.out.println("POSITIVE VALUE ");
        }
        else {
            System.out.println("negative value ");
        }

    }
}
