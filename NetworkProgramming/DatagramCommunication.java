package NetworkProgramming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

//clintClass.
public class DatagramCommunication {
    public static void main(String[] args) throws Exception{

        DatagramSocket ds = new DatagramSocket(2001);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String msg = br.readLine();
        DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);

        ds.send(dp);

        byte[] b =new byte[1024];
        dp=new DatagramPacket(b,1024);
        ds.receive(dp);

        msg = new String(dp.getData()).trim();
        System.out.println("from server "+msg);

        ds.close();


    }
}

class Server {
    public static void main(String[] args) throws Exception{

        DatagramSocket ds = new DatagramSocket(2000);

        byte b[]=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b,1024);
        ds.receive(dp);

        String msg = new String(dp.getData()).trim();
        System.out.println("from clint "+msg);
        StringBuilder sb = new StringBuilder(msg);
        sb.reverse();
        msg= sb.toString();


        dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);

        ds.send(dp);

        ds.close();
    }
}
