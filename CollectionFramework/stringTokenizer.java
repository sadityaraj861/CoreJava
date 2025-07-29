package CollectionFramework;
import java.io.FileInputStream;
import java.util.*;

public class stringTokenizer {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("C:/Users/Aditya raj/Documents/pro.txt");
        byte[] b = new byte[fis.available()];
        fis.read(b);

        String data = new String(b);


        StringTokenizer st = new StringTokenizer(data,"=");
 //       StringTokenizer st = new StringTokenizer("Name=Aditya;Address=Patna;Age=19","=;");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        System.out.println();
// WE CAN ALSO USE .split() method of String or the java.util.regex package.

        String[] str = new String("this is a test").split(" "); // we can also use space as a delimeter.
        for(String x:str){
            System.out.println(x);
        }

    }
}
