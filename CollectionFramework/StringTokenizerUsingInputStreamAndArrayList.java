package CollectionFramework;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerUsingInputStreamAndArrayList {
    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("C:/Users/Aditya raj/Documents/numbers.txt");
        byte[] b = new byte[fis.available()];
        fis.read(b);

        String data = new String(b);
        StringTokenizer stk = new StringTokenizer(data,",");

        String s;
        ArrayList<Integer> al = new ArrayList<>();

        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            //al.add(Integer.decode(s));
            al.add(Integer.valueOf(s));
        }
        System.out.println(al);
       // al.forEach(x-> System.out.println(x));

    }
}
