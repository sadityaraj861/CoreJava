package Basic;

public class StringBufferBuilder {
    public static void main(String[] args) {
        String s1 = new String("HELLO");
        StringBuffer s2 = new StringBuffer("HELLO ");  //
        StringBuilder s3 = new StringBuilder("HELLO ");

        s1.concat("world");
        s2.append("world");// (MULTITHREAD FREE)
        s3.append("world"); // append ka matlab hota hai , present string ke array me jor deta hai.(NOT MULTI-THREAD FREE)

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
