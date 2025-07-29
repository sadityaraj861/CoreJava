package Methods;

public class PascalTringle {
    public static void main(String[] args) {
        CombiAndPermu obj= new CombiAndPermu();
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                System.out.print(obj.combination(i,j)+" ");
            }
            System.out.println();
        }
    }
}
