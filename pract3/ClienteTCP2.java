import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteTCP2 throws IOException {
    public static void main(String[] args) {
        Socket s = new Socket("wwww.upv.es", 81);
        System.out.println("Conectado");
        s.close();
    }
}
