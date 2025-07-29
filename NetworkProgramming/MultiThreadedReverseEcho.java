package NetworkProgramming;
import java.io.*;
import java.net.*;

public class MultiThreadedReverseEcho extends Thread{

    Socket skt;
    public MultiThreadedReverseEcho(Socket Portno){
        skt=Portno;
    }

    public void run(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
            PrintStream ps=new PrintStream(skt.getOutputStream());

            String msg;
            StringBuilder sb;
            do{
                msg=br.readLine();

                sb= new StringBuilder(msg);
                sb.reverse();
                msg=sb.toString();
                ps.println(msg);
            }while(!msg.equals("dne"));
            skt.close();
        }catch(Exception e){}

    }


    public static void main(String[] args) throws Exception{

        ServerSocket ss=new ServerSocket(2000);

        Socket skt;
        MultiThreadedReverseEcho re;

        do{
            skt = ss.accept();
            System.out.println("Clint Connected..");

            re=new MultiThreadedReverseEcho(skt);
            re.start();
        }while(true);




    }
}

class Clint{
    public static void main(String[] args)throws Exception {
        Socket skt= new Socket("192.168.0.103",2000);

        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps = new PrintStream(skt.getOutputStream());
        String msg;

        do{
            msg= keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server"+msg);
        }while(!msg.equals("dne"));
        skt.close();
    }
}
