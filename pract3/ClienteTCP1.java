import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteTCP1 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("www.upv.es", 80);
        System.out.println("Conectado");
        s.close();
    }
}
