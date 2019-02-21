import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteEco {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("zoltar.redes.upv.es", 7);
	Scanner lee = new Scanner(s.getInputStream());
	PrintWriter write = new PrintWriter(s.getOutputStream(), true);

        write.println("¡¡Hola, mundo!!");
        System.out.println(lee.nextLine());
        s.close();
        lee.close();
	write.close();
    }
}
