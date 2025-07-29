package NetworkProgramming;
import java.net.*;
import java.io.*;


public class ReverseEchoServer {
    public static void main(String[] args) throws Exception{

        ServerSocket ss= new ServerSocket(2000); //port number as a  input.
        Socket skt = ss.accept(); //accept() returns Socket type.

        //we have to read character from our keyboard so we are using BufferedReader for characters
        BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps = new PrintStream(skt.getOutputStream());

        String msg;
        StringBuilder sb;

        do{
            msg=br.readLine();

            sb = new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();

            ps.println(msg);
        }while(!msg.equals("dne")); // runs till we type "end".

        skt.close();
    }
}
