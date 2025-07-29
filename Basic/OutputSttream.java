import java.io.FileOutputStream;


public class OutputSttream {
    public static void main(String[] args) {

        try{
            FileOutputStream f1 = new FileOutputStream("\"D:\\mislaneous\\FileOutputStream.txt\"");
            f1.write(65);
            f1.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
