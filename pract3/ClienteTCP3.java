import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteTCP3 {
    public static void main(String[] args) throws IOException {
        try{
            Socket s = new Socket("www.upv.es", 80);
            System.out.println("Conectado");
	    System.out.println(s.getPort());
	    System.out.println(s.getInetAddress());
	    System.out.println(s.getLocalPort());
	    System.out.println(s.getLocalAddress());
            s.close();
        } catch (Exception e) {
            System.out.println("No se ha establezido la conexión");
        } 
    }
}
